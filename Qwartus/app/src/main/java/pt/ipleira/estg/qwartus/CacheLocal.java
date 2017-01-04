package pt.ipleira.estg.qwartus;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import pt.ipleira.estg.qwartus.models.Anuncio;
import pt.ipleira.estg.qwartus.models.Imagens;

/**
 * Created by USER on 03/01/2017.
 */

public class CacheLocal extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "dbqwartus";
    private static final String ANUNCIO_TABLE_NAME = "anuncio";
    private static final String IMAGEM_TABLE_NAME = "imagem";

    public CacheLocal(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS " + ANUNCIO_TABLE_NAME
                + "(id_anuncio INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "ce_id_user INTEGER, "
                + "asunto TEXT, "
                + "preco INTEGER, "
                + "descricao TEXT, "
                + "id_distrito INTEGER, "
                + "id_concelho INTEGER"
                + ");";
        db.execSQL(sql);

        sql = "CREATE TABLE IF NOT EXISTS " + IMAGEM_TABLE_NAME
                + "("
                + "id_imagem INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "ce_id_anuncio INTEGER, "
                + "caminho TEXT, "
                + "FOREIGN KEY(ce_id_anuncio) REFERENCES anuncio(id_anuncio) "
                + "ON DELETE CASCADE "
                + "ON UPDATE CASCADE "
                + ");";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ANUNCIO_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + IMAGEM_TABLE_NAME);

        onCreate(db);
    }

    /**
     * @param anuncio
     * @return
     */

    public boolean addAnuncios(Anuncio anuncio){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("id_anuncio", anuncio.getId_anuncio());
        values.put("ce_id_user", anuncio.getCe_id_user());
        values.put("asunto", anuncio.getAsunto());
        values.put("preco", anuncio.getPreco());
        values.put("descricao", anuncio.getDescricao());
        values.put("id_distrito", anuncio.getId_distrito());
        values.put("id_concelho", anuncio.getId_concelho());

        //db.insert("anuncio", null, values);

        long id = db.insert(ANUNCIO_TABLE_NAME, null, values);
        if (id > -1) {
            anuncio.setId_anuncio(id);
            return true;
        }

        return false;
    }

    /**
     * @param id_anuncio
     * @return
     */
    public Anuncio removeAnuncios(long id_anuncio) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete(ANUNCIO_TABLE_NAME, "id = ?", new String[]{"" + id_anuncio});

        return null;
    }

    /**
     * @param anuncio
     * @return
     */
    public boolean saveAnuncios(Anuncio anuncio) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("id_anuncio", anuncio.getId_anuncio());
        values.put("ce_id_user", anuncio.getCe_id_user());
        values.put("asunto", anuncio.getAsunto());
        values.put("preco", anuncio.getPreco());
        values.put("descricao", anuncio.getDescricao());
        values.put("id_distrito", anuncio.getId_distrito());
        values.put("id_concelho", anuncio.getId_concelho());

        return (db.update(ANUNCIO_TABLE_NAME, values, "id = ?", new String[]{"" + anuncio.getId_anuncio()}) > 0);
    }




    public boolean addImagens(Imagens imagens){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("id_imagem", imagens.getId_imagem());
        values.put("ce_id_anuncio", imagens.getCe_id_anuncio());
        values.put("caminho", imagens.getCaminho());

        //db.insert("imagem", null, values);

        long id = db.insert(IMAGEM_TABLE_NAME, null, values);
        if (id > -1) {
            imagens.setId_imagem(id);
            return true;
        }

        return false;
    }

    /**
     * @param id_imagem
     * @return
     */
    public Anuncio removeImagens(long id_imagem) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete(IMAGEM_TABLE_NAME, "id = ?", new String[]{"" + id_imagem});

        return null;
    }

    /**
     * @param imagens
     * @return
     */
    public boolean saveImagens(Imagens imagens) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("id_imagem", imagens.getId_imagem());
        values.put("ce_id_anuncio", imagens.getCe_id_anuncio());
        values.put("caminho", imagens.getCaminho());

        return (db.update(IMAGEM_TABLE_NAME, values, "id = ?", new String[]{"" + imagens.getId_imagem()}) > 0);
    }
}
