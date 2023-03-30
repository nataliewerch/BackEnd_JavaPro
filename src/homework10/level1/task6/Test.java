package homework10.level1.task6;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        newspaper.addAdvertisement(new Advertisement("Продаю ", "Продам ноутбук Hp, в хорошем состоянии", "Семен Семенов", 2022, 3000));
        newspaper.addAdvertisement(new Advertisement("Куплю ", "Куплю любой антиквариат", "Герман Шмидт", 2019, 380));
        newspaper.addAdvertisement(new Advertisement("Образование и курсы", "Предлагаем курсы по развиттию личности", "Петр Петров", 2023, 3800));
        newspaper.addAdvertisement(new Advertisement("Куплю ", "Куплю iphone в хорошем сотоянии", "Андрей Андреев", 2023, 300));
        newspaper.addAdvertisement(new Advertisement("Сдаю ", "Сдам 2-х комнатную квартиру", "Артур Шварц", 2021, 18000));
        newspaper.addAdvertisement(new Advertisement("Продаю ", "В связи с переездом продаю мебель и технику", "Данил Данилян", 2022, 10000));
        newspaper.addAdvertisement(new Advertisement("Сниму ", "Сниму дом за городом для семьи из 3-х человек", "Александр Лехно", 2023, 27000));
        newspaper.addAdvertisement(new Advertisement("Услуги ", "Доставляем крупногабаритные грузы во все города страны", "Франц Вольф", 2020, 3000));
        newspaper.addAdvertisement(new Advertisement("Продам ", "Продам кота, 1 месяц, черный", "Иван Иванов", 2023, 120));
        newspaper.addAdvertisement(new Advertisement("Продам ", "Продаю автомобиль BMW 2020 года выпуска, пробег 30 000 км, в отличном состоянии.", "Атур Гердт", 2022, 2000000));

        System.out.println(newspaper);
        Collections.sort(newspaper.getAdvertisements());
        System.out.println("Отсортированный список");
        System.out.println(newspaper);

        System.out.println("Минимальное значение " + newspaper.minAd(newspaper));
        System.out.println("Максимальное значение " + newspaper.maxAd(newspaper));




    }
}
