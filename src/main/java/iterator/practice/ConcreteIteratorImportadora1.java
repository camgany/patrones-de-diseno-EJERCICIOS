package iterator.practice;

public class ConcreteIteratorImportadora1 implements Iterator{
    private int position;
    private Automovil [] importadora;

    public ConcreteIteratorImportadora1(Automovil [] importadora){
        this.importadora=importadora;
    }

    @Override
    public Object next() {
        return importadora[position++];
    }

    @Override
    public boolean hasNext() {
        return importadora.length != 0 && position < importadora.length;
    }
}
