package bridge.exercise2;

public class EnvioMar implements IMetodoEnvio{
    @Override
    public void envio(int monto) {
        double montoFinal;
        montoFinal = monto+(monto*0.50);
        System.out.println("Precio con el 50% del precio de envio: "+montoFinal);
    }
}
