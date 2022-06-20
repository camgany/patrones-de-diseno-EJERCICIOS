package adapter.exercise;

public class Refrigerador implements IAdquiridos {

    private int costo;
    private int tiempoDeGarantiaEnMeses;

    public Refrigerador(int costo, int tiempoDeGarantiaEnMeses) {
        this.costo = costo;
        this.tiempoDeGarantiaEnMeses = tiempoDeGarantiaEnMeses;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTiempoDeGarantiaEnMeses() {
        return tiempoDeGarantiaEnMeses;
    }

    public void setTiempoDeGarantiaEnMeses(int tiempoDeGarantiaEnMeses) {
        this.tiempoDeGarantiaEnMeses = tiempoDeGarantiaEnMeses;
    }

    @Override
    public void costo() {

        System.out.println("Costo refrigerador: " + costo + "$");

    }

    @Override
    public void tiempoDeGarantia() {

        System.out.println("Tiempo de garantia refrigerador: " + tiempoDeGarantiaEnMeses + " meses");

    }
}
