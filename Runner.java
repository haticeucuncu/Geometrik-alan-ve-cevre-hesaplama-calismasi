package alanhesaplama;

public class Runner {
    public static void main(String[] args) {

        Ucgen uc= new Ucgen(12,12,12);
        uc.alanHesapla();
        uc.cevreHesapla();

        Dikdortgen dik=new Dikdortgen(12,25);
        dik.alanHesapla();
        dik.cevreHesapla();

        Kare kare=new Kare(12,12);
        kare.alanHesapla();
        kare.cevreHesapla();

        Cember cember=new Cember(15);
        cember.alanHesapla();
        cember.cevreHesapla();
    }


}