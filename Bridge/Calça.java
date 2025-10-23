public class Calça extends Roupa{

    public Calça(Cor cor){
        super(cor);
    }
    @Override
    public void vestir() {
        System.out.println("Vestindo Calça ->");
        getCor().addCor();
    }
}
