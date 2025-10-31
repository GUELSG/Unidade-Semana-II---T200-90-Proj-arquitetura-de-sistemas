package Decorator;

public abstract class ChannelDecorator implements Channel {

    private Channel decoratedChannel;

    public ChannelDecorator(Channel decoratedChannel) {
        this.decoratedChannel = decoratedChannel;
    }

    @Override
    public void send(String message) {
        this.decoratedChannel.send(message);
    }

    @Override
    public String receive() {
        return this.decoratedChannel.receive();
    }
}