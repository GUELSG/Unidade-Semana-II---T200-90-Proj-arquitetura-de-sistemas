package Metodo_Fabrica;

public class FabricaMysql extends FabricaConexao {
    @Override
    public Conexao criarConexao() {
        return new MysqlConexao();
    }
}
