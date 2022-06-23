package bridge.exercise2;

public class EmpresaSRL implements IEmpresa{
    private IMetodoEnvio metodoEnvio;
    private String nombre;
    private int precio;
    public EmpresaSRL(IMetodoEnvio metodoEnvio, int precio, String nombre) {
        this.metodoEnvio=metodoEnvio;
        this.precio = precio;
        this.nombre = nombre;
    }

    @Override
    public void envioPaquete() {
        System.out.println("------------------------------------------------------");
        System.out.println("Producto: "+nombre);
        System.out.println("Precio: "+precio);
        metodoEnvio.envio(precio);
    }
}
