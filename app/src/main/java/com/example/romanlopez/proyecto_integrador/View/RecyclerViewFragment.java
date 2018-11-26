package com.example.romanlopez.proyecto_integrador.View;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.romanlopez.proyecto_integrador.Model.pojo.Noticia;
import com.example.romanlopez.proyecto_integrador.Util.NoticiasProvider;
import com.example.romanlopez.proyecto_integrador.R;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment implements NoticiaAdapter.ListenerNoticiasAdapter {
    private ListenerRecyclerViewFragment listenerRecyclerViewFragment;
    private RecyclerView recyclerViewNoticias;
    private FloatingActionButton floatingActionButton;


    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listenerRecyclerViewFragment = (ListenerRecyclerViewFragment) context;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view =  inflater.inflate(R.layout.fragment_recycler_view, container, false);

        recyclerViewNoticias  = view.findViewById(R.id.fragmentRecyclerView_recycler);

        List<Noticia> noticias = NoticiasProvider.cargarPersonajes();

        NoticiaAdapter noticiaAdapter = new NoticiaAdapter(noticias,this);
        //creamos el layoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);

        recyclerViewNoticias.setLayoutManager(linearLayoutManager);
        recyclerViewNoticias.setAdapter(noticiaAdapter);
        recyclerViewNoticias.setHasFixedSize(true);


        

        floatingActionButton = view.findViewById(R.id.fragmentRecyclerView_floating_addNews);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(floatingActionButton,"Aguante River",Snackbar.LENGTH_LONG);

                Toast.makeText(getContext(), "Aguante Riverrrr", Toast.LENGTH_SHORT).show();


            }
        });

        return view;

    }

    @Override
    public void informarSeleccion(Noticia noticia) {
        listenerRecyclerViewFragment.informarSeleccion(noticia);
    }
    public interface ListenerRecyclerViewFragment{
        public void informarSeleccion(Noticia noticia);
    }
}
