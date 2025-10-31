package Decorator;

public class ZipChannel extends ChannelDecorator {

    public ZipChannel(Channel decoratedChannel) {
        super(decoratedChannel);
    }

    @Override
    public void send(String message) {
        String compressedMessage = "{" + message + "} [ZIPPED]";
        System.out.println("Zip: Compressing message...");
        super.send(compressedMessage); // Delega para o componente decorado
    }

    @Override
    public String receive() {
        return super.receive() + " [DECOMPRESSING]";
    }
}