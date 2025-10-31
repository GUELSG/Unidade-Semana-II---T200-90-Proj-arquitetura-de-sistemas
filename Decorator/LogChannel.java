package Decorator;

public class LogChannel extends ChannelDecorator {

    public LogChannel(Channel decoratedChannel) {
        super(decoratedChannel);
    }

    @Override
    public void send(String message) {
        System.out.println("Log: Preparing to send message...");
        super.send(message); // Delega para o componente decorado
        System.out.println("Log: Message sent successfully.");
    }
}