import java.util.Scanner;

public class jeruk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah buah jeruk: ");
        int jumlahBuah = input.nextInt();
        int beli1=3000, beli2=5000, beli5=10000;
        int totalHarga = 0;

        if (beli5 >=5) {
            int harga5buah = (jumlahBuah/5)*beli5;
            jumlahBuah = jumlahBuah %5;
            totalHarga += harga5buah;
        }

        if (beli2 >=2) {
            int harga2buah = (jumlahBuah/2)*beli2;
            jumlahBuah = jumlahBuah %2;
            totalHarga += harga2buah;    
        }

        if (beli1 >=1) {
            int harga1buah = (jumlahBuah/1)*beli1;
            jumlahBuah = jumlahBuah %1;
            totalHarga += harga1buah;
        }
        System.out.println(" Total harganya: "+totalHarga);

        input.close();
    }
}