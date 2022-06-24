package composite.exercise;

public class Leaf extends Component {

    public Leaf(String type, int precio) {
        super(type);
        setPrice(precio);
    }

    @Override
    public void prices() {
        System.out.println();
    }

    @Override
    public void operation() {
        System.out.println("Type: "+getType()+" Price: "+getPrice());
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int position) {
        return null;
    }
}
