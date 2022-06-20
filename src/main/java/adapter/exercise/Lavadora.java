package adapter.exercise;

public class Lavadora implements IAdquiridos {

    private int costo;
    private int tiempoDeGarantiaEnMeses;

    public Lavadora(int costo, int tiempoDeGarantiaEnMeses) {
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

        System.out.println("Costo Lavadora: " + costo);

    }

    @Override
    public void tiempoDeGarantia() {

        System.out.println("Tiempo de garantia Lavadora: " + tiempoDeGarantiaEnMeses + " meses");

    }
}