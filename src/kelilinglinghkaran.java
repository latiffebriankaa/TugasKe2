import java.util.Scanner;

public class kelilinglinghkaran {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = inputan.nextDouble();
        
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran: " + keliling);
        
        inputan.close();
    }
}
