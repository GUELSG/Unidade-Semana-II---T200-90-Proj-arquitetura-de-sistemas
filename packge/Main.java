package packge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> lista = new ArrayList<Veiculo>();
        lista.add(new Carro("Fusca"));
        lista.add(new Onibus("Mercedes-Benz"));
        lista.add(new Carro("Palio"));
        lista.add(new Onibus("Wolskfagen"));

        Visitor v =  new PrintVisitor();
        for(Veiculo veiculo: lista){
            veiculo.accept(v);
        }

    }
}
