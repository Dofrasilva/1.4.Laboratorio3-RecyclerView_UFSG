package com.ejemplo.recyclerviewcv1;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by lenovo on 21/02/2018.
 */

public class DataProvider {
    // 1.1. Definir campos de clase para los elementos del CardView
    private String title;
    private String shortdesc;
    private int rating;
    private int image;
    

    // 1.2. Generar el constructor

    public DataProvider(int image, String s, String title, String shortdesc, int rating) {
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.image = image;

    }

    // 1.3. Generar los métodos getter.

    public int getImage() {
        return image;
    }
    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public int getRating() {
        return rating;
    }



    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}
