package com.interesting.administrator.interesting;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class MyHelper extends SQLiteOpenHelper {

	/*
	 * 参数： 1. Context 上下文件环境，
	 * 系统会根据环境获取到当前工程的包名，会将后期生成的数据库文件存到：data/data/程序包名/databases文件夹内 2. 设置数据库名称
	 * 3. 填null， 4. 数据库的版本号
	 */
	public MyHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	public MyHelper(Context context) {
		super(context, "interest.db", null, 1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 当一次创建数据库文件时运行此方法 参数：SQLiteDatabase 数据库对象
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		// 创建表的操作
		db.execSQL("create table if not exists collect (_id integer primary key autoincrement, title text, url text)");
	}


	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("drop table if exists collect");
		// 重新运行onCreate方法
		onCreate(db);

	}
	
	
	//增加数据
	public void addBySql (Collect collect){
		SQLiteDatabase db = getReadableDatabase();

		db.execSQL("insert into collect (title,url) values (?,?)",new Object[]{collect.getTitle(), collect.getUrl()});
		
		//关闭数据库
		db.close();
		
	}
	
	//查询全表数据
	public ArrayList<Collect> getAllData(){
		
		SQLiteDatabase db = getReadableDatabase();
		
		/**
		 * 为了获取到查询结果，因此使用带有返回值的rawQuery方法执行sql语句
		 * 方法参数：
		 * 1. 要执行的sql语句
		 * 2.  String[] ,如果sql语句中有？，那么用于替代？的值
		 * 
		 * 查询的sql语句
		 * 
		 */
		
		/**
		 * 返回值为Cursor对象， 游标
		 *  特点。：
		 *  作用类似于一个指针小箭头，当得到查询结果后，Cursor默认指向结果数据的第一行上方
		 *  必须一行一行挪动Cursor对象，当Cursor对象指向某一行数据后，该行内的所有数据就会存储在Cursor对象中
		 */
		Cursor cursor= db.rawQuery("select * from collect", null);
		
		ArrayList<Collect> list = new ArrayList<>();
		//通过moveToNext方法让Cursor，向下挪动一行
		while(cursor.moveToNext()) {
			//挪动后，Cursor内拥有该行的所有数据
			int id = cursor.getInt(cursor.getColumnIndex("_id"));
			String title = cursor.getString(cursor.getColumnIndex("title"));
			String url =  cursor.getString(cursor.getColumnIndex("url"));
			list.add(new Collect(id,title,url));
		}
		db.close();
		return list;
	}
	
	
	//删除数据
	 public void deleteBySql(String title){
		 SQLiteDatabase db = getReadableDatabase();

		 //删除指定数据
		 db.execSQL("delete from collect where title = "+title);
		 db.close();
	 }
	 
	 //修改数据
	 public void updateBySql (Collect collect, int id) {
		 SQLiteDatabase db = getReadableDatabase();
		 db.execSQL("update collect set title = ?,url=? where _id = "+id,new Object[]{collect.getTitle(), collect.getUrl()});


	 }

}
