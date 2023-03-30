package homework20.level2.task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShopTest {
    public static void main(String[] args) {
        List<Product> kauflandProduct = new ArrayList<>();
        kauflandProduct.add(new Product(8.30, "Chicken fillet", Category.MEET));
        kauflandProduct.add(new Product (4.20, "Apples", Category.FRUIT ));
        kauflandProduct.add(new Product(2.90, "Pasta", Category.GROCERY));
        kauflandProduct.add(new Product(0.30, "Cat food", Category.PET_PRODUCT));
        kauflandProduct.add(new Product (1.50, "Carrot", Category.VEGETABLE));

        List<Product> lidlProduct = new ArrayList<>();
        lidlProduct.add(new Product(13.50, "Beef fillet", Category.MEET));
        lidlProduct.add(new Product (1.99, "Bananas", Category.FRUIT));
        lidlProduct.add(new Product(1.30, "Rice", Category.GROCERY));
        lidlProduct.add(new Product(2.30, "Cat snack", Category.PET_PRODUCT));
        lidlProduct.add(new Product (1.90, "Cucumber", Category.VEGETABLE));

        List<Product> edekaProduct = new ArrayList<>();
        edekaProduct.add(new Product(20.70, "Goose", Category.MEET));
        edekaProduct.add(new Product (2.20, "Bananas", Category.FRUIT));
        edekaProduct.add(new Product(1.15, "Flour", Category.GROCERY));
        edekaProduct.add(new Product(2.30, "Dog food", Category.PET_PRODUCT));
        edekaProduct.add(new Product (1.10, "Potato", Category.VEGETABLE));

        Shop kaufland = new Shop("Hercules", "Later Plate 18", 21.00, kauflandProduct);
        Shop lidl = new Shop("Rewe", "Main Street 1", 24.00, lidlProduct);
        Shop edeka = new Shop("Ratio", "Silver Street 77", 20.00, edekaProduct);



        // task 1
        System.out.println("TreeMap");
        Map<String, Double> treeMap = Stream.of(kauflandProduct,lidlProduct,edekaProduct)
                .flatMap(List::stream)
                .collect(Collectors.toMap(Product::getName, Product::getPrice, (p1, p2) -> {
                    System.out.printf("Duplicate detected !!! %.2f and %.2f%n ", p1, p2);
                    return p1 < p2 ? p1 : p2;
                }, TreeMap::new));
        System.out.println(treeMap);

        System.out.println("____________________________________________________________________________________________");
        System.out.println("HashMap");
        Map<String, Double> hashMap = Stream.of(kauflandProduct,lidlProduct,edekaProduct)
                .flatMap(List::stream)
                .collect(Collectors.toMap(Product::getName, Product::getPrice, (p1, p2) -> {
                    System.out.printf("Duplicate detected !!! %.2f and %.2f%n ", p1, p2);
                    return p1 < p2 ? p1 : p2;
                }, HashMap::new));
        System.out.println(hashMap);

        // task 2
        Map<String, List<Product>> res = Stream.of(kaufland,lidl,edeka)
                .filter(s -> s.getWorkTo() > 18)
                .flatMap(s -> s.getProducts().stream())
                .filter(p -> p.getCategory() == Category.FRUIT && p.getPrice() < 5)
                .collect(Collectors.groupingBy(Product::getName));
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Фрукты, сгруппированные по имени ");
        System.out.println(res);


        // task 3
        Map<Category,Long> categoryProducts = Stream.of(kaufland, lidl, edeka)
                .flatMap(shop -> shop.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Количество товаров по категориям: ");
                categoryProducts.forEach((category, count) -> System.out.println(category + ": " + count));


        // task 4
        Map<Category,List<String>> productsCategory = Stream.of(kaufland, lidl, edeka)
                .flatMap(shop -> shop.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName, Collectors.toList())));
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Названия продуктов в каждой категории: ");
        productsCategory.forEach((category, product) -> {
            System.out.println(category + ": ");
            product.forEach(System.out::println);
            System.out.println();
        });

        // task 5

        Map<Category,Optional<Double>> minPriceProduct = Stream.of(kaufland, lidl, edeka)
                .flatMap(shop -> shop.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getPrice, Collectors.minBy(Comparator.naturalOrder()))));
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Наименьшая цена продукта в каждой категории: ");
        minPriceProduct.forEach(((category, price) -> {
            price.ifPresent(p -> System.out.println(category + ": " + p));
        }));

        // task 6
       String productsName = Stream.of(kaufland, lidl, edeka)
                .flatMap(shop -> shop.getProducts().stream() )
                .map(Product::getName)
               .distinct()
               .collect(Collectors.joining(", "));
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Список всех продуктов: ");
        System.out.println(productsName);

    }
}
