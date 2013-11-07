package com.example.examplesproject;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView mTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mTextView = (TextView)findViewById(R.id.textView1);
		mTextView.setText("Mi nuevo Valor");
		String allContacts = "";
		
		Cursor c = getContentResolver().query(
				android.provider.ContactsContract.Data.CONTENT_URI,
				null,
				null,
				null,
				null);
		if (c.moveToFirst()){
			int idx = c.getColumnIndex(Contacts.People.DISPLAY_NAME);
			
			do{
				String name = c.getString(idx);
				allContacts +="--"+name;
			}
			
			while (c.moveToNext());
			
		}
		
		mTextView.setText(allContacts);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
