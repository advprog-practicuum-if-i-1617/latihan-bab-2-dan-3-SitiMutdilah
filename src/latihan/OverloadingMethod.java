package utp0001;
import java.util.Scanner;
public class OverloadingMethod {    
    Scanner in= new Scanner(System.in);
    String[] nilai = {"nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};   
    int [] bil = {0,1,2,3,4,5,6,7,8,9,10,11};
    
    public String konversi(int angka) {
    String hasil = "";
    int a = angka / 100;
    if (a > 0) {
        hasil = nilai[a] + " Ratus ";
        if (a == 1) {
            hasil = "Seratus ";}
            angka %= 100;
    }
        if (angka < 12) {
            hasil += nilai[angka];}
        else {
            a = angka / 10;
            angka %= 10;
                if (a == 1) {
                    hasil += nilai[angka] + " Belas";}
                else {
                    hasil += nilai[a] + " Puluh " + nilai[angka];}     
        }
        return hasil;
    }
    public String konversi(String huruf){
        for (int i = 0; i < nilai.length; i++) {
            String aa = konversi(i);
            if(huruf.equalsIgnoreCase(aa)){
                return Integer.toString(i);
            }
            if("seratus".equalsIgnoreCase(huruf)){
                return "100";
            }
            if("seribu".equalsIgnoreCase(huruf)){
                return "1000";
            }
            else if((nilai[i]+" belas").equalsIgnoreCase(huruf)){
                i+=10;
            }
            else if((nilai[i]+" puluh").equalsIgnoreCase(huruf)){
                i*=10;
            }
        }
        return " ";
        
    }
}
