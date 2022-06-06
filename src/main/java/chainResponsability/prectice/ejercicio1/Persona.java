package chainResponsability.prectice.ejercicio1;

public class Persona {
    private String certificado;
    private int pago;
    private int ficha;

    public Persona(){
        this.certificado = "no tiene";
        this.pago = 0;
        this.ficha = 0;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }
}
