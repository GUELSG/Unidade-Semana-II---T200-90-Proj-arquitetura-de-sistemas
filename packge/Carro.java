package packge;

public class Carro  extends Veiculo{
    public Carro(String modelo){
        super(modelo);
    }

    @Override
    public void accept(Visitor v) {
        v.Visit(this);
    }
}
