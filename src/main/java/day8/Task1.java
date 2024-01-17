package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder string = new StringBuilder();
        for(int i = 0; i <20001; i++) {
            string.append(i + " ");
        }
        System.out.println(string.toString());
        long stopTime = System.currentTimeMillis();
        System.out.println("Длитеьность работы, в мс.: " + (stopTime - startTime));

        long start = System.currentTimeMillis();
        String str = "";
        for(int i = 0; i < 20001; i++) {
            str += i + " ";
        }
        System.out.println(string);
        long stop = System.currentTimeMillis();
        System.out.println("Длитеьность работы, в мс.: " + (stop - start));
    }
}
