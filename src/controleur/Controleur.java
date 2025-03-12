package controleur;

public class Controleur {

    private final int LIG = 8;
    private final int COL = 10;

    private Metier metier;
    private Vue    vue;

    public Controleur()
    {
        this.metier = new Metier(LIG, COL);
        this.vue    = new Vue();
    }
}
