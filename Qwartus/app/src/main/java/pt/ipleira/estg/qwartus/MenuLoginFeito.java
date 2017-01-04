package pt.ipleira.estg.qwartus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MenuLoginFeito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_login_feito);

        // Busca o Spinner Distrito
        Spinner spinnerDistrito = (Spinner) findViewById(R.id.spinnerDistrito);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.arrayDistritos, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerDistrito.setAdapter(adapter);

        Button btnLogout = (Button) findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //LoginClassSave.token = "";
                //LoginClassSave.account.username = "";
                //LoginClassSave.account.email = "";
                //LoginClassSave.account.id = 0;
                //LoginClassSave.login = false;

                Intent i = new Intent("android.intent.qwartus.NOVOANUNCIO");
                startActivity(i);

                finish();
            }
        });

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
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
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



    }
}
