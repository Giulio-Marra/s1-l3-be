package enums;

import entities.Rectangle;
import entities.Sim;

public class Main {
    public static void main(String[] args) {
        Rectangle rettangolo1 = new Rectangle(12, 10);
        Rectangle rettangolo2 = new Rectangle(21, 9);
        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();

        Rectangle.stampaDueRettangoli(rettangolo1, rettangolo2);


        Sim sim1 = new Sim(338751265);
        sim1.mostraDatiSim();


    }
}