package Decorator;

public class BufferChannel extends ChannelDecorator {

    public BufferChannel(Channel decoratedChannel) {
        super(decoratedChannel);
    }

    @Override
    public void send(String message) {
        System.out.println("Buffer: Caching data...");
        super.send(message + " [BUFFERED]"); // Delega com a funcionalidade adicionada
    }
}