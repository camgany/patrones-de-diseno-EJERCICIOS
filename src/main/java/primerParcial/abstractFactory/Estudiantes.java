package primerParcial.abstractFactory;

public class Estudiantes {
    private String nombre;
    private int ci;

    public Estudiantes(String nombre, int ci){
        this.nombre=nombre;
        this.ci=ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    public void inscribirse(MateriaType materiaType){
        FactoryMateria.make(materiaType);
        System.out.println("Nombre del estudiante: "+getNombre());
        System.out.println("Carnet de Estudiante: "+getCi());
    }
}
