package state.practice;

import java.util.Random;

public class ConcretePrendido implements IState {
    // attribute
    // methods

    @Override
    public void handle(Computadora context) {
        int a;
        a = new Random().nextInt(20);
        System.out.println("-------------------------PRENDIDO--------------------------");
        System.out.println(a);
        context.setProgramaAbierto(new String[a]);
        System.out.println("Cantidad de recursos abiertos: "+context.getProgramaAbierto().length);
        context.getConsumoMemoria().setConsumo(a*5);
        System.out.print("Consumo de Memoria RAM: " +context.getConsumoMemoria().getConsumo());
        context.getComsumoCPU().setConsumo(a*5);
        System.out.println("Consumo de CPU: " +context.getComsumoCPU().getConsumo());

    }
}