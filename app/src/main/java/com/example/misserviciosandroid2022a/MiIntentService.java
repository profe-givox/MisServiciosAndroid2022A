package com.example.misserviciosandroid2022a;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MiIntentService extends IntentService {

    /**
     * @param name
     * @deprecated
     */
    public MiIntentService(String name) {
        super(name);
    }

    public MiIntentService(){super("MiIntentService");}

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        //Aqui debe se debe llevar acabo la tarea prolongada
        // o de bloque

        for(int i=0; i< 99999999; i++){
            Log.d("MiIntentService", "Iteracion: " + 1);
        }


    }
}
