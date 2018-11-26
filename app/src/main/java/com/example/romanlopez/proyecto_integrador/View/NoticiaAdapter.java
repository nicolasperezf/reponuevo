package com.example.romanlopez.proyecto_integrador.View;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.romanlopez.proyecto_integrador.Model.pojo.Noticia;
import com.example.romanlopez.proyecto_integrador.R;

import java.util.List;

public class NoticiaAdapter extends RecyclerView.Adapter {
    private List<Noticia> listaDeNoticias;
    private ListenerNoticiasAdapter listenerNoticiasAdapter;

    public NoticiaAdapter(List<Noticia> listaDeNoticias,ListenerNoticiasAdapter listenerNoticiasAdapter) {
        this.listaDeNoticias = listaDeNoticias;
        this.listenerNoticiasAdapter = listenerNoticiasAdapter;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //buscamos el inflador
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        //inflamos la vista
        View view = inflador.inflate(R.layout.ceda_noticia,parent,false);
        NoticiaViewHolder noticiaViewHolder = new NoticiaViewHolder(view);

        return noticiaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Noticia notica = listaDeNoticias.get(position);
        NoticiaViewHolder noticiaViewHolder = (NoticiaViewHolder) holder;
        noticiaViewHolder.bindNoticia(notica);

    }

    @Override
    public int getItemCount() {
        return listaDeNoticias.size();
    }

    private class NoticiaViewHolder extends RecyclerView.ViewHolder {
        private TextView tituloNoticia;
        private TextView opinionNoticia;
        private ImageView imagenPerfil;
        private ImageView imagenNoticia;
        public NoticiaViewHolder(View itemView) {
            super(itemView);
            tituloNoticia = itemView.findViewById(R.id.layoutCelda_textView_tituloNoticia);
            opinionNoticia = itemView.findViewById(R.id.layoutCelda_textView_opinionUsuario);
            imagenPerfil = itemView.findViewById(R.id.layoutCelda_imageView_imagenPerfil);
            imagenNoticia = itemView.findViewById(R.id.layoutCelda_imageView_imagenNoticia);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listenerNoticiasAdapter.informarSeleccion(listaDeNoticias.get(getAdapterPosition()));
                }
            });

        }
        public void bindNoticia (Noticia noticia){
            tituloNoticia.setText(noticia.getTituloNoticia());
            opinionNoticia.setText(noticia.getOpinionNoticia());
            if (noticia.getImagenAvatar() == null){
                //todo cambiar las imagenes de empty state
                imagenPerfil.setImageResource(R.drawable.ic_launcher_background);
                imagenNoticia.setImageResource(R.drawable.ic_launcher_background);
            }else{
                imagenNoticia.setImageResource(noticia.getImagenNoticia());
                imagenPerfil.setImageResource(noticia.getImagenAvatar());
            }

        }

    }
    public interface ListenerNoticiasAdapter{
        public void informarSeleccion(Noticia noticia);
    }
}
