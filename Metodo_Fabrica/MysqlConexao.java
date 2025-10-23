package Metodo_Fabrica;

public class MysqlConexao implements Conexao {
    @Override
    public String getTipo() {
        return "Conexão MySQL";
    }
}
