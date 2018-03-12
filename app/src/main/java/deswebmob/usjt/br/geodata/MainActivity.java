package deswebmob.usjt.br.geodata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Guilherme Varela, RA: 81613746 - CCP3AN-MCA.
 */

public class MainActivity extends AppCompatActivity {
    Spinner spContinente;
    public static final String CHAVE = "deswebmob.usjt.br.geodata.txtContinente";
    String continente = "Todos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spContinente = findViewById(R.id.spinnerContinente);
        spContinente.setOnItemSelectedListener(new PaisSelecionado());
    }

    public void listarPaises(View view){
        Intent intent = new Intent(this, ListaPaisesActivity.class);

        intent.putExtra(CHAVE, continente);
        startActivity(intent);
    }

    private class PaisSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            continente = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
