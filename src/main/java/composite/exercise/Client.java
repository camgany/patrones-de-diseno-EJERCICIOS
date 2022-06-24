package composite.exercise;

public class Client {
    public static void main(String []args){
        Composite lab1 = new Composite("Laboratorio 1");
        lab1.add(new Leaf("Computadora 1"));
        lab1.add(new Leaf("Computadora 2"));
        lab1.add(new Leaf("Computadora 3"));
        lab1.add(new Leaf("Computadora 4"));
        lab1.getPrice();

        Composite lab2 = new Composite("Laboratorio 2");
        lab2.add(new Leaf("Computadora 1"));
        lab2.add(new Leaf("Computadora 2"));
        lab2.add(new Leaf("Computadora 3"));
        lab2.add(new Leaf("Computadora 4"));
        lab2.getPrice();

        Composite contenedor = new Composite("Contenedor");
        contenedor.add(lab1);
        contenedor.add(lab2);
        contenedor.getPrice();
    }
}