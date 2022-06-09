package state.practice;

public class Computadora {
    //computadora
    //apagado, prendido y reiniciar
    private ComsumoCPU comsumoCPU;
    private ConsumoMemoria consumoMemoria;
    private ProgramaAbierto programaAbierto;
    private IState state = new ConcreteApagado();

    public Computadora(){
        comsumoCPU = new ComsumoCPU();
        consumoMemoria = new ConsumoMemoria();
        programaAbierto = new ProgramaAbierto();
        programaAbierto.programas.clear();
        consumoMemoria.setConsumo(10);
        comsumoCPU.setConsumo(10);
    }

    public ComsumoCPU getComsumoCPU() {
        return comsumoCPU;
    }

    public void setComsumoCPU(ComsumoCPU comsumoCPU) {
        this.comsumoCPU = comsumoCPU;
    }

    public ConsumoMemoria getConsumoMemoria() {
        return consumoMemoria;
    }

    public void setConsumoMemoria(ConsumoMemoria consumoMemoria) {
        this.consumoMemoria = consumoMemoria;
    }

    public ProgramaAbierto getProgramaAbierto() {
        return programaAbierto;
    }

    public void setProgramaAbierto(ProgramaAbierto programaAbierto) {
        this.programaAbierto = programaAbierto;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void request (){
        System.out.println("**************************INFORMACION DE LA COMPUTADORA**************************");
        this.state.handle(this);
    }
}