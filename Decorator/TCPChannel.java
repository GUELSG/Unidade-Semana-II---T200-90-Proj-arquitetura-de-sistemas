package Decorator;

public class TCPChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("TCP: Sending -> " + message);
    }

    @Override
    public String receive() {
        return "TCP: Data Received";
    }
}