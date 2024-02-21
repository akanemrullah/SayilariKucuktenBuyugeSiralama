import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Gerekli degiskenler tanimlandi.
        int n1, n2, n3;

        // Scanner sinifina ait degisken tanimlandi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan degerler alinip ilgili degiskenlere atandi.
        System.out.print("Ilk sayiyi gir: ");
        n1 = input.nextInt();

        System.out.print("Ikinci sayiyi gir: ");
        n2 = input.nextInt();

        System.out.print("Ucuncu sayiyi gir: ");
        n3 = input.nextInt();

        // Gerekli mantiksal karsilastirmalar yapilip kullaniciya geribildirimde bulunuldu.
        if (n1 <= n2) {
            if (n1 <= n3) {
                if(n2 <= n3){
                    System.out.println("En kucuk :" + n1 + " Orta: " + n2 + " Buyuk: " + n3);
                }else{
                    System.out.println("En kucuk :" + n1 + " Orta: " + n3 + " Buyuk: " + n2);
                }
            } else {
                System.out.println("En kucuk :" + n3 + " Orta: " + n1 + " Buyuk: " + n2);
            }
        }else if(n1 <= n3){
            System.out.println("En kucuk :" + n2 + " Orta: " + n1 + " Buyuk: " + n3);
        }else if(n2 <= n3){
            System.out.println("En kucuk :" + n2 + " Orta: " + n3 + " Buyuk: " + n1);
        }else{
            System.out.println("En kucuk :" + n3 + " Orta: " + n2 + " Buyuk: " + n1);
        }
    }
}