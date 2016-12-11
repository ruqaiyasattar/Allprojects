package com.example.android.habit_tracking_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by abc on 28/11/2016.
 */
public class HabitDBHelper extends SQLiteOpenHelper {

    private  static final String DB_NAME="habittrackingApp.db";
    private  static final int DB_VERSION=1;
    private static final String HABIT_TABLE_NAME="habit_Track";

    public HabitDBHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL("create table habit_Track(_id integer autoincremental, name TEXT, age integer, gender TEXT,habit TEXT,day TEXT, week integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
db.execSQL("Drop table if exist habit_Track");
        onCreate(db);
    }
    public void addhabit(int id,String name,int age,String gender,String habit,String day,int week){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("_id",id);
        values.put("name",name);
        values.put("age",age);
        values.put("gender",gender);
        values.put("habit",habit);
        values.put("day",day);
        values.put("week",week);
        db.insert(HABIT_TABLE_NAME,null,values);
        db.close();
    }
    public  void gethabit(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from habit_Track",null);
        while(cursor.moveToNext()){
            //int index = cursor.getColumnIndex("name");
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            int age = cursor.getInt(2);
            String gender=cursor.getString(3);
            String habit=cursor.getString(4);
            String day=cursor.getString(5);
            int week =cursor.getInt(6);
            Log.d("DBResult","Id = "+id +" - Name = "+name+" - Age = "+age+" - gender "+gender+" - habit "+habit+" - day "+day+" - week "+week);
        }
        db.close();
    }
}
