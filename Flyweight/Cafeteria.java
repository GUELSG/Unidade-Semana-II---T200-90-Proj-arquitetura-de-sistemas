package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Cafeteria {

    private final Map<Integer, TipoCafe> pedidos = new HashMap<>();

    public void fazerPedido(String tipoCafe, int numeroMesa) {
        System.out.println("\n[Pedido] Cliente na mesa " + numeroMesa + " pediu um " + tipoCafe);

        TipoCafe cafe = FabricaTipoCafe.getTipoCafe(tipoCafe);

        pedidos.put(numeroMesa, cafe);

        cafe.servirCafe(numeroMesa);
    }

}