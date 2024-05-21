package Armas;
abstract class Arma {
    public Arma(int cantMuniciones, double alcance, String marca, int calibre, String estado, int legajoPolicia) {
        this.cantMuniciones = cantMuniciones;
        this.alcance = alcance;
        this.marca = marca;
        this.legajoPolicia = legajoPolicia;
        this.calibre = calibre;
        if (estado == "EN MANTENIMIENTO" || estado == "EN USO") {
            this.estado = estado;
        }
    }
    private int cantMuniciones;
    protected double alcance;
    protected String marca;
    public int legajoPolicia;
    protected int calibre;
    private String estado = "NUEVA";

    private boolean enCondicion() {
        return estado == "EN USO" && calibre >= 9;
        //estado “EN USO” y ser un calibre >=9.
    }

    public String toString() {
        return this.marca + " Calibre (" + this.calibre + ") para legajo Policia: " + legajoPolicia;
    }
}