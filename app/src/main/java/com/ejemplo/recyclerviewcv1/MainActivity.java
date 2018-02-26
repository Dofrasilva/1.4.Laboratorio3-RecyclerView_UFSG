package com.ejemplo.recyclerviewcv1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.style.BackgroundColorSpan;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<DataProvider> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Aquí va la adición de elementos a la lista
        String[] values = new String[]{"ARANDA PATRON NOMAR JAZIEL:"+
                "CARDENAS RAMOS FRANCISCO EMANUEL:"+
                "CASTILLO CORRALES VICTOR EMMANUEL:"+
                "CERVANTES JIMÉNEZ JOSÉ MIGUEL:"+
                "ULISES FRANCISCO SILVA GUERRA:" +
                "DORALIS VANESSA CEJA CERVANTES:" +
                "CORDERO RIVERA SELVA YAZMIN:"+
                "CORDERO VILLA OSCAR ALBERTO:"+
                "TOVAR BARRAGAN GERARDO:"+
                "RUBIO RODRIGUEZ JORGE:"+
                "GUERRA ROBLES CARLOS:"+
                "MARTINEZ ZAVALA VICENTE:"+
                "PUGA FLORES CARLOS:"+
                "REYES GODINEZ CARLA GUADALUPE:"+
                "REYES GUERRERO GUILLERMO GUADALUPE:" +
                "RICO ESPARZA HENRY:"+
                "RIVERA RAMIREZ DAVID:"+
                "SANCHEZ CARRILLO BETSY DEL CARMEN:"+
                "SILVA CAMACHO EDUARDO LUIS:"

        };
        String[]cadenas= values[0].split(":");

        for (int p=0;p<cadenas.length;p++){

            productList.add(
                    new DataProvider(R.drawable.usuario," ",cadenas[p], "TIC´s", 144010150)
            );



        }




        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);





    }
}
