package jatekjava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JatekJava {
    private static Karakter cha;
    public static void main(String[] args) {
        Karakter[] karakterek = {cha};
        karakterLetrehoz();
    }

    private static void karakterLetrehoz() {
        karakterEgy();
    }

    private static void karakterEgy() {
        
        cha.felvesz(new Targy("Zio Pickaxe", "A pickaxe"));
        cha.felvesz(new Targy("Zio Sword", "A sword"));
        cha.felvesz(new Targy("Zio Ingit", "An ingot"));
        cha.felvesz(new Targy("Zio Ingot", "An ingot"));
        cha.felvesz(new Targy("Zio Ingot", "An ingot"));
    }

    public void elment() {
        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("karakterek.bin"))) {
            objKi.writeObject(karakterek);

            /* ha try resources, akkor nem kell close, 
            mert a try-ból való kilépéskor automatikusan meghívja az 
            AutoCloseable interface által biztosított close metódust
             */
            //objKi.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void betolt() {

    }

}
