package iterator.practice;

import java.util.Stack;

public class ConcreteAggregateImportadora4 implements IAggregate{

    private Stack<Automovil> automovils;

    public ConcreteAggregateImportadora4() {
        automovils = new Stack<>();
    }

    public void add (Automovil automovil){
        automovils.add(automovil);
    }

    @Override
    public ConcreteIteratorImportadora4 createIterator() {
        return new ConcreteIteratorImportadora4(automovils);
    }
}
