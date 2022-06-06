package chainResponsability.prectice.ejercicio2;


import java.util.ArrayList;

public class AlgoritmoInsercion implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(ArrayList<Persona> personas) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        if (personas.size()> 50){
            System.out.println("---------------------UTILIZARA EL ALGORITMO POR INSERCION-----------------------");
            for (int i=1; i < personas.size(); i++) {
                int aux = personas.get(i).getEdad();
                String n = personas.get(i).getNombre();
                String ci = personas.get(i).getCi();
                int j;
                for (j=i-1; j >= 0 && personas.get(j).getEdad() > aux; j--){
                    personas.get(j+1).setEdad(personas.get(j).getEdad());
                    personas.get(j+1).setNombre(personas.get(j).getNombre());
                    personas.get(j+1).setCi(personas.get(j).getCi());
                }
                personas.get(j+1).setEdad(aux);
                personas.get(j+1).setNombre(n);
                personas.get(j+1).setCi(ci);
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
