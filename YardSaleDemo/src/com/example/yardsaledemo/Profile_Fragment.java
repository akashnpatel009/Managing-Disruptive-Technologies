package com.example.yardsaledemo;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Profile_Fragment extends Fragment{

	View mDrawerListView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		mDrawerListView = inflater.inflate(R.layout.profile_layout, container, false);
		
		TextView t = (TextView)mDrawerListView.findViewById(R.id.textView6);
		t.setText("40.448496, -79.934729");
		
		ImageButton button = (ImageButton) mDrawerListView.findViewById(R.id.imageButton0111);
		// Button Event
		button.setOnClickListener((new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				// com.example.tinderview_demo.MainActivity
				//Open web browser on click
				//				Intent browserIntent = manager.getLaunchIntentForPackage("com.example.tinderview_demo.MainActivity");
				//				startActivity(browserIntent);

//	            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:40.448118, -79.934775"));
//	            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
//	            startActivity(intent);
				

				String URL = "https://www.google.com/maps/place/40°26'53.2\"N+79°56'05.2\"W/@40.448118,-79.934775";
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
				startActivity(browserIntent);
			}
		}));
		
		return mDrawerListView;
	}

}
