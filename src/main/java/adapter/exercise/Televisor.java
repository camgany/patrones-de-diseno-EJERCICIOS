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

        System.out.println("Costo Televisor: " + costo );

    }

    @Override
    public void tiempoDeGarantia() {

        System.out.println("Tiempo de garantia televisor: " + tiempoDeGarantiaEnMeses + " meses");

    }
}