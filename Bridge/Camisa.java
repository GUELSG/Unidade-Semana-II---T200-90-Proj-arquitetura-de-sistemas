public class Camisa extends Roupa{

    public Camisa(Cor cor){
        super(cor);
    }

    @Override
    public void vestir() {
        System.out.println("Vestindo Camiseta ->");
        getCor().addCor();
    }
}
