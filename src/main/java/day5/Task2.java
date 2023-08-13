package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Suzuki", "черный", 2015);
        System.out.printf("Модель мотоцикла: %s\n", motorbike.getModel());
        System.out.printf("Цвет мотоцикла: %s\n", motorbike.getColor());
        System.out.printf("Год выпуска мотоцикла: %d", motorbike.getYear());
    }
}

class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
}
