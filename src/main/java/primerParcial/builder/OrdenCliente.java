package primerParcial.builder;

public class OrdenCliente {
    private String nombre;
    private int nit;
    private Restaurant restaurant;

     public OrdenCliente(String nombre, int nit){
         this.nit=nit;
         this.nombre=nombre;
     }
     public void hacerPedido(BuilderParrilla builderParrilla, Restaurant restaurant){
         restaurant.setBuilder(builderParrilla);
         restaurant.hacerParrilla();
         Parrilla parrilla = restaurant.getParrillaHecha();
         parrilla.showInfo();

     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
