package Composite;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements ComponenteSistemaArquivos {
    private String nome;
    private List<ComponenteSistemaArquivos> filhos = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteSistemaArquivos componente) {
        filhos.add(componente);
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "Diretório: " + nome);
        for (ComponenteSistemaArquivos componente : filhos) {
            componente.exibir(indentacao + "    "); // Recursão para os filhos
        }
    }
}
