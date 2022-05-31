package iterator.practice;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregateImportadora2 implements IAggregate{
    private List<Automovil> autos;

    public ConcreteAggregateImportadora2(){
        autos = new ArrayList<>();

    }

    public void add(Automovil automovil){
        autos.add(automovil);
    }
    @Override
    public ConcreteIteratorImportadora2 createIterator() {
        return new ConcreteIteratorImportadora2(autos);
    }
}
