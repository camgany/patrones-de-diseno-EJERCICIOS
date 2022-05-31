package factoryMethod.structure;

public class ConcreteCreatorP1 extends Creator{
    // puede tener mas logica

    @Override
    public ConcreteProduct1 factoryMethodProduct() {
        ConcreteProduct1 product= new ConcreteProduct1();
        // llenar
        // instaacias objectos
        // agregacion
        // logica de creacion
        return product;
    }
    //HEREDA DE LA CLASE QUE CREAMOS
}
