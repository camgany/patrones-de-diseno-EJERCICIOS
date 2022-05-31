package iterator.practice;

import java.util.List;

public class ConcreteIteratorImportadora2 implements Iterator{
    private int position;
    private List<Automovil> autos;

    public ConcreteIteratorImportadora2(List<Automovil> autos){
        this.autos = autos;
    }
    @Override
    public Object next() {
        return autos.get(position++);
    }

    @Override
    public boolean hasNext() {
        return autos.size() != 0 && position < autos.size();
    }
}
