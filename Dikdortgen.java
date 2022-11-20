package alanhesaplama;

public class Dikdortgen extends AlanHesapla{
    double kenar1;
    double kenar2;

    public Dikdortgen(double kenar1, double kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    @Override
    public void alanHesapla() {
        System.out.println("Dikdörtgen Alanı : "+kenar1*kenar2);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdörtgen çevresi : "+(kenar1+kenar2)*2);
    }
}