package com.example.yardsaledemo;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Seller_Fragment extends Fragment{

	View mDrawerListView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		mDrawerListView = inflater.inflate(R.layout.seller_layout, container, false);
//		showGlobalContextActionBar();
		
		ImageButton button = (ImageButton) mDrawerListView.findViewById(R.id.imageButton011);
		// Button Event
		button.setOnClickListener((new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String URL = "https://www.google.com/maps/place/40°26'53.2\"N+79°56'05.2\"W/@40.448118,-79.934775";
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
				startActivity(browserIntent);
			}
		}));
		
		Button button1 = (Button) mDrawerListView.findViewById(R.id.buttonAdd);
		// Button Event
		button1.setOnClickListener((new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
				startActivity(browserIntent);
			}
		}));		
		
		return mDrawerListView;
	}
}
