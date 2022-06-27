package decorator.exercise;

public class Client {
    public static void main(String[] args) {
        ICuenta basicAccount = new ComponentCuentaBasica("Cameron Dallas",10000.0);
        basicAccount = new DecoratorBancaPorInternet(basicAccount,true);
        basicAccount = new DecoratorSeguro(basicAccount);
        basicAccount = new DecoratorPromocion(basicAccount);
        basicAccount.showInfo();
    }
}