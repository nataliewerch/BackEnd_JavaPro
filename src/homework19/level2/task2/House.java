package homework19.level2.task2;

public class House {
    private final String street;
    private final int number;
    private double price;
    private final int buildingYear;

    public House(String street, int number, double price, int buildingYear) {
        this.street = street;
        this.number = number;
        this.price = price;
        this.buildingYear = buildingYear;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public int getBuildingYear() {
        return buildingYear;
    }

    @Override
    public String toString() {
        return "" +
                "street= " + street +
                ", number=" + number +
                ", price=" + price +
                ", buildingYear=" + buildingYear + "; ";
    }
}
