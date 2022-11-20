package alanhesaplama;

import java.sql.SQLOutput;

public class Cember extends AlanHesapla{
    double yarıCap;

    public Cember(double yarıCap) {
        this.yarıCap = yarıCap;
    }

    @Override
    public void alanHesapla() {
        System.out.println("Çemberin Alanı : "+Math.PI*yarıCap*yarıCap);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Çemberin Çevresi : "+ (2*yarıCap*Math.PI));
    }
}