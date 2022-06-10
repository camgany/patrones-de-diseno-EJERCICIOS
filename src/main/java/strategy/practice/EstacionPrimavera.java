package strategy.practice;

import java.util.List;

public class EstacionPrimavera implements IEstacion {
    @Override
    public void execute(List<Ropa> ropas) {
        System.out.println("--------------------PRECIOS PARA PRIMAVERA----------------------");
        for (Ropa ropa: ropas
        ) {
            System.out.println("Tipo de ropa: "+ropa.getTipo());
            System.out.println("Precio Normal: "+ropa.getPrecio()+" Bs");
        }
    }
}