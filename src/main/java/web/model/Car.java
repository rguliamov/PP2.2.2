package web.model;

/**
 * @author Guliamov Rustam
 */
public class Car {

    private final String model;

    private final String age;

    private final String owner;

    public Car(String model, String age, String owner) {
        this.model = model;
        this.age = age;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public String getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + age + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
