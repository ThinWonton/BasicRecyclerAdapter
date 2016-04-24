package com.github.thinwonton.basicrecycleradapter.sample.headerfooteradapter;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.github.thinwonton.basicrecycleradapter.BasicAdapter;

/**
 * Created by HUGO on 2016/4/12.
 */
public class HeaderFooterLinearFragment extends HeaderFooterBaseFragment {

	@Override
	protected BasicAdapter createAdapter() {
		return new HeaderFooterLinearAdapter();
	}

	@Override
	protected void configRecyclerView(RecyclerView recyclerView) {
		LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
		recyclerView.setLayoutManager(layoutManager);
	}
}
