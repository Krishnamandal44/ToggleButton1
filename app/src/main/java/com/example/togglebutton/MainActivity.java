package com.example.togglebutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ToggleButton tb=(ToggleButton)findViewById(R.id.tb);
		Button btn=(Button)findViewById(R.id.btn);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String sval=tb.getText().toString();
				Toast.makeText(MainActivity.this, sval,2000).show();
				// TODO Auto-generated method stub
				
			}
		});
	}
}
