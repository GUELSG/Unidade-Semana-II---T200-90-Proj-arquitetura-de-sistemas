package Flyweight;
import java.util.HashMap;
import java.util.Map;

public class FabricaTipoCafe {

    private static final Map<String, TipoCafe> cache = new HashMap<>();

    public static TipoCafe getTipoCafe(String sabor) {

        if (!cache.containsKey(sabor)) {
            TipoCafe novoTipo;


            if ("Expresso".equals(sabor)) {
                novoTipo = new TipoCafe(sabor, "Grãos fortes, 90ºC", 5.00);
            } else if ("Latte".equals(sabor)) {
                novoTipo = new TipoCafe(sabor, "Expresso + Leite vaporizado, 70ºC", 8.50);
            } else {
                novoTipo = new TipoCafe(sabor, "Padrão", 4.00);
            }

            cache.put(sabor, novoTipo);
        }

        return cache.get(sabor);
    }
}