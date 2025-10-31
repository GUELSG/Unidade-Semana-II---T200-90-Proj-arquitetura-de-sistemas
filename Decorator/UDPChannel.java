package Decorator;

public class UDPChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("UDP: Sending -> " + message);
    }

    @Override
    public String receive() {
        return "UDP: Data Received";
    }
}
