package LK01;

public class Lingkaran extends BangunDatar {

    public void setJarijari(double jarijari)  {
        this.jarijari = jarijari;
    }

    public double hitungLuas()   {
        return Math.PI * Math.pow(jarijari, 2);
    }


    public void printout() {
        System.out.println("Jari-jari lingkaran: " + jarijari);
        System.out.println("Luas lingkaran: " + hitungLuas());
        System.out.println("");
    }

}
