package packge;

public class Onibus extends Veiculo{

    public Onibus(String modelo){
        super(modelo);
    }

    @Override
    public void accept(Visitor v) {
        v.Visit(this);
    }
}
