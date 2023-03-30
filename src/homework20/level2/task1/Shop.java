package homework20.level2.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {
    private String name;
    private String address;
    private double workTo;
    List<Product> products;

    public Shop(String name, String address, double workTo, List<Product> products) {
        this.name = name;
        this.address = address;
        this.workTo = workTo;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getWorkTo() {
        return workTo;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Double.compare(shop.workTo, workTo) == 0 && Objects.equals(name, shop.name) && Objects.equals(address, shop.address) && Objects.equals(products, shop.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, workTo, products);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", workTo=" + workTo +
                ", products=" + products +
                '}';
    }
}
