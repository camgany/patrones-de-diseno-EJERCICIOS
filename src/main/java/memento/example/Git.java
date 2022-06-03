package memento.example;

public class Git {
    private Codigo state;

    public void setCommit(Codigo state){
        this.state=state;
    }

    public Memento createCommit(){
        return  new Memento(state);
    }

    public Codigo restoreCommit(Memento m){
        System.out.println("***** restaurando ****");
        this.state= m.getState();
        return this.state;
    }

}