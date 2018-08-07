package com.example.snehal.sqlitelogin1.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Snehal on 06-05-2018.
 */

public class AlarmReminderDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 3;

    private static final String DATABASE_NAME = "AlarmReminder.db";

    public AlarmReminderDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ALARM_TABLE =  "CREATE TABLE " + AlarmReminderContract.AlarmReminderEntry.TABLE_NAME + " ("
                + AlarmReminderContract.AlarmReminderEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_TITLE + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_DATE + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_TIME + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_REPEAT + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_REPEAT_NO + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_REPEAT_TYPE + " TEXT NOT NULL, "
                + AlarmReminderContract.AlarmReminderEntry.KEY_ACTIVE + " TEXT NOT NULL " + " );";

        db.execSQL(SQL_CREATE_ALARM_TABLE);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
