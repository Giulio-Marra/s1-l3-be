package entities;

public class Rectangle {

    //ATTRIBBUTI

    public int altezza;
    public int larghezza;

    //COSTRUTTORI

    public Rectangle(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //METODI

    public static void stampaDueRettangoli(Rectangle rettangolo1, Rectangle rettangolo2) {
        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();

        int totaleArea = (rettangolo1.larghezza * rettangolo1.altezza) + (rettangolo2.larghezza * rettangolo2.altezza);
        int totalePerimetro = (rettangolo1.larghezza + rettangolo1.altezza) * 2 + (rettangolo2.larghezza + rettangolo2.altezza) * 2;
        int totaleComplessivo = totaleArea + totalePerimetro;

        System.out.println("Totale complessivo di aree e perimetri dei due rettangoli: " + totaleComplessivo);
    }

    public void stampaRettangolo() {
        int resultArea = larghezza * altezza;
        int resultPerimetro = 2 * (larghezza + altezza);
        System.out.println("L'area di questo rettangolo è " + resultArea + " mentre il perimetro è " + resultPerimetro);
    }


}
