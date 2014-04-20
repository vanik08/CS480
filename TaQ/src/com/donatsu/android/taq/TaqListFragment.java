package com.donatsu.android.taq;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class TaqListFragment extends ListFragment {
	private ArrayList<Taq> mTaqs;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.toptaq_title);
		mTaqs = TaqsList.get(getActivity()).getTaqs();
		TaqAdapter adapter = new TaqAdapter(mTaqs);
		setListAdapter(adapter);
		
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	private class TaqAdapter extends ArrayAdapter<Taq> {
		public TaqAdapter(ArrayList<Taq> taqs) {
			super(getActivity(), android.R.layout.simple_list_item_1, taqs);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if(convertView == null) {
				convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_taq, null);
			}
			
			Taq t = getItem(position);
			TextView eventTextView = (TextView)convertView.findViewById(R.id.taq_list_item_eventTextView);
			eventTextView.setText(t.getEventName());
			
			TextView repTextView = (TextView)convertView.findViewById(R.id.taq_list_item_repTextView);
			String temp = "+" + t.getReputation();
			repTextView.setText(temp);
			
			//ImageView User Color (if statement)
			
			return convertView;
		}
	}
}
