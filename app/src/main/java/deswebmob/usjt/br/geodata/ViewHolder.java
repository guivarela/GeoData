package deswebmob.usjt.br.geodata;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Guilherme Varela, RA: 81613746 - CCP3AN-MCA.
 */

public class ViewHolder {
    private TextView nome, capital, regiao;
    private ImageView imagem;

    public TextView getNome() {
        return nome;
    }

    public void setNome(TextView numero) {
        this.nome = numero;
    }

    public TextView getCapital() {
        return capital;
    }

    public void setCapital(TextView datas) {
        this.capital = datas;
    }

    public TextView getRegiao() {
        return regiao;
    }

    public void setRegiao(TextView descricao) {
        this.regiao = descricao;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }
}

