package intro.badsolutions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Clase de utilidad
 */
public class Walkables {

    /**
     * Al declarar el parámetro de entrada como un array de Person el compilador se asegura que
     * llamar al método walk es válido, porque un objeto de tipo Person
     * responde al mensaje "walk"
     */
    public static void letThemWalk(Person[] list) {
        for (int i = 0; i < list.length; i++) {
            Person person = list[i];
            person.walk();
        }
    }

    /**
     * Ahora si queremos poner a caminar a objetos de otra clase, además de persona.
     * Tenemos que cambiar el tipo de parámetro del método array de Person por array de Object
     * y utilizar la reflexión
     */
    public static void letThemWalk(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            try {
                Method walkMethod = getWalkMethod(objects[i]);
                if (walkMethod != null) {
                    walkMethod.invoke(objects[i]); // Llama al método por reflexión
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Busca por reflexión un método en la lista de métodos de la clase del objeto proporcionado
     * como argumento que se llame "walk" y devuelve una referencia al objeto Method
     * si no lo encuentra provoca una excepción NoSuchMethodException
     */
    public static Method getWalkMethod(Object object) {
        Class<?> clazz = object.getClass();
        Method walkMethod = null;
        try {
            walkMethod = clazz.getMethod("walk");
            return walkMethod;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return walkMethod;
    }

}
