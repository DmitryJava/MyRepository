package day7;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(11) + 90);
        Player player2 = new Player(random.nextInt(11) + 90);
        Player player3 = new Player(random.nextInt(11) + 90);
        Player player4 = new Player(random.nextInt(11) + 90);
        Player player5 = new Player(random.nextInt(11) + 90);
        Player player6 = new Player(random.nextInt(11) + 90);
        Player player7 = new Player(random.nextInt(11) + 90);

        // Проверка на 6 игроков, хотя по факту их 7
        System.out.println(player7.getCountPlayers());

        // Проверка на random от 90 до 100
        System.out.println(player4.getStamina());

        // Вызываем пока спортсмен не крякнет
        while(player4.getStamina() != 0) {
            player4.run();
            System.out.printf("Выносливость равна %d\n", player4.getStamina());
        }
        // И их осталось пять...
        player4.info();
    }
}

class Player {
    private static int countPlayers = 0;
    private int stamina;
    public static final int MIN_STAMINA = 0;
    public static final int MAX_STAMINA = 100;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }
    public int getCountPlayers() {
        return  countPlayers;
    }

    public void run() {
        stamina--;
        if (stamina == MIN_STAMINA)
            countPlayers--;
    }

    public void info() {
        switch(countPlayers) {
            case 1:
                System.out.println("Команды неполные. На поле еще есть 5 свободных мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.printf("Команды неполные. На поле еще есть %d свободных места\n", 6 - countPlayers);
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть 1 свободное место");
                break;
            default:
                System.out.println("На поле нет свободных мест");
        }
    }
}
