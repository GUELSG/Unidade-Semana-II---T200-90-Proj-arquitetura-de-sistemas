package Metodo_Fabrica;

public class FabricaOracle extends FabricaConexao {
    @Override
    public Conexao criarConexao() {
        return new OracleConexao();
    }
}
