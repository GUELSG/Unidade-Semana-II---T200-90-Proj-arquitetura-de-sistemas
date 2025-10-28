package packge;

public class Bicicleta extends Veiculo{


    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public void accept(Visitor v) {
        v.Visit(this);
    }
}
