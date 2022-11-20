package alanhesaplama;

public class Kare extends Dikdortgen{

    public Kare(double kenar1, double kenar2) {
        super(kenar1, kenar2);
    }

    @Override
    public void alanHesapla() {
        System.out.println("Karenin alanı : "+kenar1*kenar2);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Karenin çevresi : "+(kenar1+kenar2)*2);
    }
}