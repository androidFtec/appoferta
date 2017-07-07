package br.com.trinopolo.appoferta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {

    private TextView tvCondicao;
    private TextView tvEntrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        setup();

        tvCondicao.setText(getIntent().getStringExtra("condicao"));
        tvEntrada.setText(getIntent().getStringExtra("entrada"));
    }

    private void setup() {

        tvCondicao = (TextView) findViewById(R.id.textViewCondicao);
        tvEntrada = (TextView) findViewById(R.id.textViewEntrada);
    }
}
