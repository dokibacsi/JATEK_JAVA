package jatekjava;

import java.util.ArrayList;
import java.util.Random;

public class Karakter {

    Random rnd;
    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles;

    public Karakter() {
        this.eletero = dobokocka(2) + 12;
        this.ugyesseg = dobokocka(1) + 6;
        this.szerencse = dobokocka(1) + 6;
    }

    private int dobokocka(int db) {
        int eredmeny = 0;
        for (int i = 0; i < db; i++) {
            eredmeny += rnd.nextInt(6) + 1;
        }
        return eredmeny;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public void setUgyesseg(int ugyesseg) {
        this.ugyesseg = ugyesseg;
    }

    public void setSzerencse(int szerencse) {
        this.szerencse = szerencse;
    }

    public int getEletero() {
        return eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    public void felvesz(Targy targy) {
        felvesz(targy, 1);
    }

    public void felvesz(Targy targy, int db) {
        for (int i = 0; i < db; i++) {
            felszereles.add(targy);
        }
    }

    public void hasznal(String targy) {
        hasznal(targy, 1);
    }

    public void hasznal(String targy, int db) {
        hasznal(targy, db, false);
    }

    public void hasznal(String targy, int darab, boolean kivesz) {
        if (targyDbEllenorzo(targy) == 0) {
            System.out.println("Ebből a tárgyból nincs a felszereléseid között!");
        } else if (targyDbEllenorzo(targy) >= darab) {
            System.out.println("Ebből a tárgyból nincs elég a felszereléseid között!");
        } else if (targyDbEllenorzo(targy) >= darab && kivesz == true) {
            System.out.printf("Nincs a felszereléseid között megfelelő mennyiségű %s!"
                    + "\n De sikeresen felhasználtál %d darabot!", targy, darab);
        } else {
            System.out.printf("Sikeresen felhsaználtál %d darab tárgyat ebből: %s", darab, targy);
        }
    }

    public int targyDbEllenorzo(String targy) {
        int darab = 0;
        for (Targy felsz : felszereles) {
            if (felsz.getName().equals(targy)) {
                darab++;
            }
        }
        return darab;
    }
}
