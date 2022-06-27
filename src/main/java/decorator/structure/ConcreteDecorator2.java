package decorator.structure;

public class ConcreteDecorator2 extends Decorator{

    private String attribute1;
    private String attribute2;

    public ConcreteDecorator2(IComponent componentBase) {
        super(componentBase);
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Override
    public void operation(){
        super.operation();
        // decorando la funcionalidad
        addBehavior();
        attribute1="nueva costo";
        System.out.println("ConcreteDecorator2> valor attribute: "+attribute1);
    }

    public void addBehavior(){
        System.out.println("ConcreteDecorator2> nuevo comportamiento ....");
    }

}
