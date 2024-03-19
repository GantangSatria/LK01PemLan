package LK01;

public class SegiEmpat extends BangunDatar {

    public void setPanjangSegiEmpat(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebarSegiEmpat) {
        this.lebar = lebarSegiEmpat;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double hitungDiagonal(){
        return Math.sqrt((panjang*panjang) + (lebar*lebar)) ;
    }

    public void printout() {
        System.out.println("Panjang segi empat: " + panjang);
        System.out.println("Lebar segi empat: " + lebar);
        System.out.println("Luas segi empat: " + hitungLuas());
        System.out.println("Keliling segi empat: " + hitungKeliling());
        System.out.println("Panjang diagonal segi empat: " + hitungDiagonal());
        System.out.println("");
    }
}
