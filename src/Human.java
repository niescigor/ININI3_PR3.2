public class Human extends Animal{
    String firstName;
    String lastName;
    Car car;
    Phone phone;
    Animal pet;
    Double salary;
    Double cash;

    public Human(String firstname) {
        super("homo sapiens");
        this.weight = 70.0;
        this.salary = 0.0;
        this.firstName = firstName;
    }
}