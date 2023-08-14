package day8;

public class Task1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        String string = "";
        for(int i = 0; i <= 20000; i++) {
            string += i + " ";
        }
        System.out.println(string);
        long stopTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("Длительность работы, в мс.: %s\n\n", stopTime - startTime);


        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
        stopTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("Длительность работы, в мс.: %s", stopTime - startTime);
    }
}
