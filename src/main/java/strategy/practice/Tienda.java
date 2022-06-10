package strategy.practice;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    List<Ropa> ropas = new ArrayList<>();
    IEstacion strategy;
    String nombre;
    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public List<Ropa> getRopas() {
        return ropas;
    }

    public void setRopas(List<Ropa> ropas) {
        this.ropas = ropas;
    }

    public void addRopa(Ropa ropa){
        ropas.add(ropa);
    }
    public IEstacion getStrategy() {
        return strategy;
    }

    public void setStrategy(IEstacion strategy) {
        this.strategy = strategy;
    }


    public void execute(){
        System.out.println("###########################################################################");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ TIENDA "+nombre+" ~~~~~~~~~~~~~~~~~~~~~~~~");
        strategy.execute(ropas);
    }


}
