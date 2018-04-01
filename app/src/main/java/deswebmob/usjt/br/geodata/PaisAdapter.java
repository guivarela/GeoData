package deswebmob.usjt.br.geodata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import deswebmob.usjt.br.geodata.R;
import deswebmob.usjt.br.geodata.entity.Pais;
import deswebmob.usjt.br.geodata.entity.Util;

/**
 * Created by Guilherme Varela, RA: 81613746 - CCP3AN-MCA.
 */

public class PaisAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Pais> paises;

    public PaisAdapter(Context context, ArrayList<Pais> paises) {
        this.context = context;
        this.paises = paises;
    }

    @Override
    public int getCount() {
        return paises.size();
    }

    @Override
    public Object getItem(int position) {
        return paises.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.linha_pais, parent, false);

            ImageView imagem = (ImageView) view.findViewById(R.id.imagem_pais);
            TextView nome = (TextView) view.findViewById(R.id.nome_pais);
            TextView capital = (TextView) view.findViewById(R.id.capital_pais);
            TextView regiao = (TextView) view.findViewById(R.id.regiao_pais);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.setNome(nome);
            viewHolder.setCapital(capital);
            viewHolder.setRegiao(regiao);
            viewHolder.setImagem(imagem);
            view.setTag(viewHolder);
        }

        Pais pais = paises.get(position);

        ViewHolder viewHolder = (ViewHolder)view.getTag();

        viewHolder.getImagem().setImageDrawable(Util.getDrawableDinamic(context, pais.getBandeira()));

        viewHolder.getNome().setText(pais.getNome());
        viewHolder.getCapital().setText(String.format("Capital: %s", pais.getCapital()));
        viewHolder.getRegiao().setText(String.format("Regiao: %s", pais.getRegiao()));

        return view;
    }
}

