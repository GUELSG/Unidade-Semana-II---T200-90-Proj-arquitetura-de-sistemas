package packge;

public class PrintVisitor implements Visitor{
    @Override
    public void Visit(Carro c) {
        System.out.println("Visitando entidade Carro:" + c.getModelo());
    }

    @Override
    public void Visit(Onibus o) {
        System.out.println("Visitando entidade Onibus: " + o.getModelo());
    }

    @Override
    public void Visit(Bicicleta b) {
        System.out.println("Visitando entidade Bicileta:" + b.getModelo());
    }


}
