package Composite;

public class Main {
    public static void main(String[] args) {

        ComponenteSistemaArquivos foto = new Arquivo("minha_foto.jpg");
        ComponenteSistemaArquivos documento = new Arquivo("relatorio.docx");

        Diretorio documentos = new Diretorio("Documentos");
        Diretorio imagens = new Diretorio("Imagens");

        documentos.adicionar(documento);
        imagens.adicionar(foto);

        Diretorio raiz = new Diretorio("C:");
        raiz.adicionar(documentos);
        raiz.adicionar(imagens);

        raiz.exibir("");
    }
}
