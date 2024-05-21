package Armas;
public class Corta extends Arma {
    public Corta(int cantMuniciones, double alcance, String marca, int calibre, String estado, boolean esAutomatica, int legajoPolicia) {
        super(cantMuniciones, alcance, marca, calibre, estado, legajoPolicia);
        this.esAutomatica = esAutomatica;
    }
    private boolean esAutomatica;
    private boolean efectividadMts() {
        return this.alcance > 200;
    }

    public String toString() {
        String mensaje = super.toString();

        if (esAutomatica) {
            mensaje += " - AUTOMATICA: SI";
        } else {
            mensaje += " - AUTOMATICA: NO";
        }

        mensaje += " - ALCANCE: " + this.alcance + "m";

        if (efectividadMts()) {
            mensaje += " - EFECTIVA: SI";
        } else {
            mensaje += " - EFECTIVA: NO";
        }

        return mensaje;
    }
}
