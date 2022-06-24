package composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> compositeList = new ArrayList<>();
    private List<Integer> priceList = new ArrayList<>();
    private int cant = 0;

    public Composite(String type) {
        super(type);
        cant = this.getPrice() + cant;
        this.setPrice(cant);
    }

    @Override
    public void operation() {
        System.out.println("Type: "+getType()+" Price: "+getPrice());

    }

    @Override
    public void prices() {
        for(Component computerComponent : compositeList) {

            computerComponent.operation();
            this.setPrice(this.getPrice() + computerComponent.getPrice());

        }
    }

    @Override
    public void add(Component component) {
        compositeList.add(component);
    }

    @Override
    public void remove(Component component) {
        compositeList.remove(component);
    }

    @Override
    public Component getChild(int position) {
        return compositeList.get(position);
    }
}
