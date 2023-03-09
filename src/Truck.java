public class Truck extends Car {
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

