
package com.example.misserviciosandroid2022a;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServicioVinculado extends Service {
    private final IBinder binder = new MyBinder();

    public class  MyBinder extends Binder{
        ServicioVinculado getService(){
            return  ServicioVinculado.this;
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public void metodoInterfaceCompoSer(){

    }

}
