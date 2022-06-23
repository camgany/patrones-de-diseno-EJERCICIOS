package bridge.example.exampleConBridge;

public class Rectangulo implements IFigure {

    private IColor color;

    public Rectangulo(IColor color) {
        this.color = color;
    }

    public void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void pintar() {
        System.out.println("pintando Rectangulo ..");
        color.pintar();
    }
}
