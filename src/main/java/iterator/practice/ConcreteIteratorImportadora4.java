package iterator.practice;

import java.util.Stack;

public class ConcreteIteratorImportadora4 implements Iterator{
    private Stack<Automovil> automovils;
    private int position;

    public ConcreteIteratorImportadora4(Stack<Automovil> automovils) {
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
