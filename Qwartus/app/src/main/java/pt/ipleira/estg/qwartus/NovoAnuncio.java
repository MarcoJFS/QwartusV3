package pt.ipleira.estg.qwartus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.Response;

public class NovoAnuncio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_anuncio);

        // Busca o Spinner Distrito
        final Spinner spinnerDistrito = (Spinner) findViewById(R.id.spinnerLocalDistrito);

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
                Spinner spinnerConcelho = (Spinner) findViewById(R.id.spinnerLocalConcelho);
                Spinner spinnerDistrito = (Spinner) findViewById(R.id.spinnerLocalDistrito);

                String text = spinnerDistrito.getSelectedItem().toString();

                //switch para ver qual o texto do spinnerDistrito

                switch (text){
                    case "Aveiro": // Create an ArrayAdapter using the string array and a default spinner layout
                        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(),
                                R.array.arrayConcelhosAveiro, android.R.layout.simple_spinner_item);
                        // Specify the layout to use when the list of choices appears
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
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


        final int duration = Toast.LENGTH_SHORT;
        final Context context = getApplicationContext();

        Button btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText Assunto = ((EditText) findViewById(R.id.etxtAssunto));
                final EditText Preco = ((EditText) findViewById(R.id.etxtPreco));
                final EditText Descricao = ((EditText) findViewById(R.id.etxtDescricao));
                final Spinner SpinnerLocalConcelho = ((Spinner) findViewById(R.id.spinnerLocalConcelho));
                final String SpinnerLocalConcelhoString = ((Spinner) findViewById(R.id.spinnerLocalConcelho)).toString();
                final Spinner SpinnerLocalDistrito = ((Spinner) findViewById(R.id.spinnerLocalDistrito));
                //final String SpinnerLocalDistritoString = ((Spinner) findViewById(R.id.spinnerLocalDistrito)).toString();
                final String SpinnerLocalDistritoString = SpinnerLocalDistrito.getSelectedItem().toString();
                //final int spinnerValue = SpinnerLocalDistrito.getSelectedItemPosition();
                //String SpinnerLocalDistritoString = ((Spinner) findViewById(R.id.spinnerLocalDistrito)).getSelectedItem().toString();

                int indexConcelho = 1 + SpinnerLocalDistrito.getSelectedItemPosition();
                int indexDistrito = 1 + SpinnerLocalDistrito.getSelectedItemPosition();


                        /*if(SpinnerLocalDistritoString == "Aveiro"){
                            indexConcelho = indexConcelho;
                        } else if (SpinnerLocalDistritoString == "Beja"){
                            indexConcelho = indexConcelho + 19;
                        } else if (SpinnerLocalDistritoString == "Braga"){
                            indexConcelho = indexConcelho + 19 + 14;
                        } else if (SpinnerLocalDistritoString == "Bragança"){
                            indexConcelho = indexConcelho + 19 + 14 + 14;
                        } else if (SpinnerLocalDistritoString == "Castelo Branco"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12;
                        } else if (SpinnerLocalDistritoString == "Coimbra"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10;
                        } else if (SpinnerLocalDistritoString == "Évora"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17;
                        } else if (SpinnerLocalDistritoString == "Faro"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15;
                        } else if (SpinnerLocalDistritoString == "Guarda"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15;
                        } else if (SpinnerLocalDistritoString == "Leiria"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15 + 14;
                        } else if (SpinnerLocalDistritoString == "Lisboa"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15 + 14 + 16;
                        } else if (SpinnerLocalDistritoString == "Portalegre"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15 + 14 + 16 + 16;
                        } else if (SpinnerLocalDistritoString == "Porto"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15 + 14 + 16 + 16 + 14;
                        } else if (SpinnerLocalDistritoString == "Santarém"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15 + 14 + 16 + 16 + 14 + 18;
                        } else if (SpinnerLocalDistritoString == "Setúbal"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15 + 14 + 16 + 16 + 14 + 18 + 20;
                        } else if (SpinnerLocalDistritoString == "Viana do Castelo"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15 + 14 + 16 + 16 + 14 + 18 + 20 + 13;
                        } else if (SpinnerLocalDistritoString == "Vila Real"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15 + 14 + 16 + 16 + 14 + 18 + 20 + 13 + 10;
                        } else if (SpinnerLocalDistritoString == "Viseu"){
                            indexConcelho = indexConcelho + 19 + 14 + 14 + 12 + 10 + 17 + 15 + 14 + 16 + 16 + 14 + 18 + 20 + 13 + 10 + 14;
                        }*/



                JsonObject json = new JsonObject();
                json.addProperty("ce_id_user", LoginClassSave.Account.id);
                json.addProperty("asunto", Assunto.getText().toString());
                json.addProperty("preco", Preco.getText().toString());
                json.addProperty("descricao", Descricao.getText().toString());
                json.addProperty("id_distrito", Integer.toString(indexDistrito));
                json.addProperty("id_concelho", Integer.toString(indexConcelho));

                Ion.with(getApplicationContext())
                        .load("POST", DataBaseManager.URL_Dominio + "/anuncios")
                        //.load("http://localhost/ProjWeb/api/web/v1/anuncios")
                        .setTimeout(10000)
                        .addHeader("Accept", "application/json")
                        .addHeader("Content-type", "application/json")
                        //.setBodyParameter("asunto", "testeteste")
                        //.setBodyParameter("preco", "12")
                        //.setBodyParameter("descricao", "testeteste")
                        .setJsonObjectBody(json)
                        .asJsonObject()
                        .withResponse()
                        .setCallback(new FutureCallback<Response<JsonObject>>() {
                            @Override
                            public void onCompleted(Exception e, Response<JsonObject> result) {
                                Toast toast = Toast.makeText(context, "Anuncio publicado com sucesso", duration);
                                toast.show();

                                Intent i = new Intent("android.intent.qwartus.PAGINAUSER");
                                startActivity(i);
                            }
                        });
                        /*.setCallback(new FutureCallback<JsonObject>() {
                            @Override
                            public void onCompleted(Exception e, JsonObject result) {

                                Toast toast = Toast.makeText(context, "Anuncio publicado com sucesso", duration);
                                toast.show();
                            }
                        });*/
                        /*.setCallback(new FutureCallback<JsonObject>() {
                            @Override
                            public void onCompleted(Exception e, JsonObject result) {

                                etxtDescricao.setText(String.valueOf(e));
                            }
                        });*/
                        /*.setCallback(new FutureCallback<JsonObject>() {
                            @Override
                            public void onCompleted(Exception e, JsonObject result) {
                                //
                                //
                                //
                            }
                        });*/
            }
        });


    }
}
