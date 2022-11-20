package alanhesaplama;

public class Ucgen extends AlanHesapla{
    double kenar1;
    double kenar2;
    double kenar3;

    public Ucgen(double kenar1, double kenar2, double kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }


    @Override
    public void alanHesapla() {
        double u = (kenar1+ kenar2 + kenar3 ) / 2.0;

        double alan = Math. sqrt(u * (u-kenar1) * (u - kenar2) * (u - kenar3) );
        System.out.println("Ucgen Alanı : "+alan);
    }
    @Override
    public void cevreHesapla() {
        System.out.println("Ucgen çevresi : "+(kenar1+kenar2+kenar3));
    }
}