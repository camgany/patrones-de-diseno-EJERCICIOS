package iterator.practice;

import java.util.Vector;

public class ConcreteIteratorImportadora3 implements Iterator{

    private Vector<Automovil> automovils;
    private int position;

    public ConcreteIteratorImportadora3(Vector<Automovil> automovils) {
        this.automovils = automovils;
        position = 0;
    }

    @Override
    public Object next() {
        return automovils.get(position++);
    }

    @Override
    public boolean hasNext() {
        return automovils.size() != 0 && position < automovils.size();
    }
}
