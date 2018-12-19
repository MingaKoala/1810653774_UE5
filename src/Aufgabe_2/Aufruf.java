package Aufgabe_2;

public class Aufruf {

    public static void main(String[] args) {
        Mensch a = new Mensch ("Benedikt", "Oltersdorf", 24);
        a.Status();
        a = new Student("Benedikt", "Oltersdorf", 24, 1810653774, "WB&T"); // polymophysmus wenn zb. mensch und student sie selbe methode haben hier a
        a.Status();
    }
}
