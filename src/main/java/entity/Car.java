package entity;

public class Car {
    private Long id;
    private String brand;
    private int yearOfManufacture;
    private String color;

    public Car(Long id, String brand, int yearOfManufacture, String color) {
        this.id = id;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", color='" + color + '\'' +
                '}';
    }
}