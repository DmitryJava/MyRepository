package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Лада");
        car.setColor("белый");
        car.setYear(2020);

        Motorbike motorbike = new Motorbike("Suzuki", "черный", 2005);

        car.info();
        System.out.printf("Разница в %d лет\n\n", car.yearDifference(2010));
        motorbike.info();
        System.out.printf("Разница в %d лет", motorbike.yearDifference(2020));

    }
}
