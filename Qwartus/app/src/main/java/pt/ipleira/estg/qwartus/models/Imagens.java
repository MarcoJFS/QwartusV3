package pt.ipleira.estg.qwartus.models;

/**
 * Created by USER on 03/01/2017.
 */

public class Imagens {
    private long id_imagem;
    private int ce_id_anuncio;
    private String caminho;

    public Imagens(int ce_id_anuncio, long id_imagem, String caminho) {
        this.ce_id_anuncio = ce_id_anuncio;
        this.id_imagem = id_imagem;
        this.caminho = caminho;
    }

    public long getId_imagem() {
        return id_imagem;
    }

    public void setId_imagem(long id_imagem) {
        this.id_imagem = id_imagem;
    }

    public int getCe_id_anuncio() {
        return ce_id_anuncio;
    }

    public void setCe_id_anuncio(int ce_id_anuncio) {
        this.ce_id_anuncio = ce_id_anuncio;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
}
