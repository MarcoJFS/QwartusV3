package pt.ipleira.estg.qwartus.models;

/**
 * Created by roudr on 06/12/2016.
 */

public class Anuncio {

    private long id_anuncio;
    private int ce_id_user;
    private String asunto;
    private int n_pessoas;
    private Float preco;
    private String descricao;
    private String coordenadas;
    private String imagem0;
    private String imagem1;
    private String imagem2;
    private String imagem3;
    private String status;
    private int id_distrito;
    private int id_concelho;

    /*public Anuncio(int ce_id_user, String asunto, Float preco, String descricao, int id_distrito, int id_concelho) {
        //this.id_anuncio = id_anuncio;
        this.ce_id_user = ce_id_user;
        this.asunto = asunto;
        this.preco = preco;
        this.descricao = descricao;
        this.id_distrito = id_distrito;
        this.id_concelho = id_concelho;
    }*/

    public Anuncio(long id_anuncio, int ce_id_user, String asunto, int n_pessoas, Float preco, String descricao, String coordenadas, String imagem0, String imagem1, String imagem2, String imagem3, String status, int id_distrito, int id_concelho) {
        this.id_anuncio = id_anuncio;
        this.ce_id_user = ce_id_user;
        this.asunto = asunto;
        this.n_pessoas = n_pessoas;
        this.preco = preco;
        this.descricao = descricao;
        this.coordenadas = coordenadas;
        this.imagem0 = imagem0;
        this.imagem1 = imagem1;
        this.imagem2 = imagem2;
        this.imagem3 = imagem3;
        this.status = status;
        this.id_distrito = id_distrito;
        this.id_concelho = id_concelho;
    }
/*public long getId_anuncio() {
        return id_anuncio;
    }

    public void setId_anuncio(long id_anuncio) {
        this.id_anuncio = id_anuncio;
    }*/

    public long getId_anuncio() {
        return id_anuncio;
    }

    public void setId_anuncio(long id_anuncio) {
        this.id_anuncio = id_anuncio;
    }

    public int getN_pessoas() {
        return n_pessoas;
    }

    public void setN_pessoas(int n_pessoas) {
        this.n_pessoas = n_pessoas;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getImagem0() {
        return imagem0;
    }

    public void setImagem0(String imagem0) {
        this.imagem0 = imagem0;
    }

    public String getImagem1() {
        return imagem1;
    }

    public void setImagem1(String imagem1) {
        this.imagem1 = imagem1;
    }

    public String getImagem2() {
        return imagem2;
    }

    public void setImagem2(String imagem2) {
        this.imagem2 = imagem2;
    }

    public String getImagem3() {
        return imagem3;
    }

    public void setImagem3(String imagem3) {
        this.imagem3 = imagem3;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
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
