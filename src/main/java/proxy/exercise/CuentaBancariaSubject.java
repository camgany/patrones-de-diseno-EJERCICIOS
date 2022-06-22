package proxy.exercise;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancariaSubject implements ICuentaBancaria {

    private String nombre;
    private double montoInicial;
    private List<Compra> compraList;


    public CuentaBancariaSubject(String nombre, int montoInicial) {
        this.nombre = nombre;
        this.montoInicial = montoInicial;
        compraList = new ArrayList<>();
    }


    @Override
    public void request(Compra compra) {
        compraList.add(compra);
        System.out.println("Guardando su compra............");
        compra.showInfo();
        montoInicial = Math.round((montoInicial - compra.getMonto())* 100.0) / 100.0;
        System.out.println("El monto restante en su tarjeta es de: "+montoInicial+" Bolivianos");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }
}
