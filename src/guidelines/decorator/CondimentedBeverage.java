package guidelines.decorator;

/**
 * El condimento recibe la interfaz por la clase Beverage mediante herencia "es-una"
 * pero, la implementación (comportamiento) la obtiene por composición, no reusa desde la clase base
 * reusa mediante el uso del componente (delegación)
 * La herencia se usa para la sustitución, para dar un nuevo tipo de dato a CondimentBeverage
 * para que un CondimentBeverage sea considerado un tipo de Beverage
 * pero para el comportamiento se usa la composición "tiene-un" Beverage y se delega en este objeto
 * NOTA: Como la Beverage no es creada en el constructor de la clase
 * sino que es proporcionada con una referencia como parámetro del constructor
 * estrictamente hablando no podemos hablar de composición sino de agregación
 */
public abstract class CondimentedBeverage extends Beverage {

    /**
     * Agregación: Un condimento "tiene-una" bebida
     */
    protected Beverage beverage;

    /**
     * En el constructor se "inyecta" la referencia a la bebida
     * Puede ser cualquier tipo de bebida, incluso una bebida condimentada,
     * ya que una CondimentedBeverage es un tipo de Beverage
     */
    public CondimentedBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    protected abstract String getName();

    /**
     * No se hace uso de la implementación heredada: super.getDescription()
     * El comportamiento llega desde la composición, el componente beverage
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + getName();
    }
}
