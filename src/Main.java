import java.util.Scanner;

public class Main {
        // Oluşturulan f isimli metotta, girilen sayı sıfır veya sıfırdan küçük olana kadar 5 çıkarılır.
    static void f(int a) {
        System.out.println(a);
        if (a <= 0) {
            return;
        }

        //if koşulu sağlandıktan sonra return çalışır ve metodun çağrıldığı yere dönüp, geriye dönük çalışmaya başlar.
        f(a - 5);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int a = inp.nextInt();
        f(a);
    }
}