package poo7;

public class Poo7 {

    public static void main(String[] args) {
        Lutador L[] = new Lutador[6];
        L[0] = new Lutador("Pretty Boy", "Fraça", 31, 1.75f, 68.9f, 11, 3, 1, 15f, 20f, 20f);
        L[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3, 22f, 16f, 16f);
        L[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1, 20f, 10f, 25f);
        L[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2, 18f, 14f, 23f);
        L[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3, 17f, 11f, 20f);
        L[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4, 19f, 15f, 22f);
        
        
        L[4].apresentarLutador();
        L[4].status();
    }
    
}
