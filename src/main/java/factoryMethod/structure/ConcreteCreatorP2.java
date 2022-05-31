package factoryMethod.structure;

public class ConcreteCreatorP2 extends Creator{
    // puede tener mas logica

    @Override
    public ConcreteProduct2 factoryMethodProduct() {
        ConcreteProduct2 product= new ConcreteProduct2();
        // llenar
        // instaacias objectos
        // agregacion
        // logica de creacion
        return product;
    }
}
