import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int basamakSayisi = 1;
        int geciciBasamakDegeri;
        int basValue=0;
        int result=0;

        System.out.print("Bir Sayı Giriniz: ");
        number = input.nextInt();

        while (number != 0){
            basValue = number % 10;
            //System.out.println(basValue);
            geciciBasamakDegeri = 1;
            for (int i = 1; i <= basamakSayisi; i++){
                geciciBasamakDegeri *= basValue;
            }
            result += geciciBasamakDegeri;
            number /=10; // bu işlemi yapılmaz ise sonsuz döngüye girilir

        }
        System.out.println(result);
    }
}