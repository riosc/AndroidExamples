package com.example.examplesproject.classes.views.EditText;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;

public class EXCustomEditText extends EditText {

	private String TAG = "EXCustomEditText";
	
	public EXCustomEditText(Context context) {
		super(context);
		Log.i(TAG, "Me construi");
		// TODO Auto-generated constructor stub
	}

	public EXCustomEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		Log.i(TAG, "Me construi2");

		this.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				Log.i(TAG, arg0.toString());
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				Log.i(TAG, "onTextChanged");

			}
			
		});

	}

	public EXCustomEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		Log.i(TAG, "Me construi3");

	}

}
