package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }
    public int getStamina() {
        return stamina;
    }
    public int getCountPlayers() {
        return countPlayers;
    }
    public void run() {
        if (this.stamina == MIN_STAMINA) {
            countPlayers--;
            return;
        } else {
            this.stamina--;
        }
    }
    public static void info() {
        int ostatok = 6 - countPlayers;
        String name;
        switch (ostatok) {
            case 1:
                name = "1 свободное место";
                break;
            case 2:
                name = "2 свободных места";
                break;
            case 3:
                name = "3 свободных места";
                break;
            case 4:
                name = "4 свободных места";
                break;
            default:
                name = "5 свободных места";
        }
        if(countPlayers<6) {
            System.out.println("Команды неполные. На поле еще есть " + name);
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
    }

