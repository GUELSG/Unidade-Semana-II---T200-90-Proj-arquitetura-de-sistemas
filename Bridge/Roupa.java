public abstract class Roupa {

    private Cor cor;

    public Cor getCor() {
        return cor;
    }

    public Roupa(Cor cor){
        this.cor = cor;
    }

    public abstract void vestir();
}
