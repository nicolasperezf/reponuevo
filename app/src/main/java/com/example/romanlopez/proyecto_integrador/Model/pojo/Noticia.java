package com.example.romanlopez.proyecto_integrador.Model.pojo;

import java.io.Serializable;

public class Noticia implements Serializable {
    private String tituloNoticia;
    private String descripcionNoticia;
    private String opinionNoticia;
    private Integer imagenAvatar;
    private Integer imagenNoticia;

    public Noticia() {
    }

    public Noticia(String tituloNoticia, String descripcionNoticia, String opinionNoticia, Integer imagenAvatar, Integer imagenNoticia) {

        this.tituloNoticia = tituloNoticia;
        this.descripcionNoticia = descripcionNoticia;
        this.opinionNoticia = opinionNoticia;
        this.imagenAvatar = imagenAvatar;
        this.imagenNoticia = imagenNoticia;



    }

    public String getTituloNoticia() {
        return tituloNoticia;
    }

    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public String getDescripcionNoticia() {
        return descripcionNoticia;
    }

    public void setDescripcionNoticia(String descripcionNoticia) {
        this.descripcionNoticia = descripcionNoticia;
    }

    public String getOpinionNoticia() {
        return opinionNoticia;
    }

    public void setOpinionNoticia(String opinionNoticia) {
        this.opinionNoticia = opinionNoticia;
    }

    public Integer getImagenAvatar() {
        return imagenAvatar;
    }

    public void setImagenAvatar(Integer imagenAvatar) {
        this.imagenAvatar = imagenAvatar;
    }

    public Integer getImagenNoticia() {
        return imagenNoticia;
    }

    public void setImagenNoticia(Integer imagenNoticia) {
        this.imagenNoticia = imagenNoticia;
    }
}
