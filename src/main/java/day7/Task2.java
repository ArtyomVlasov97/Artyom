package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random numbers = new Random();
        int x = numbers.nextInt(11) + 90;
        Player one = new Player(x);
        Player two = new Player(x);
        Player three = new Player(x);
        Player four = new Player(x);
        Player five = new Player(x);
        Player.info();
        for(int i = 0; i<120; i++) {
            one.run();
        }
        Player.info();
        Player.info();
    }
}
