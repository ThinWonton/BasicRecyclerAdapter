package com.github.thinwonton.basicrecycleradapter.sample.mutipletypeadapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.github.thinwonton.basicrecycleradapter.BasicAdapter;
import com.github.thinwonton.basicrecycleradapter.action.OnItemClickListener;
import com.github.thinwonton.basicrecycleradapter.sample.LinearFragment;
import com.github.thinwonton.basicrecycleradapter.sample.model.Cat;

/**
 * Created by HUGO on 2016/4/12.
 */
public class MultipleTypeLinearFragment extends LinearFragment {
	@Override
	protected BasicAdapter createAdapter() {
		return new MultipleLinearAdapter();
	}

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getAdapter().setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Cat cat = (Cat) getAdapter().getItem(position);
                Toast.makeText(getActivity(), "cat name = " + cat.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
