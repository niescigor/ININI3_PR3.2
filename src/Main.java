public class Main {


        public static void main(String[] args){
        Car car = new Car("Vw", "Passat", 2010);
        Phone phone = new Phone("Apple", "12 Mini", 2021);

        System.out.println(car);
        System.out.println(phone);

        car.turnOn();
        phone.turnOn();

    }
}