package Composite;

public class Arquivo implements ComponenteSistemaArquivos {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "Arquivo: " + nome);
    }
}
