package day7;

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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length == airplane2.length)
            System.out.printf("Длины %s и %s равны", airplane1.manufacturer, airplane2.manufacturer);
        else if (airplane1.length > airplane2.length)
            System.out.printf("%s длиннее, чем %s", airplane1.manufacturer, airplane2.manufacturer);
        else
            System.out.printf("%s длиннее, чем %s", airplane2.manufacturer, airplane1.manufacturer);
    }
}
