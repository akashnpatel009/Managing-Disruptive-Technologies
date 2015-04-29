package com.example.yardsaledemo;

import android.app.Fragment;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Buyer_Fragment extends Fragment{

	View mDrawerListView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		mDrawerListView = inflater.inflate(R.layout.buyer_layout, container, false);
		//		showGlobalContextActionBar();

		Button button = (Button) mDrawerListView.findViewById(R.id.btnSave);
		// Button Event
		button.setOnClickListener((new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				// com.example.tinderview_demo.MainActivity
				//Open web browser on click
				//				Intent browserIntent = manager.getLaunchIntentForPackage("com.example.tinderview_demo.MainActivity");
				//				startActivity(browserIntent);

				Intent i = new Intent(); 
				ComponentName n = new ComponentName("com.example.tinderview_demo", "com.example.tinderview_demo.MainActivity"); 
				i.setComponent(n); 
				startActivity(i);
			}
		}));

		return mDrawerListView;		
	}

}
