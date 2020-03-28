package com.example.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SinhVienDataBase extends SQLiteOpenHelper {
    private static  final String DATABASE_NAME = "QUANLYSINHVIEN.db";
    private static  final String TABLE_NAME = "SINHVIEN";
    private static  final String ID = "ID";
    private static  final String TEN = "TEN";
    private static  final String NAMSINH = "TUOI";
    private static  final String LOP = "LOP";
    private static  final String GIOITINH = "GT";
    private static  final String SOTHICH = "SOTHICH";
    public SinhVienDataBase(@Nullable Context context) {
        super(context,DATABASE_NAME, null, 1
        );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = " CREATE TABLE IF NOT EXISTS SV(ID INTEGER PRIMARY KEY AUTOINCREMENT,  TEN text, NAMSINH text, LOP text, GIOITINH integer, SOTHICH text )";
    sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void themsinhvien(SinhVienModel sinhvienmoi){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TEN,sinhvienmoi.getHoten());
        values.put(NAMSINH,sinhvienmoi.getNamsinh());
        values.put(LOP,sinhvienmoi.getLop());
        values.put(GIOITINH,sinhvienmoi.getGioitinh());
        values.put(SOTHICH,sinhvienmoi.getSothich());

        database.insert(TABLE_NAME ,null,values);
        database.close();
    }

}
