public class TestBola {
    public static void main(String[] args) {
        double jariJari = 5;
        Bola bola = new Bola();
        bola.setJariJari(jariJari);

        System.out.println("Diameter bola: " + bola.showDiameter());
        System.out.println("Luas permukaan bola: " + bola.showLuasPermukaan());
        System.out.println("Volume bola: " + bola.showVolume());

        bola.setJariJari(10);

        System.out.println("Diameter bola: " + bola.showDiameter());
        System.out.println("Luas permukaan bola: " + bola.showLuasPermukaan());
        System.out.println("Volume bola: " + bola.showVolume());
    }
}