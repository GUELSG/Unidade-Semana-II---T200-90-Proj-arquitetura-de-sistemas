package packge;

public abstract class Veiculo {

    private String modelo;

    public Veiculo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public abstract void accept(Visitor v);
}
