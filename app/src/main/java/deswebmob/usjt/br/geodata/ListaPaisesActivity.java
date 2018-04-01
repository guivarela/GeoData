package deswebmob.usjt.br.geodata;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import deswebmob.usjt.br.geodata.entity.Data;
import deswebmob.usjt.br.geodata.entity.Pais;

/**
 * Created by Guilherme Varela, RA: 81613746 - CCP3AN-MCA.
 */

public class ListaPaisesActivity extends AppCompatActivity {
    public static final String PAIS = "deswebmob.usjt.br.geodata.pais";
    Activity contexto;
    ArrayList<Pais> paises;
    ArrayList<String> nomes;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);
        contexto = this;
        Intent intent = getIntent();
        String continente = intent.getStringExtra(MainActivity.CHAVE);
        paises = Data.listarPaises(continente);
        nomes = Data.listarNomes(paises);

        listView = (ListView) findViewById(R.id.lista_paises);
        PaisAdapter adapter = new PaisAdapter(this, paises);
        listView.setAdapter(adapter);
        contexto = this;

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Pais pais = paises.get(position);
                        Intent intent1 = new Intent(contexto , DetalhePaisActivity.class);
                        intent1.putExtra(PAIS, pais);
                        startActivity(intent1);
                    }
                }
        );
    }
}
