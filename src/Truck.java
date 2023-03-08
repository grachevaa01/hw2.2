public class Truck extends Total {
    public Truck (int wheelsCount, String modelName) {
        super (wheelsCount, modelName);
    }

        public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }

        public void checkTrailer() {
            System.out.println("Проверяем прицеп");
        }
    }

