package Armas;
public class Larga extends Arma implements Comparable {
    public Larga(int cantMuniciones, double alcance, String marca, int calibre, String estado, String justifUso, int nivelArma, boolean tieneSello, int legajoPolicia) {
        super(cantMuniciones, alcance, marca, calibre, estado, legajoPolicia);
        this.justifUso = justifUso;
        this.nivelArma = nivelArma;
        this.tieneSello = tieneSello;
    }
    private String justifUso;
    private int nivelArma;
    private boolean tieneSello;

    public int getNivelArma() {
        return nivelArma;
    }

    public void setNivelArma(int nivelArma) {
        if (nivelArma >= 1 && nivelArma <= 5) {
            this.nivelArma = nivelArma;
        } else {
            System.out.println(this.marca + " - Nivel fuera de rango (limite entre 1 y 5. Valor ingresado " + nivelArma + ")");
        }
    }
    public boolean compareTo(Larga o) {
        boolean resultado = nivelArma > o.getNivelArma();

        String mensaje = this.marca + " ES MAYOR NIVEL QUE " + o.marca + "? ";

        if (resultado) {
            mensaje += "SI";
        } else {
            mensaje += "NO";
        }

        System.out.println(mensaje);

        return resultado;
    }
    public String toString() {
        String mensaje = super.toString() + " - ";

        if (tieneSello) {
            mensaje += "TIENE SELLO RENAR";
        } else {
            mensaje += "NO TIENE SELLO RENAR";
        }

        mensaje += " - JUSTIFICACION: " + justifUso;

        mensaje += " - NIVEL DE ARMA: " + nivelArma;

        return mensaje;
    }
}