import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
            Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

        //basamak sayısı bulmaca
        int a = 2451, basamakSayisi = 0, numberCounter=0;
        while(a!=0){
            a/=10;
            numberCounter++;
        }
        //Bir sayının son basamağını bulmaca
        //2451 % 10 = 1 birler basamağı 245 %10 = 5 onlar basamağı
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 0;
        for (int i = 1; i<=sup; i++) {
            result *= sub;
        }
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();


        int basamakSayisi = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basamakSayisi++;
        }
        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i<=basamakSayisi; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /=10;

        }
        if (result == number) {
            System.out.print(number + " bir Armstrong sayıdır.");
        }else {
            System.out.print(number + " bir Armstrong sayı değildir.");
        }
    }
}
