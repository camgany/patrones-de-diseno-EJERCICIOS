package composite.exercise;

public abstract class Component {

    private String type;

    public Component(String type)    {
        this.type =type;
        System.out.println(type);
    }

    public String getType(){
        return this.type;
    }

    public abstract void add(Component component);
    public abstract double getPrice();

}
