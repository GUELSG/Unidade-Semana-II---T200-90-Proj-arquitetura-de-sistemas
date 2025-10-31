package Flyweight;

public class TipoCafe {
    private final String sabor;
    private final String ingredientes;
    private final double precoBase;

    public TipoCafe(String sabor, String ingredientes, double precoBase) {
        this.sabor = sabor;
        this.ingredientes = ingredientes;
        this.precoBase = precoBase;
        System.out.println("--- Criando novo Flyweight: Tipo de Café " + sabor + " ---");
    }

    public void servirCafe(int numeroMesa) {
        System.out.println("Servindo " + sabor + " (Ingredientes: " + ingredientes +
                ") na Mesa: " + numeroMesa + ". Preço Base: R$" + precoBase);
    }
}
