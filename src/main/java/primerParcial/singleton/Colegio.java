package primerParcial.singleton;

public class Colegio {
    private Cajero cajero;
    private String nombreCole;

    public Colegio(){
        this.cajero = new Cajero(0, "Default");
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public String getNombreCole() {
        return nombreCole;
    }

    public void setNombreCole(String nombreCole) {
        this.nombreCole = nombreCole;
    }

    public void pagarMatricula(int cantidad,Estudiante estudiante){
        Ventanilla.getInstance(this.cajero).pagar(cantidad,estudiante);
    }
}
