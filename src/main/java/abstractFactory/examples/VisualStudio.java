package abstractFactory.examples;

import abstractFactory.examples.Ide;

public class VisualStudio implements Ide {
    @Override
    public void showInfo() {
        System.out.println("Este es una instancia de Eclipse");
    }
}

