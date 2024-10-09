import java.util.Scanner;

public class lulusga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        
        if (nilai >=75) {
            System.out.println("Lulus");
        
        }else{
            System.out.println("Tidak lulus");
        }
        input.close();
        
    }
}
