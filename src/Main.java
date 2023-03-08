public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1 ");
        Car car = new Car(4, " car 1 ");
        Car car2 = new Car(4, " car 2 ");

        Truck truck = new Truck(6, " truck 1 ");
        Truck truck2 = new Truck(6, " truck 2 ");

        Bicycle bicycle = new Bicycle(2, " bicycle 1 ");
        Bicycle bicycle2 = new Bicycle(2, " bicycle 2 ");


        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}