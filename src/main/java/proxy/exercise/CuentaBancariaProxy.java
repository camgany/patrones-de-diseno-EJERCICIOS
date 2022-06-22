package proxy.exercise;

public class CuentaBancariaProxy implements ICuentaBancaria {
    private CuentaBancariaSubject realSubject;
    private String nombre;
    private int montoInicial;

    public CuentaBancariaProxy(String nombre, int montoInicial){
        this.nombre = nombre;
        this.montoInicial = montoInicial;
        realSubject= new CuentaBancariaSubject(this.nombre,this.montoInicial);
    }

    @Override
    public void request(Compra compra) {
        // condition
        // filtros
        // verificaciones
        if (compra.getTipoMoneda().equals("Bolivianos")){
            if (compra.getMonto() <= realSubject.getMontoInicial()) {
                System.out.println("--------------------------------------------------------------------------------------------------------------");
                realSubject.request(compra);
            }else{
                System.out.println("El monto ingresado es superior a su saldo. Ingrese un monto inferior a: "+realSubject.getMontoInicial());
            }
        }else {
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            System.out.println("El tipo de moneda entregado es diferente al requerido, el tipo de moneda es: "+compra.getTipoMoneda());

            if (compra.getTipoMoneda().equals("Dolares")){
                double a = compra.getMonto()*6.98;
                compra.setMonto(a);
                if (compra.getMonto() <= realSubject.getMontoInicial()) {
                realSubject.request(compra);
                }else{
                    System.out.println("El monto ingresado es superior a su saldo. Ingrese un monto inferior a: "+realSubject.getMontoInicial());
                }
            }else if (compra.getTipoMoneda().equals("Pesos colombianos")){
                double a = compra.getMonto()*0.0018;
                compra.setMonto(a);
                if (compra.getMonto() <= realSubject.getMontoInicial()) {
                realSubject.request(compra);
                }else{
                    System.out.println("El monto ingresado es superior a su saldo. Ingrese un monto inferior a: "+realSubject.getMontoInicial());
                }
            }
        }
    }
}
