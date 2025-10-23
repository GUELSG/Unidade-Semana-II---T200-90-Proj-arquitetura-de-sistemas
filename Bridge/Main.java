
public class Main {
    public static void main(String[] args) {
        Cor corAzul =  new CorAzul();
        Cor corPreta = new CorPreta();

        Roupa CamisaAzul =  new Camisa(corAzul);
        Roupa CalçaPreta =  new Calça(corPreta);

        CamisaAzul.vestir();
        CalçaPreta.vestir();
    }
}