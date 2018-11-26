package com.example.romanlopez.proyecto_integrador.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.romanlopez.proyecto_integrador.Model.pojo.Noticia;
import com.example.romanlopez.proyecto_integrador.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleCeldaNoticiaFragment extends Fragment {
    public static final String KEY_NOTICIAS = "KEY_NOTICIAS";

     TextView tituloNoticia;
     TextView descripcionNoticia;
     TextView opinionNoticia;
     ImageView imagenNoticia;

    public DetalleCeldaNoticiaFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detalle_celda_noticia, container, false);

        tituloNoticia = view.findViewById(R.id.fragmentDetalleCelda_textView_tituloNoticia);
        descripcionNoticia = view.findViewById(R.id.fragmentDetalleCelda_textView_descripcionNoticia);
        opinionNoticia = view.findViewById(R.id.fragmentDetalleCelda_textView_opinionNoticia);
        imagenNoticia = view.findViewById(R.id.fragmentDetalleCelda_imageView_imagenNoticia);

        Bundle bundle = getArguments();

        Noticia noticias = (Noticia) bundle.getSerializable(KEY_NOTICIAS);

        imagenNoticia.setImageResource(noticias.getImagenNoticia());
        tituloNoticia.setText(noticias.getTituloNoticia());
        descripcionNoticia.setText(noticias.getDescripcionNoticia());
        opinionNoticia.setText(noticias.getOpinionNoticia());

        return view;
    }

}
