package com.example.modec;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		EditText et1=(EditText)findViewById(R.id.editText1);
		Button sendbutton=(Button)findViewById(R.id.button1);
		et1.setText(R.string.edittext);
		et1.setTextColor(Color.BLACK);
		sendbutton.setText(R.string.send);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
