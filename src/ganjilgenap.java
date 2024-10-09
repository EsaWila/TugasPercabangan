import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

       System.out.print("Masukkan angka: ");
       int angka = input.nextInt();
       
       if (angka % 2 == 0) {
        System.out.println(angka + " Ini bilangan genap"); 
       }else {
        System.out.println(angka + " Ini bilangan ganjil");
       }

       input.close();
    }
}
