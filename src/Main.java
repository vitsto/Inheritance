import animals.*;
import animals.meal.Meat;
import animals.meal.Plant;
import fuel.Diesel;
import fuel.Electricity;
import fuel.Petrol;
import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015,
                "Россия", "механическая", "хэтчбек", "123",
                4, 200);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020,
                "Германия", "", "", "н388но999",
                4, 320);
        lada.refill(new Diesel());
        System.out.println(lada);
        audi.refill(new Electricity());
        System.out.println(audi);

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия",
                "зеленый", 301, 3500, LocalTime.of(21, 15, 0),
                "Белорусский вокзал", "Минск-Пассажирский", 11);
        lastochka.refill(new Diesel());

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                "оранжевый", 270, 1700, LocalTime.of(14, 10, 0),
                "Ленинградский вокзал", "Ленинградский-пассажирский", 8);
        leningrad.refill(new Diesel());

        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus bus1 = new Bus("ЛИАЗ", "5256", 2021, "Россия", "синий", 180);
        Bus bus2 = new Bus("ПАЗ", "4230", 2007, "Россия", "черный", 140);
        bus1.refill(new Petrol());
        bus2.refill(new Diesel());

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println("\n\n");

        Herbivorous giraffe = new Herbivorous("жираф", 2, "Африка", 3, new Plant());
        giraffe.sleep();
        giraffe.go();
        giraffe.graze();
        giraffe.eat();
        giraffe.walk();
        System.out.println(giraffe);
        Herbivorous giraffe2 = new Herbivorous("жираф", 2, "Африка", 3, new Plant());
        System.out.println(giraffe.equals(giraffe2));

        Herbivorous gazelle = new Herbivorous("газель", 5, "Индия", 30, new Plant());
        Herbivorous horse = new Herbivorous("лошадь", 4, "Западная Америка", 25, new Plant());
        Predator hyena = new Predator("гиена", 7, "юго-западная Азия", 40, new Meat());
        Predator tiger = new Predator("тигр", 10, "Россия", 60, new Meat());

        System.out.println(gazelle);
        System.out.println(gazelle.equals(giraffe));
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        tiger.hunt();

        Amphibian frog = new Amphibian("лягушка", 12, "болото");
        Amphibian snake = new Amphibian("Уж пресноводный", 6, "Дальний восток");
        System.out.println(frog);
        frog.hunt();
        System.out.println(snake);

        FlyingBird gull = new FlyingBird("чайка", 10,"Евразия", MovementType.AIR);
        FlyingBird albatross = new FlyingBird("альбатрос", 7,"Австралия", MovementType.AIR);
        FlyingBird falcon = new FlyingBird("сокол", 2,"США", MovementType.AIR);
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);

        FlightlessBird penguin = new FlightlessBird("пингвин", 4, "Антрактида", MovementType.EARTH);
        FlightlessBird peacock = new FlightlessBird("павлин", 7, null, MovementType.EARTH);
        FlightlessBird dodo = new FlightlessBird("птица додо", 1, null, MovementType.EARTH);

        System.out.println(penguin);
        System.out.println(peacock);
        System.out.println(dodo);

    }
}
