package decorator.exercise;

import java.util.Random;

public class DecoratorSeguro extends Decorator {

            Random random = new Random();
    int cantidad = random.nextInt(50);

    public DecoratorSeguro(ICuenta componente){
        super(componente);
    }

    public void showInfo() {
        System.out.println("Se desconto: "+ cantidad + "%");
        double cant = super.getMonto()*(100/cantidad);
        super.setMonto(super.getMonto()-cant);
        super.showInfo();
    }
}
