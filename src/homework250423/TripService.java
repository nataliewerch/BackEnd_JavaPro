package homework250423;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TripService {
    Scanner scanner = new Scanner(System.in);

    private void getAllTrips(List<Trip> trips) {
        trips.stream()
                .forEach(System.out::println);
    }

    private void getSortedTrips(List<Trip> trips) {
        trips.stream()
                .sorted(Comparator.comparingDouble(Trip::getPrice))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private void getDescSortTrips(List<Trip> trips) {
        trips.stream()
                .sorted(Comparator.comparingDouble(Trip::getPrice).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private void getPriceRange(List<Trip> trips) {
        System.out.println("Введите минимальную цену ");
        double minPrice = scanner.nextDouble();
        System.out.println("Введите максимальную цену ");
        double maxPrice = scanner.nextDouble();
        trips.stream()
                .filter(trip -> trip.getPrice() >= minPrice && trip.getPrice() <= maxPrice)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private void getStartCity(List<Trip> trips) {
        List<String> collect = trips.stream()
                .map(Trip::getSource)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Выберети город отправления: " + collect);
        String startCity = scanner.nextLine();
        trips.stream()
                .filter(s->startCity.equals(s.getSource()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void getFinishCity(List<Trip> trips) {
        List<String> collect = trips.stream()
                .map(Trip::getDestination)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Выберети город назначения: " + collect);
        String finishCity = scanner.nextLine();
        trips.stream()
                .filter(s->finishCity.equals(s.getDestination()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void getBriefInformation(List<Trip> trips) {
        long count = trips.stream().count();
        double minPrice = trips.stream()
                .mapToDouble(Trip::getPrice)
                .min()
                .orElse(0);
        double maxPrice = trips.stream()
                .mapToDouble(Trip::getPrice)
                .max()
                .orElse(0);
        List<String> startCity = trips.stream()
                .map(Trip::getSource)
                .distinct()
                .collect(Collectors.toList());
        List<String> finishCity = trips.stream()
                .map(Trip::getDestination)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Количество доступных поездок: " + count);
        System.out.println("Цены в диапозоне от " + minPrice + " до " + maxPrice + " Евро");
        System.out.println("Список городов отправления: " + startCity);
        System.out.println("Список городов назаначения: " + finishCity);
    }

    public void tripService (List<Trip> trips) {
        String option = scanner.nextLine();

        switch (option.toUpperCase()) {
            case "A" -> getAllTrips(trips);
            case "B" -> getSortedTrips(trips);
            case "C" -> getDescSortTrips(trips);
            case "D" -> getPriceRange(trips);
            case "E" -> getStartCity(trips);
            case "F" -> getFinishCity(trips);
            case "G" -> getBriefInformation(trips);
            default -> System.out.println("Заданной опции не существует!!! Попробуйте еще раз!");
        }
    }
}
