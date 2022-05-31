package iterator.practice;

import java.util.Vector;

public class ConcreteAggregateImportadora3 implements IAggregate{
    private Vector<Automovil> automovils;

    public ConcreteAggregateImportadora3() {
        automovils = new Vector<>();
    }

    public void add (Automovil automovil){
        automovils.add(automovil);
    }
    @Override
    public ConcreteIteratorImportadora3 createIterator() {
        return new ConcreteIteratorImportadora3(automovils);
    }
}
