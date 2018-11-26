package com.example.romanlopez.proyecto_integrador.View;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.romanlopez.proyecto_integrador.Model.pojo.Noticia;
import com.example.romanlopez.proyecto_integrador.R;

public class MainActivity extends AppCompatActivity implements RecyclerViewFragment.ListenerRecyclerViewFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager supportFragmentManager = getSupportFragmentManager();

        android.support.v4.app.FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.mainActivity_fragmentContenedor,new RecyclerViewFragment()).commit();

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void informarSeleccion(Noticia noticia) {
       Bundle bundle = new Bundle();
       bundle.putSerializable(DetalleCeldaNoticiaFragment.KEY_NOTICIAS,noticia);
       DetalleCeldaNoticiaFragment detalleCeldaNoticiaFragment = new DetalleCeldaNoticiaFragment();
       detalleCeldaNoticiaFragment.setArguments(bundle);
       FragmentManager fragmentManager = getSupportFragmentManager();
       FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
       fragmentTransaction.replace(R.id.mainActivity_fragmentContenedor,detalleCeldaNoticiaFragment);
       fragmentTransaction.addToBackStack(null);
       fragmentTransaction.commit();
    }
}
