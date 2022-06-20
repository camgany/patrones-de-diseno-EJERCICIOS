package adapter.exercise;

public class Televisor implements IAdquiridos {

    private int costo;
    private int tiempoDeGarantiaEnMeses;

    public Televisor(int costo, int tiempoDeGarantiaEnMeses) {
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

        System.out.println("El costo del televisor es de: " + costo + "$");

    }

    @Override
    public void tiempoDeGarantia() {

        System.out.println("El tiempo de garantia del televisor es de: " + tiempoDeGarantiaEnMeses + " meses");

    }
}