package Metodo_Fabrica;

public class OracleConexao implements Conexao {
    @Override
    public String getTipo() {
        return "Conexão Oracle";
    }
}
