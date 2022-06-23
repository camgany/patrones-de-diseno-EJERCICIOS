package bridge.exercise2;

public class Client {
    public static void main (String[]args){
        IMetodoEnvio metodoEnvioAire = new EnvioAire();
        IMetodoEnvio metodoEnvioTierra = new EnvioTierra();
        IMetodoEnvio metodoEnvioMar = new EnvioMar();
        IEmpresa empresa1 = new EmpresaSRL(metodoEnvioAire,100,"Zapatos");
        IEmpresa empresa2 = new EmpresaSA(metodoEnvioTierra,150,"Libros");
        IEmpresa empresa3 = new EmpresaSA(metodoEnvioMar,200,"Perfumes");
        empresa1.envioPaquete();
        empresa2.envioPaquete();
        empresa3.envioPaquete();


    }
}
