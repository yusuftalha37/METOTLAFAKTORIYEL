import java.util.Scanner;
public class Metotfak {
     static void faktoriyel(int sayi){
    int sonuç=1;
    for (int i=1;i<=sayi;i++) {

        sonuç = sonuç * i;
    }
        System.out.println(sayi+"!="+sonuç);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int sayi= scan.nextInt();
        faktoriyel(sayi);
    }
}
