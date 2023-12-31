package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 30, 40);
        airplane.setLength(35);
        airplane.setWeight(45);
        airplane.fillUp(1500);
        airplane.fillUp(3500);
        airplane.info();
    }
}

class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d",
                manufacturer, year, length, weight, fuel);
    }
    public void fillUp(int fuel) {
        this.fuel += fuel;
    }
}
