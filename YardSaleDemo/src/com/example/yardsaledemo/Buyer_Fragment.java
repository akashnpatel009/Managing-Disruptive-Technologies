package com.example.yardsaledemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Buyer_Fragment extends Fragment{

	View mDrawerListView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		mDrawerListView = inflater.inflate(R.layout.buyer_layout, container, false);
//		showGlobalContextActionBar();
		
		return mDrawerListView;		
	}

}
