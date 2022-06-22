package proxy.exercise;

public class Compra {

    String producto;
    String tipo;
    double monto;
    String tipoMoneda;

    public Compra(String producto, String tipo, double monto, String tipoMoneda) {
        this.producto = producto;
        this.tipo = tipo;
        this.monto = monto;
        this.tipoMoneda = tipoMoneda;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
    public void showInfo(){
        System.out.println("Compra: ");
        System.out.println("  -Tipo: "+tipo);
        System.out.println("  -Producto: "+producto);
        System.out.println("  -Monto: "+Math.round(monto * 100.0) / 100.0+" Bolivianos");
    }
}
