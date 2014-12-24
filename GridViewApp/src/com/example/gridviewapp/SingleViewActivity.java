package com.example.gridviewapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.GridView;
import android.widget.ImageView;

public class SingleViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_single_view);
		
		Intent intent = getIntent();
		int position = intent.getExtras().getInt("id");
		
		ImageAdapter imageAdapter = new ImageAdapter(SingleViewActivity.this);
		
		ImageView imageview = (ImageView) findViewById(R.id.imageview1);
		imageview.setImageResource(imageAdapter.mThumbIds[position]);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.single_view, menu);
		return true;
	}

}
