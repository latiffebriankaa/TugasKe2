import java.util.Scanner;

public class luaspersegipanjang {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        double panjang = inputan.nextDouble();
        
        System.out.print("Masukkan lebar: ");
        double lebar = inputan.nextDouble();
        
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
        
        inputan.close();
    }
}
