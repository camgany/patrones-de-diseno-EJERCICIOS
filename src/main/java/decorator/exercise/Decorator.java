package decorator.exercise;

public abstract class Decorator implements ICuenta {
    private ICuenta cuenta;

    public Decorator(ICuenta cuenta){
        this.cuenta = cuenta;
    }

    public void showInfo(){
        cuenta.showInfo();
    }

    private ICuenta getComponent(){
        return cuenta;
    }

    @Override
    public Double getMonto() {
        return cuenta.getMonto();
    }

    @Override
    public void setMonto(Double monto) {
        cuenta.setMonto(monto);
    }
}
