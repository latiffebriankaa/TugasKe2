import java.util.Scanner;

public class volumekubus {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = inputan.nextDouble();
        
        double volume = Math.pow(sisi, 3);
        System.out.println("Volume Kubus: " + volume);
        
        inputan.close();
    }
}
