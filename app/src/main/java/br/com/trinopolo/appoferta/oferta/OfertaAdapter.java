package br.com.trinopolo.appoferta.oferta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import br.com.trinopolo.appoferta.R;

/**
 * Created by marconvcm on 07/07/2017.
 */

public class OfertaAdapter extends BaseAdapter {

    private Oferta[] ofertas;
    private Context context;

    public OfertaAdapter(Oferta[] ofertas, Context context) {

        this.ofertas = ofertas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ofertas.length;
    }

    @Override
    public Object getItem(int position) {
        return ofertas[position];
    }

    @Override
    public long getItemId(int position) {
        return ofertas[position].getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Oferta oferta = ofertas[position];

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.oferta_list_item, parent, false);

        TextView tvValor = (TextView) view.findViewById(R.id.tvValor);
        TextView tvDesconto = (TextView) view.findViewById(R.id.tvDesconto);

        tvDesconto.setText(String.valueOf(oferta.getDesconto()));
        tvValor.setText(String.valueOf(oferta.getValor()));

        return view;
    }
}
