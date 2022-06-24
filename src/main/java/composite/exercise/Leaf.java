package composite.exercise;

public class Leaf extends Component {
    public Leaf(String type) {
        super(type);
    }

    @Override
    public void operation() {
        setPrice(100);
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
