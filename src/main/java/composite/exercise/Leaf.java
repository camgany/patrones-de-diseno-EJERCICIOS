package composite.exercise;

public class Leaf extends Component {
    private double price  = 100;

    public Leaf(String name){
        super(name);
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public double getPrice() {
        return price;
    }
}
