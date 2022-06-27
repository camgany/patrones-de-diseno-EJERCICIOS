package decorator.exercise;

public class DecoratorBancaPorInternet extends Decorator {
    private boolean enable;

    public DecoratorBancaPorInternet(ICuenta componente, boolean enable){
        super(componente);
        this.enable = enable;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("La Banca Por Internet Se Encuentra: " + enable);
    }

    @Override
    public Double getMonto() {
        return super.getMonto();
    }

    @Override
    public void setMonto(Double monto) {
        super.setMonto(monto);
    }
}
