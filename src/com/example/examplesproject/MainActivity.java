package com.example.examplesproject;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//savedInstanceState.putString("Answer", "Hola");
		//String msg = (String)savedInstanceState.get("Answer"); 
		//Log.i("Anwers", msg);
		setContentView(R.layout.activity_main);
		
		String txt = this.getResources().getString(R.string.hello_world);
		int an_Int = this.getResources().getInteger(R.integer.an_Int);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
