package com.wei.coolweather.app.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * 将三条建表语句定义成常量，然后在 onCreate()方法中去执行创建数据库
 * @author ColWeatherOpenHelper
 *<p>Descrl</P>
 * @date 2016-1-4 下午9:43:11
 *
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	/**
	 * 创建Provice表
	 * @param context
	 * @param name
	 * @param factory
	 * @param version
	 * @param errorHandler
	 */
	public static final String CREATE_PROVINCE = "create table Province(" 
	 +"id intger primary key autoincrement," +
	 "province_name text," +
	 "province_code text)";
	
	/**
	 * 创建City表
	 * @param context
	 * @param name
	 * @param factory
	 * @param version
	 * @param errorHandler
	 */
	public static final String CREATE_CITY = "create table City(" +
			"id integer primary key autincrement," +
			"city_name text," +
			"city_code text," +
			"province_id integer)";
	
	/**
	 * County 表创建
	 * @param context
	 * @param name
	 * @param factory
	 * @param version
	 * @param errorHandler
	 */
	public static final String CREATE_COUNTY ="create table County (" +
			"id integer primary key autoincrement," +
			"county_name text," +
			"county_code text," +
			"city_id integer)";
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version
			) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		/*
		 * 创建相对应得数据库表
		 */
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
