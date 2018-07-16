package com.davidpopayan.sena.quindioturisticobogota;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GestorDB extends SQLiteOpenHelper {
    public GestorDB(Context context) {
        super(context, Constants.DATABASE_NAME, null,Constants.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.script);
    }

    //Metodo para el ingreso de sitios a la base de datos
    public void inputData(Sitio sitio){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("IMAGEN",sitio.getImagen());
        values.put("NOMBRE",sitio.getNombre());
        values.put("DESCRIPCIONC",sitio.getDescripcionc());
        values.put("UBICACION",sitio.getUbicacion());
        values.put("DESCRIPCION",sitio.getDescripcion());
        values.put("LATITUD",sitio.getLatitud());
        values.put("LONGITUD",sitio.getLogitud());
        db.insert("SITIOS",null,values);
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
