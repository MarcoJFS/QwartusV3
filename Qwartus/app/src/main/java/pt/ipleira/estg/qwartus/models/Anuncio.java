package pt.ipleira.estg.qwartus.models;

/**
 * Created by roudr on 06/12/2016.
 */

public class Anuncio {

    private long id_anuncio;
    private int ce_id_user;
    private String asunto;
    private String preco;
    private String descricao;
    private int id_distrito;
    private int id_concelho;

    public Anuncio(long id_anuncio, int ce_id_user, String asunto, String preco, String descricao, int id_distrito, int id_concelho) {
        this.id_anuncio = id_anuncio;
        this.ce_id_user = ce_id_user;
        this.asunto = asunto;
        this.preco = preco;
        this.descricao = descricao;
        this.id_distrito = id_distrito;
        this.id_concelho = id_concelho;
    }

    public long getId_anuncio() {
        return id_anuncio;
    }

    public void setId_anuncio(long id_anuncio) {
        this.id_anuncio = id_anuncio;
    }

    public int getCe_id_user() {
        return ce_id_user;
    }

    public void setCe_id_user(int ce_id_user) {
        this.ce_id_user = ce_id_user;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }

    public int getId_concelho() {
        return id_concelho;
    }

    public void setId_concelho(int id_concelho) {
        this.id_concelho = id_concelho;
    }
}
