package com.example.androidsimplemap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

public class MainActivity extends Activity {
	
	WebView myBrowser;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);


		
		myBrowser = (WebView)findViewById(R.id.mybrowser);
		myBrowser.loadUrl("file:///android_asset/Traffic_Layer.html");
		myBrowser.getSettings().setJavaScriptEnabled(true);
	}

}
