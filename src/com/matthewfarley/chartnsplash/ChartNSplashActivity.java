package com.matthewfarley.chartnsplash;

import android.support.v4.app.Fragment;


public class ChartNSplashActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment(){
		return new GraphFragment();
	}

}
