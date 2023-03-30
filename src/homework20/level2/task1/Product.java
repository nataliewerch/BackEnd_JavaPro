package homework20.level2.task1;

import java.util.Objects;

public class Product {
    private double price;
    private String name;
    Category category;

    public Product(double price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name) && category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, category);
    }


    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}
