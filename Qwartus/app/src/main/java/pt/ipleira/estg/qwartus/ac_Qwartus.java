package pt.ipleira.estg.qwartus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.gson.JsonArray;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class ac_Qwartus extends AppCompatActivity {

    public static JsonArray nuncisrecebido;

    private CacheLocal dbHelper;

    /*protected void onOpen(){
        if (LoginClassSave.login != false){
            Intent i = new Intent("android.intent.qwartus.MENULOGINFEITO");
            startActivity(i);
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac__qwartus);


        /*dbHelper = new CacheLocal(this);

        Ion.with(getApplicationContext())
                .load("GET", DataBaseManager.URL_Dominio + "/anuncio")
                .setTimeout(10000)
                .addHeader("Accept", "application/json")
                .addHeader("Content-type", "application/json")
                .asJsonArray()
                .setCallback(new FutureCallback<JsonArray>() {
                    @Override
                    public void onCompleted(Exception e, JsonArray result) {
                        int resultCount = result.size();

                        for (int i=0; i< resultCount; i++){
                        JsonObject jObj = result.get(i).getAsJsonObject();
                        Long jid_anuncio = jObj.get("id_anuncio").getAsLong();
                        int jce_id_user = jObj.get("ce_id_user").getAsInt();
                        String jasunto = jObj.get("asunto").toString();
                        String jpreco = jObj.get("preco").toString();
                        String jdescricao = jObj.get("descricao").toString();
                        int jid_distrito = jObj.get("id_distrito").getAsInt();
                        int jid_concelho = jObj.get("id_concelho").getAsInt();

                        dbHelper.addAnuncios(new Anuncio(jid_anuncio,
                                jce_id_user, jasunto,
                                jpreco, jdescricao,
                                jid_distrito, jid_concelho));
                    }}
                });*/
                /*.setCallback(new FutureCallback<JsonArray>() {
                    @Override
                    public void onCompleted(Exception e, JsonArray result) {
                        int resultCount = result.size();
                        //JsonObject jObj = result.get(9).getAsJsonObject();
                        //String jStr = jObj.get("ce_id_user").toString();

                        for (int i=0; i< resultCount; i++){
                            JsonObject jObj = result.get(i).getAsJsonObject();
                            Long jid_anuncio = jObj.get("id_anuncio").getAsLong();
                            int jce_id_user = jObj.get("ce_id_user").getAsInt();
                            String jasunto = jObj.get("asunto").toString();
                            String jpreco = jObj.get("preco").toString();
                            String jdescricao = jObj.get("descricao").toString();
                            int jid_distrito = jObj.get("id_distrito").getAsInt();
                            int jid_concelho = jObj.get("id_concelho").getAsInt();

                        dbHelper.addAnuncios(new Anuncio(jid_anuncio,
                                jce_id_user, jasunto,
                                jpreco, jdescricao,
                                jid_distrito, jid_concelho));

                        }
                    }
                });*/



        // Busca o Spinner Distrito
        Spinner spinnerDistrito = (Spinner) findViewById(R.id.spinnerDistrito);
        //Busca o Spinner Concelho
        Spinner spinerConcelho = (Spinner) findViewById(R.id.spinnerConcelho);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.arrayDistritos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerDistrito.setAdapter(adapter);

        // Evento: Ao clickar no distrito
        spinnerDistrito.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // busca os spinners
                Spinner spinnerConcelho = (Spinner) findViewById(R.id.spinnerConcelho);
                Spinner spinnerDistrito = (Spinner) findViewById(R.id.spinnerDistrito);

                String text = spinnerDistrito.getSelectedItem().toString();

                //switch para ver qual o texto do spinnerDistrito

                switch (text){
                    case "Aveiro": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosAveiro, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter);
                        break;
                    case "Beja": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosBeja, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter1);
                        break;
                    case "Braga": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosBraga, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter2);
                        break;
                    case "Bragança": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosBraganca, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter3);
                        break;
                    case "Castelo Branco": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosCasteloBranco, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter4);
                        break;
                    case "Coimbra": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosCoimbra, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter5);
                        break;
                    case "Évora": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosEvora, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter6);
                        break;
                    case "Faro": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosFaro, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter7);
                        break;
                    case "Guarda": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosGuarda, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter8);
                        break;
                    case "Leiria": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosLeiria, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter9);
                        break;
                    case "Lisboa": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosLisboa, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter10);
                        break;
                    case "Portalegre": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosPortalegre, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter11);
                        break;
                    case "Porto": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter12 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosPorto, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter12);
                        break;
                    case "Santarém": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter13 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosSantarem, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter13);
                        break;
                    case "Setúbal": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter14 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosSetubal, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter14);
                        break;
                    case "Viana do Castelo": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter15 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosVianadoCastelo, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter15);
                        break;
                    case "Vila Real": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter16 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosVilaReal, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter16);
                        break;
                    case "Viseu": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter17 = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosViseu, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        // Apply the adapter to the spinner
                        spinnerConcelho.setAdapter(adapter17);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent("android.intent.qwartus.LOGINPAGE");
                    startActivity(i);

            }
        });

        Button btnRegistar = (Button) findViewById(R.id.btnRegistar);
        btnRegistar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                startActivity(i);
            }
        });

        Button btnProcurar = (Button) findViewById(R.id.btnProcura);
        final String spinertxt= (String) spinerConcelho.getSelectedItem();

        //final String spinertxt = spinerConcelho.getSelectedItem().toString();

        btnProcurar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Ion.with(getApplicationContext())
                        .load("GET", DataBaseManager.URL_Dominio + "/anuncio")
                        .setTimeout(10000)
                        .addHeader("Accept", "application/json")
                        .addHeader("Content-type", "application/json")
                        .asJsonArray()
                        .setCallback(new FutureCallback<JsonArray>() {
                            @Override
                            public void onCompleted(Exception e, JsonArray result) {
                                //int resultCount = result.size();
                                nuncisrecebido = result;
                                //nuncisrecebido = result;

                                /*Intent i = new Intent("android.intent.qwartus.RESULTADOPESQUISA");
                                startActivity(i);*/
                            }
                        });


                       /* Intent i = new Intent("android.intent.qwartus.RESULTADOPESQUISA");
                        startActivity(i);*/
               // }
                            }

        });
    }

}
