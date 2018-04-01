package deswebmob.usjt.br.geodata.entity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import deswebmob.usjt.br.geodata.R;

/**
 * Created by Guilherme Varela, RA: 81613746 - CCP3AN-MCA.
 */

public class Util {
    public static Drawable getDrawableDinamic(Context contexto, String nomeImagem){
        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(nomeImagem);
            int id = idField.getInt(idField);
            return contexto.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}

