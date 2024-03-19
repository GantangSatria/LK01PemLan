package LK01;
import java.util.*;

public class MainBD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jarijari = scan.nextDouble();
        lingkaran1.setJarijari(jarijari);
        lingkaran1.printout();

        System.out.println("");

        SegiEmpat segiEmpat1 = new SegiEmpat();
        System.out.print("Masukkan panjang segi empat: ");
        double panjangSegiEmpat = scan.nextDouble();
        segiEmpat1.setPanjangSegiEmpat(panjangSegiEmpat);
        System.out.print("Masukkan lebar segi empat: ");
        double lebarSegiEmpat = scan.nextDouble();
        segiEmpat1.setLebar(lebarSegiEmpat);
        segiEmpat1.printout();

        scan.close();
    }
}
