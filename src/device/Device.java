package device;

public abstract class Device {
    public String producer;
    public String model;
    public Integer yearOfProduction;


    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    @Overrride
    public String toString() {
        return "device.Device{" +
                ",producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void turnOn();
}
