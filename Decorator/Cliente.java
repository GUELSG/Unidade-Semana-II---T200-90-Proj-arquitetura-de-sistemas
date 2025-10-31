package Decorator;

public class Cliente {
    public static void main(String[] args) {

        // 1. Componente Base: TCPChannel simples
        Channel simpleChannel = new TCPChannel();
        System.out.println("--- 1. Canal TCP Simples ---");
        simpleChannel.send("Hello World");

        System.out.println("\n-------------------------------------");

        // 2. Componente Decorado: TCPChannel + Log
        Channel logChannel = new LogChannel(simpleChannel);
        System.out.println("--- 2. TCP + Log ---");
        logChannel.send("Data for logging");

        System.out.println("\n-------------------------------------");

        // 3. Componente Múltiplo Decorado: UDPChannel + Zip + Buffer + Log
        Channel base = new UDPChannel();

        Channel zip = new ZipChannel(base);

        Channel buffer = new BufferChannel(zip);

        Channel complexChannel = new LogChannel(buffer);

        System.out.println("--- 3. UDP + Zip + Buffer + Log (Empilhado) ---");
        complexChannel.send("Top Secret Report");

        System.out.println("\n--- 3. Recebendo Dados ---");
        String receivedData = complexChannel.receive();
        System.out.println("Client received: " + receivedData);
    }
}