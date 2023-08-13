package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Лада");
        car.setColor("белый");
        car.setYear(2020);
        System.out.printf("Модель автомобиля: %s\n", car.getModel());
        System.out.printf("Цвет автомобиля: %s\n", car.getColor());
        System.out.printf("Год выпуска автомобиля: %d", car.getYear());
    }
}

class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String modelAuto) {
        model = modelAuto;
    }
    public void setColor(String colorAuto) {
        color = colorAuto;
    }
    public void setYear(int yearAuto) {
        year = yearAuto;
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
