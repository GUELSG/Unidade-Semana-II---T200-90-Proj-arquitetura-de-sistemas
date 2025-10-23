package Metodo_Fabrica;

public class Main {
    public static void main(String[] args) {

        FabricaConexao fabricaOracle = new FabricaOracle();
        FabricaConexao fabricaPostgres = new FabricaPostgres();
        FabricaConexao fabricaMysql = new FabricaMysql();

        Conexao c1 = fabricaOracle.criarConexao();
        Conexao c2 = fabricaPostgres.criarConexao();
        Conexao c3 = fabricaMysql.criarConexao();

        System.out.println(c1.getTipo());
        System.out.println(c2.getTipo());
        System.out.println(c3.getTipo());
    }
}