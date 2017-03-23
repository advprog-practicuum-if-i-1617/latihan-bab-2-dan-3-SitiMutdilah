package utp0001;
import java.util.Scanner;
public class MainOverloadingMethod { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        OverloadingMethod a = new OverloadingMethod();
        int pilihan;
        
        do{
            System.out.print("MENU\n0. Keluar\n1. Konversi angka ke huruf\n2. Konversi huruf ke angka\nMasukkan pilihan anda : ");
            pilihan = in.nextInt();
            if(pilihan==1){
                System.out.print("Masukkan angka yang dikonversi: ");
                int angka = in.nextInt();
                System.out.println("Konversi : "+a.konversi(angka));
            }
            else if(pilihan==2){
            System.out.print("Masukkan huruf : ");
            String huruf = in.next();
            System.out.println("Hasil konversi : "+a.konversi(huruf));
            }
            else{
                System.out.println("KELUAR");
            }
        }while(pilihan!=0);
}
}
