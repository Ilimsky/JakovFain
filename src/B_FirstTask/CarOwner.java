package B_FirstTask;

public class CarOwner {
    public static void main(String[] args) {
        Car car = new Car();
        JamesBondCar jamesBondCar = new JamesBondCar();

        car.start();
        System.out.println(car.drive(2) + " kilometers");
        System.out.println(jamesBondCar.drive(2) + " kilometers");
        car.stop();
    }

}
