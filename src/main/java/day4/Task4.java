package day4;

public class Task4 {
    public static void main(String[] args) {
int[] masiv = new int[100];
for(int i = 0; i < masiv.length; i ++) {
    masiv[i] = (int)(Math.random() * 10000);
}
    int maxSum = 0;
    int maxIndex = 0;
    for (int i = 0; i < 98; i++) {
        int sum = masiv[i] + masiv[i + 1] + masiv[i + 2];
        if (sum > maxSum) {
            maxSum = sum;
            maxIndex = i;
        }
    }
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Индекс первого элемента тройки: " + maxIndex);
    }
}
