import java.util.Scanner;

public class hitungantelur {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        int hargaPerKg = 28000;
        
        System.out.print("Jumlah Telur (kg): ");
        float jumlahTelur = inputan.nextFloat();
        
        System.out.print("Total Bayar: ");
        double totalBayar = inputan.nextDouble();
        
        double totalHarga = hargaPerKg * jumlahTelur;
        double kembalian = totalBayar - totalHarga;
        
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Uang Kembalian: " + kembalian +"terimakasih");
        
        inputan.close();
    }
}
