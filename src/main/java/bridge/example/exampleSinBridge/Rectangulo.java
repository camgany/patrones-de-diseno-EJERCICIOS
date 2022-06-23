package bridge.example.exampleSinBridge;

public class Rectangulo implements IFigure{
    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void pintarRojo() {
        System.out.println("pintando Rectangulo de color rojo");
    }

    @Override
    public void pintarAzul() {
        System.out.println("pintando Rectangulo de color azul");
    }

    @Override
    public void pintarVerde() {
        System.out.println("pintando Rectangulo de color verde");
    }

    @Override
    public void pintarAmarillo() {
        System.out.println("pintando Rectangulo de color amarillo");
    }
}