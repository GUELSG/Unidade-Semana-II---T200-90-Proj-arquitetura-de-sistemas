package Metodo_Fabrica;

public class FabricaPostgres extends FabricaConexao {
    @Override
    public Conexao criarConexao() {
        return new PostgresConexao();
    }
}
