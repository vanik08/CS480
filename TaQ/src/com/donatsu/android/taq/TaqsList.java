package com.donatsu.android.taq;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import android.content.Context;

public class TaqsList {
	private ArrayList<Taq> mTaqs;
	private static TaqsList sTaqsList;
	private Context mAppContext;
	
	private TaqsList(Context appContext) {
		Random rand = new Random();
		
		mAppContext = appContext;
		mTaqs = new ArrayList<Taq>();
		for(int i = 0; i < 100; i++) {
			Taq t = new Taq();
			t.setEventName("Taq #" + i);
			t.setMessage("Hello");
			t.setReputation(rand.nextInt(20));
			mTaqs.add(t);
		}
	}
	
	public static TaqsList get(Context c) {
		if(sTaqsList == null) {
			sTaqsList = new TaqsList(c.getApplicationContext());
		}
		return sTaqsList;
	}
	
	public Taq getTaq(UUID id) {
		for(Taq t : mTaqs) {
			if(t.getId().equals(id))
				return t;
		}
		return null;
	}
	
	public ArrayList<Taq> getTaqs() {
		return mTaqs;
	}
}
