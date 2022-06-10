package strategy.practice;

import java.util.List;

public class EstacionOtono implements IEstacion {
    @Override
    public void execute(List<Ropa> ropas) {
        System.out.println("--------------------PRECIOS PARA OTOÑO----------------------");
        for (Ropa ropa: ropas
        ) {
            double a = ropa.getPrecio() - ropa.getPrecio()*0.50;
            ropa.setPrecioDescuento(a);
            System.out.println("Tipo de ropa: "+ropa.getTipo());
            System.out.println("Precio -50%: "+ropa.getPrecioDescuento()+" Bs");
        }
    }
}