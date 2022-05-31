package abstractFactory.practice.pasajes;

public class Pasajero {
    private String name;
    private String ci;

    public Pasajero(){}

    public Pasajero(String name,String ci){
        this.name=name;
        this.ci=ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
}