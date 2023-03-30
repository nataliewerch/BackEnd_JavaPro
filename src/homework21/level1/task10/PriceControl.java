package homework21.level1.task10;

public class PriceControl {
    public static void main(String[] args) throws HighPriceOfBreadException {
        Bread bread = new Bread(9);
       buyFood(bread);

    }

        //task 10
    public static void checkPriceBread(double breadPrice) throws HighPriceOfBreadException {
        if (breadPrice > 8.0) {
            throw new HighPriceOfBreadException("Цена на хлеб завышена");
        }else {
            System.out.println("Хлеб купили");
        }
    }

    //task 11
    public static void buyBread(Bread bread) throws HighPriceOfBreadException {
        double breadPrice = bread.getPrice();
        checkPriceBread(breadPrice);
    }

    public static void buyMeat(){
        System.out.println("Мясо купили ");
    }

    public static void buyFood(Bread bread) throws HighPriceOfBreadException {
        try {
            buyBread(bread);
            buyMeat();
        }catch (HighPriceOfBreadException e) {
            System.out.println(e.getMessage());
            buyMeat();
        }

    }


}
