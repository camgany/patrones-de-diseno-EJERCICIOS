package bridge.structure;

public class Implementor2 implements Implementor{
    @Override
    public void operation1() {
        System.out.println("Implementor1>operation1");
    }

    @Override
    public void operation2() {
        System.out.println("Implementor1>operation2");
    }
}
