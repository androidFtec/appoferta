package br.com.trinopolo.appoferta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import br.com.trinopolo.appoferta.oferta.Oferta;
import br.com.trinopolo.appoferta.oferta.OfertaAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Oferta[] ofertas;
    private OfertaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();
        setupAction();
    }

    private void setupAction() {

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //TODO: Chamar detalhes

                Intent i = new Intent(MainActivity.this, DetalhesActivity.class);

                i.putExtra("condicao", String.valueOf(ofertas[position].getCondicoes()));
                i.putExtra("entrada", String.valueOf(ofertas[position].getEntrada()));

                MainActivity.this.startActivity(i);
            }
        });
    }

    private void setup() {

        ofertas = new Oferta[3];

        ofertas[0] = new Oferta(1, 100000, 30, 25, 180);
        ofertas[1] = new Oferta(2, 80000, 40, 25, 180);
        ofertas[2] = new Oferta(3, 50000, 50, 25, 180);

        listView = (ListView) findViewById(R.id.listView);

        adapter = new OfertaAdapter(ofertas, this);

        listView.setAdapter(adapter);
    }
}
