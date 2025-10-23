package Metodo_Fabrica;

public class PostgresConexao implements Conexao {
    @Override
    public String getTipo() {
        return "Conexão PostgreSQL";
    }
}
