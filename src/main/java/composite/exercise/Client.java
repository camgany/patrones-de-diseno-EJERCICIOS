package composite.exercise;

public class Client {
    public static void main (String[]args){
        Leaf computadora1 = new Leaf("computadora",100);
        Leaf computadora2 = new Leaf("computadora",100);
        Leaf computadora3 = new Leaf("computadora",100);
        Leaf computadora4 = new Leaf("computadora",100);

        Composite laboratorio1= new Composite("Laboratorio");
        laboratorio1.add(computadora1);
        laboratorio1.add(computadora2);
        laboratorio1.add(computadora3);
        laboratorio1.add(computadora4);

        Leaf computadora5 = new Leaf("computadora",100);
        Leaf computadora6 = new Leaf("computadora",100);
        Leaf computadora7 = new Leaf("computadora",100);
        Leaf computadora8 = new Leaf("computadora",100);

        Composite laboratorio2= new Composite("laboratorio");
        laboratorio2.add(computadora5);
        laboratorio2.add(computadora6);
        laboratorio2.add(computadora7);
        laboratorio2.add(computadora8);

        Composite contenedorComputadora= new Composite("contenedor computadora");
        contenedorComputadora.add(laboratorio2);
        contenedorComputadora.add(laboratorio1);


        contenedorComputadora.operation();
    }

}
