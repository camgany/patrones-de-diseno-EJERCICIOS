package visitor.exercise;

public interface ILibreCambista {

    void visitarPais(ConcreteBolivia bolivia, EleccionDeCambio eleccionDeCambio);
    void visitarPais(ConcreteBrasil brasil, EleccionDeCambio eleccionDeCambio);
    void visitarPais(ConcreteArgentina argentina, EleccionDeCambio eleccionDeCambio);
    void visitarPais(ConcreteItalia italia, EleccionDeCambio eleccionDeCambio);



}