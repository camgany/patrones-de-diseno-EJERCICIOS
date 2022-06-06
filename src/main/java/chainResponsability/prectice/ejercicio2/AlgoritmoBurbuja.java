package chainResponsability.prectice.ejercicio2;


import java.util.ArrayList;

public class AlgoritmoBurbuja implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(ArrayList<Persona> personas) {
        // logica cuando podemos solucionar el problema
        // cuando responsables de solucionar problem
        //Ordenamiento de burbuja
        if (personas.size()>20 && personas.size()<=50){
            System.out.println("---------------------UTILIZARA EL ALGORITMO DE BURBUJA-----------------------");
            boolean sorted = false;
            int temp;
            String n;
            String ci;
            while(!sorted) {
                sorted = true;
                for (int i = 0; i < personas.size()- 1; i++) {
                    if (personas.get(i).getEdad() > personas.get(i+1).getEdad()) {
                        temp = personas.get(i).getEdad();
                        n = personas.get(i).getNombre();
                        ci = personas.get(i).getCi();
                        personas.get(i).setEdad(personas.get(i+1).getEdad());
                        personas.get(i).setNombre(personas.get(i+1).getNombre());
                        personas.get(i).setCi(personas.get(i+1).getCi());
                        personas.get(i+1).setEdad(temp);
                        personas.get(i+1).setNombre(n);
                        personas.get(i+1).setCi(ci);
                        sorted = false;
                    }
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