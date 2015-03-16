package com.example.yardsaledemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Profile_Fragment extends Fragment{

	View mDrawerListView;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		mDrawerListView = inflater.inflate(R.layout.profile_layout, container, false);
		
		return mDrawerListView;
	}

}
