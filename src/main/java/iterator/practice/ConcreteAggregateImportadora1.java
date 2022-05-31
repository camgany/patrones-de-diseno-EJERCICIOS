package iterator.practice;

public class ConcreteAggregateImportadora1 implements IAggregate{
    private int position;
    private Automovil [] importadora;

    public ConcreteAggregateImportadora1(){
        importadora = new Automovil[2];
    }

    public void add (Automovil automovil){
        importadora[position]=automovil;
        position++;
    }
    @Override
    public ConcreteIteratorImportadora1 createIterator() {
        return new ConcreteIteratorImportadora1(importadora);
    }
}
