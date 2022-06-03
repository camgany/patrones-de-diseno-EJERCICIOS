package memento.practice;

public class Client {
    public static void main(String[] ardssd) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        BaseDatos baseDatos;
        baseDatos = new BaseDatos();
        baseDatos.add(new Persona("Laura Bozzo", "45467", 23));
        baseDatos.add(new Persona("Maria Perez","76575",41));
        originator.setMemento(baseDatos);
        caretaker.addMemento("Backups Enero",originator.createMemento());

        baseDatos = new BaseDatos();
        baseDatos.add(new Persona("Zayn Malik","76575",22));
        baseDatos.add(new Persona("Ricardo Perez","98724",11));
        baseDatos.add(new Persona("hailey Baldwin","34325",24));
        originator.setMemento(baseDatos);
        caretaker.addMemento("Backups Febrero",originator.createMemento());

        baseDatos = new BaseDatos();
        baseDatos.add(new Persona("Maria Becerra","34355",33));
        baseDatos.add(new Persona("Manu Rios","34463",44));
        originator.setMemento(baseDatos);
        caretaker.addMemento("Backups Marzo",originator.createMemento());

        baseDatos = new BaseDatos();
        baseDatos.add(new Persona("Justin Bieber","35232",23));
        baseDatos.add(new Persona("Aaron Piper","21323",21));
        originator.setMemento(baseDatos);
        caretaker.addMemento("Backups Abril",originator.createMemento());

        baseDatos = new BaseDatos();
        baseDatos.add(new Persona("Mauro Monzon","21312",22));
        originator.setMemento(baseDatos);
        caretaker.addMemento("Backups Mayo",originator.createMemento());

        baseDatos= originator.restoreMemento(caretaker.getMemento("Backups Febrero"));
        System.out.println("************* VALORES ********************");
        baseDatos.showInfo();

    }
}
