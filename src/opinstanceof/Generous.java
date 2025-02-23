package opinstanceof;

/**
 * Generoso
 */
interface Generous {
    void give();
}

/**
 * Dadivoso (explendoroso)
 */
interface Munificient extends Generous {
    void giveALot();
}

class Giver {

}

class GenerousGiver extends Giver implements Generous {
    @Override
    public void give() {
    }
}

class MunificientGiver extends Giver implements Munificient {

    @Override
    public void giveALot() {
    }

    @Override
    public void give() {
    }
}

/**
 * Tacaño
 */
final class StingyGiver extends Giver {}
