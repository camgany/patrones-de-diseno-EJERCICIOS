package primerParcial.abstractFactory;


public class Client {
    public static void main (String[]args){

    Estudiantes laura = new Estudiantes("Laura Bozzo",4547658);
    laura.inscribirse(MateriaType.HISTORIA);

    Estudiantes jaden = new Estudiantes("Jaden Hosser",123255);
    jaden.inscribirse(MateriaType.MATEMATICA);

    Estudiantes mario = new Estudiantes("Mario Bautista",797809);
    mario.inscribirse(MateriaType.INGLES);

    Estudiantes juanpa = new Estudiantes("Juan Pablo Zurita",6576533);
    juanpa.inscribirse(MateriaType.LENGUAJE);

    Estudiantes nessa = new Estudiantes("Nessa Barrent",798700);
    nessa.inscribirse(MateriaType.LENGUAJE);
    }
}
