package chainResponsability.prectice.ejercicio2;

import java.util.ArrayList;

public class AlgoritmoSeleccion implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(ArrayList<Persona> personas) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        //Método de Ordenación por Selección.
        if (personas.size() <= 20){
            System.out.println("---------------------UTILIZARA EL ALGORITMO POR SELECCION-----------------------");
            int i, j, menor, posi, tmp;
            String nt;
            String ci;
            for (i = 0; i < personas.size() - 1; i++) {
                menor = personas.get(i).getEdad();

                posi = i;
                for (j = i + 1; j < personas.size(); j++){
                    if (personas.get(j).getEdad() < menor) {
                        menor = personas.get(j).getEdad();
                        posi = j;
                    }
                }
                if (posi != i){
                    tmp = personas.get(i).getEdad();
                    personas.get(i).setEdad(personas.get(posi).getEdad());
                    personas.get(posi).setEdad(tmp);

                    nt = personas.get(i).getNombre();
                    personas.get(i).setNombre(personas.get(posi).getNombre());
                    personas.get(posi).setNombre(nt);

                    ci = personas.get(i).getCi();
                    personas.get(i).setCi(personas.get(posi).getCi());
                    personas.get(posi).setCi(ci);
                }
            }
            for (int k = 0; k < personas.size();k++){
                System.out.println("Nombre: "+ personas.get(k).getNombre() + " Edad: "+personas.get(k).getEdad());
            }
        } else {
            next.criteriaHandler(personas);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
