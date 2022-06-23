package bridge.exercise2;

public class EnvioTierra implements IMetodoEnvio{

    @Override
    public void envio(int monto) {
        double montoFinal;
        montoFinal = monto+(monto*0.05);
        System.out.println("Precio con el 5% del precio de envio: "+montoFinal);
    }
}