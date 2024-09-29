import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner (System.in);
        int yearnow = 2024;
        System.out.print("masukkan tahun lahir anda :D =");
        int yearborn = inputan.nextInt();
        int age = yearnow - yearborn;
        inputan.close();
        System.out.println("i am " + age +"years old.");
    }
}
