import java.util.Scanner;

public class RecurseAsal {

    static void asa(int a){
        for (int i =2;i<8;i++){
            if (a%i==0){
                System.out.println(a+ " Bir asal sayı değildir.");
                break;
            } else {
                System.out.println(a+ " Bir asal sayıdır.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Lütfen 10'dan büyük bir sayı giriniz : ");
        int a = in.nextInt();
        if (a>=10){
            asa(a);
        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
