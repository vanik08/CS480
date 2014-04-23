package com.donatsu.android.taq;

import android.support.v4.app.Fragment;

public class TaqListActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new TaqListFragment();
	}

}
