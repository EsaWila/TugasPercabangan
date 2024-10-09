import java.util.Scanner;

public class pecahanuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Jumlah uangnya: ");
        int jumlahUang = input.nextInt();
        int seratusRibu, limapuluhRibu, duapuluhRibu, sepuluhRibu, limaRibu, duaRibu,seribu, gope, cepe;

        if (jumlahUang >=100000) {
            seratusRibu = jumlahUang/100000;
            jumlahUang = jumlahUang %100000;

            System.out.println(seratusRibu + "lembar 100.000 rupiah");
        }

        if (jumlahUang >=50000) {
            limapuluhRibu = jumlahUang/50000;
            jumlahUang = jumlahUang %50000;

            System.out.println(limapuluhRibu + "lembar 50.000 rupiah");
        }

        if (jumlahUang >=20000) {
            duapuluhRibu = jumlahUang/20000;
            jumlahUang = jumlahUang %20000;

            System.out.println(duapuluhRibu + "lembar 20.000 rupiah");
        }

        if (jumlahUang >=10000) {
            sepuluhRibu = jumlahUang/10000;
            jumlahUang = jumlahUang %10000;

            System.out.println(sepuluhRibu + "lembar 10.000 rupiah");
        }

        if (jumlahUang >=5000) {
            limaRibu = jumlahUang/5000;
            jumlahUang = jumlahUang %5000;

            System.out.println(limaRibu + "lembar 5.000 rupiah");
        }

        if (jumlahUang >=2000) {
            duaRibu = jumlahUang/2000;
            jumlahUang = jumlahUang %2000;

            System.out.println(duaRibu + "lembar 2.000 rupiah");
        }

        if (jumlahUang >=1000) {
            seribu = jumlahUang/1000;
            jumlahUang = jumlahUang %1000;

            System.out.println(seribu + "lembar 1.000 rupiah");
        }

        if (jumlahUang >=500) {
            gope = jumlahUang/500;
            jumlahUang = jumlahUang %500;

            System.out.println(gope + "keping 500 rupiah");
        
        }

        if (jumlahUang >=100) {
            cepe = jumlahUang/100;
            jumlahUang = jumlahUang %100;

            System.out.println(cepe + "keping 100 rupiah");
        }
        input.close();









        
    }
}
