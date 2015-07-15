package de.derandroidpro.activity_tutorial;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends Activity {

	

	public TextView tv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_layout);
		
		tv1 = (TextView) findViewById(R.id.textView1);
		
		final Bundle intentauswertung = getIntent().getExtras();
		
		if (intentauswertung != null) {
			tv1.setText("Dein Text: " + intentauswertung.getString("Uebergabetxt"));
				
		}
		
		ActionBar actionbar = getActionBar();
		actionbar.setHomeButtonEnabled(true);
		actionbar.setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case android.R.id.home:{
			Intent intent1 = new Intent (SecondActivity.this, TutorialActivity.class);
			startActivity(intent1);
			overridePendingTransition(R.anim.animation_in, R.anim.animation_out);
			
			
			SecondActivity.this.finish();
			
			
		}
		
		}
		return super.onOptionsItemSelected(item);

	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent tastendruck) {
		
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent2 = new Intent (SecondActivity.this, TutorialActivity.class);
			startActivity(intent2);
			overridePendingTransition(R.anim.animation_in, R.anim.animation_out);
			
			
			SecondActivity.this.finish();
			
		}
		
		
		return super.onKeyDown(keyCode, tastendruck);
	}
	

}
