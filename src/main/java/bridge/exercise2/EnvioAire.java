package bridge.exercise2;

public class EnvioAire implements IMetodoEnvio{

    @Override
    public void envio(int monto) {
        double montoFinal;

        montoFinal = monto+(monto*0.10);
        System.out.println("Precio con el 10% del precio de envio: "+montoFinal);

    }
}
