package com.ahdidou.ifootball;

import com.deaux.fan.FanView;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";
	private FanView fan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
        fan = (FanView) findViewById(R.id.fan_view);
        fan.setViews(R.layout.main, R.layout.otherview);
		Log.d(TAG,"Test 10s");
	}
	public void unclick(View v) {
        System.out.println("CLOSE");
        fan.showMenu();
    }

    public void click(View v) {
        System.out.println("OPEN");
        fan.showMenu();
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
