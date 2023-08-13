package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing", 2000, 40, 40);
        Airplane airbus = new Airplane("Airbus", 2005, 30, 50);
        Airplane.compareAirplanes(boeing, airbus);
    }
}