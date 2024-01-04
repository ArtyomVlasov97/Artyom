package day4;

import java.util.Arrays;
import java.util.Scanner;
/* 1. С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно).
Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46
*/
public class Task1 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int[] masiv = new int[a];
for(int i = 0;i<masiv.length; i++) {
    masiv[i] = (int) (Math.random() * 11);
}
int dlina = 0;
int bol8 = 0;
int rav1 = 0;
int chet = 0;
int nechet = 0;
int sum = 0;
for (int x: masiv) {
    System.out.print(x + " ");
    dlina ++;
    if (x>8) {
        bol8 ++;
    }
    if(x == 1) {
        rav1++;
    }
    if(x%2==0) {
        chet ++;
    } else {
        nechet++;
    }
    sum = sum +x;
}
System.out.println("Длина массива: " + dlina);
        System.out.println("Количество чисел больше 8: " + bol8);
        System.out.println("Количество чисел равных 1: " + rav1);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество нечетных чисел: "+ nechet);
        System.out.println("Сумма всех элементов массива: "+ sum);
    }
}
