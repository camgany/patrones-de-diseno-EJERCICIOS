package decorator.exercise;

public class ComponentCuentaBasica implements ICuenta {

    private Double monto;
    private String nombre;


    public ComponentCuentaBasica(String nombrePropietario, Double monto){
        this.nombre = nombrePropietario;
        this.monto=monto;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public Double getMonto() {
        return monto;
    }

    @Override
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void showInfo(){
        System.out.println("Nombre del Propietario: "+ nombre);
        System.out.println("Monto: "+monto+" Bs.");
        System.out.println();
    }
}