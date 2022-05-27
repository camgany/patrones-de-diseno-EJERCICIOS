package primerParcial.singleton;


public class Client {
    public static void main(String [] args){
        Colegio colegio = new Colegio();
        colegio.setCajero(new Cajero(35234324, "Celia Lora"));

        colegio.pagarMatricula(100, new Estudiante("Mario Bautista",4537675));
        colegio.pagarMatricula(250, new Estudiante("Juan Pablo Zurita",412355));
        colegio.pagarMatricula(300, new Estudiante("Mario Ruiz",13545));
        colegio.pagarMatricula(350, new Estudiante("Alejandro Patino",876985));
        colegio.pagarMatricula(600, new Estudiante("Paula Galindo",5653768));

    }
}
