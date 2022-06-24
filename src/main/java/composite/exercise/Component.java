package composite.exercise;

public abstract class Component {

    private String type;
    private int price;

    public Component(String type) {
        this.type = type;
        System.out.println("(Constructor)Component > this.attribute1: "+this.type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void prices();
    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int position);
}
