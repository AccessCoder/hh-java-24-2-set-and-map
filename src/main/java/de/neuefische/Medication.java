package de.neuefische;

public class Medication {

    private String name;
    private String availability;
    private double price;

    public Medication(String name, String availability, double price) {
        this.name = name;
        this.availability = availability;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAvailability() {
        return availability;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", availability='" + availability + '\'' +
                ", price=" + price +
                '}';
    }
}
