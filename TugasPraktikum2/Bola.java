public class Bola {
    private double jariJari;

    public Bola() {
        this.jariJari = 0;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return this.jariJari;
    }

    public double showDiameter() {
        return 2 * this.jariJari;
    }

    public double showLuasPermukaan() {
        return 4 * Math.PI * this.jariJari * this.jariJari;
    }

    public double showVolume() {
        return 4 / 3 * Math.PI * this.jariJari * this.jariJari * this.jariJari;
    }
}