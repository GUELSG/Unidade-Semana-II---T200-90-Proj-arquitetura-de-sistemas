package Flyweight;

public class Main {
    public static void main(String[] args) {
        Cafeteria cafe = new Cafeteria();

        // 1. Pedido Expresso (Cria o Flyweight)
        cafe.fazerPedido("Expresso", 1);

        cafe.fazerPedido("Latte", 2);

        cafe.fazerPedido("Expresso", 3);

        cafe.fazerPedido("Latte", 4);

        cafe.fazerPedido("Expresso", 5);

        cafe.fazerPedido("Mocaccino", 6);

    }
}
