package com.matthewfarley.chartnsplash;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreen extends Activity {
	private static int SPLASH_TIME_OUT = 1000 * 3;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spash);
		
		new Handler().postDelayed(new Runnable(){
			@Override
			public void run(){
				//Code is executed once timer is finished and starts main activity
				Intent i = new Intent(SplashScreen.this, ChartNSplashActivity.class);
				startActivity(i);
				
				finish(); // close this activity;
			}
		}, SPLASH_TIME_OUT);
		
	}

}
