package day6;

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

    public void info() {
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
