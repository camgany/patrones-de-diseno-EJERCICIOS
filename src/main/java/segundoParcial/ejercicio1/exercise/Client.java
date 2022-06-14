package segundoParcial.ejercicio1.exercise;

import java.util.StringTokenizer;

public class Client {
    public static void main(String[] args) {
        Oracion oracion = new Oracion();

        oracion.addOracion("este documento es una prueba");
        oracion.addOracion("el exito solo depende de tu esfuerzo");
        oracion.addOracion("prologo");
        oracion.addOracion("este documento fue actualizado satisfactoriamente");
        oracion.verOracion(1);

    }
}
