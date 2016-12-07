package pt.ipleira.estg.qwartus.models;

/**
 * Created by roudr on 06/12/2016.
 */

public class Anuncio {

    private String Titulo;
    private String Descricao;
    private String Preco;
    private int Imagem;

    public Anuncio(String titulo, String descricao, String preco, int imagem) {
        Titulo = titulo;
        Descricao = descricao;
        Preco = preco;
        Imagem = imagem;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getPreco() {
        return Preco;
    }

    public void setPreco(String preco) {
        Preco = preco;
    }

    public int getImagem() {
        return Imagem;
    }

    public void setImagem(int imagem) {
        Imagem = imagem;
    }
}
