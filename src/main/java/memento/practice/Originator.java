package memento.practice;


public class Originator {
    private BaseDatos state;


    public void setMemento(BaseDatos state){
        this.state=state;
    }

    public Memento createMemento(){
        return  new Memento(state);
    }

    public BaseDatos restoreMemento(Memento m){
        this.state= m.getState();
        return this.state;
    }

}