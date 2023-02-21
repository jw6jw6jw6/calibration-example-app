public class MainClass {

    public static void main(String args[]) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        printNumWheels(car);
        printNumWheels(motorcycle);

        recursionExample(0);
    }

    public static void printNumWheels(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getCanonicalName()+" has "+vehicle.numberOfWheels()+" wheels");
    }

    public static void recursionExample(int a) {
        System.out.println(a);
        if(a<10)
            recursionExample(a+1);
    }
}