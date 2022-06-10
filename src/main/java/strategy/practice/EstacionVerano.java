package strategy.practice;

import java.util.List;

public class EstacionVerano implements IEstacion {
    @Override
    public void execute(List<Ropa> ropas) {
        System.out.println("--------------------PRECIOS PARA VERANO----------------------");
        for (Ropa ropa: ropas
        ) {
            double a = ropa.getPrecio() - ropa.getPrecio()*0.10;
            ropa.setPrecioDescuento(a);
            System.out.println("Tipo de ropa: "+ropa.getTipo());
            System.out.println("Precio - 10%: "+ropa.getPrecioDescuento()+" Bs");
        }
    }
}