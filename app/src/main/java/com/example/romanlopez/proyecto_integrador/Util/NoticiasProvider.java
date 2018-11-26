package com.example.romanlopez.proyecto_integrador.Util;

import com.example.romanlopez.proyecto_integrador.Model.pojo.Noticia;
import com.example.romanlopez.proyecto_integrador.R;

import java.util.ArrayList;
import java.util.List;

public class NoticiasProvider {
    public static List<Noticia> cargarPersonajes(){
        List<Noticia> personajes = new ArrayList<>();
        personajes.add(new Noticia("De Vido pidió ser sobreseído y criticó al \"oscurantismo\" de la investigación", "asdsd","äsdasdasd", R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        personajes.add(new Noticia("El desborde del Canal San Ignacio sigue inundando campos en Laguna Paiva", "asdsd","äsdasdasd",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        personajes.add(new Noticia("El Colegio San Roque es el nuevo \"fetiche\" de las amenazas de bomba", "asdsd","äsdasdasd",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        personajes.add(new Noticia("España quiere prohibir nuevos coches diésel y gasolina desde 2040", "asdsd","äsdasdasd",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        personajes.add(new Noticia("Aumenta la violencia en Gaza", "asdsd","äsdasdasd",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        personajes.add(new Noticia("Martes 13: no te cases, pero embárcate Libertad ...", "asdsd","äsdasdasd",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));
        personajes.add(new Noticia("Nuevo concierto de la Orquesta Sinfónica de Niños", "asdsd","äsdasdasd",R.drawable.ic_launcher_background,R.drawable.ic_launcher_background));

        return personajes;
    }
}
