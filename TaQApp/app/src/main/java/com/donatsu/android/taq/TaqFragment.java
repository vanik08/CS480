package com.donatsu.android.taq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TaqFragment extends Fragment {
	Button mBtn;
	Button mMapBtn;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_taq, container, false);
		
		mBtn = (Button)v.findViewById(R.id.button1);
		mBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), TaqListActivity.class);
				startActivity(i);
			}
		});
		
		mMapBtn = (Button)v.findViewById(R.id.button2);
		mMapBtn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), TaqMapActivity.class);
				startActivity(i); //*********************Possible cause of fatal signal 11
				//eglSurfaceAttrib not implemented
				//ClassLoader.loadClass: The class loader returned by Thread.getContextClassLoader() may fail....
				//Review Explicit Intents
				//Read Maps chapter in Android Big Nerd Ranch
			}
		});
		
		return v;
	}
}
