import Armas.Corta;
import Armas.Larga;

public class Main {
    public static void main(String[] args) {

        Policia policia1 = new Policia("Gomez", "Gonzalo", 001);
        Corta armaCorta1 = new Corta(6,50, "Colt", 12, "NUEVA",
                false, policia1.legajo);

        Policia policia2 = new Policia("Perez", "Gustavo", 002);
        Larga armaLarga1 = new Larga(2,300, "Remington", 30, "EN USO",
                "Aprobado por Chayanne", 3, true, policia2.legajo);

        Policia policia3 = new Policia("Milazzo", "Franco", 003);
        Larga armaLarga2 = new Larga(7,300, "Winchester", 70, "EN MANTENIMIENTO",
                "Pendiente", 5, false, policia3.legajo);

        System.out.println(armaLarga1);
        System.out.println(armaLarga2);
        System.out.println(armaCorta1);

        armaLarga2.setNivelArma(99);
        armaLarga1.compareTo(armaLarga2);
        armaLarga2.compareTo(armaLarga1);
    }
}
