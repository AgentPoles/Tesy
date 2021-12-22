package com.mycompany.myapp.tesy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Paul on 11/23/2017.
 */
public class MyFragment extends Fragment {
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    public static final MyFragment newInstance(String message){
        MyFragment frags = new MyFragment();
        Bundle bundle1 = new Bundle(1);
        bundle1.putString(EXTRA_MESSAGE,message);
        frags.setArguments(bundle1);
        return frags;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        String message = getArguments().getString(EXTRA_MESSAGE);
        View v = inflater.inflate(R.layout.viewer,container,false);
        TextView mT = (TextView)v.findViewById(R.id.textView);
        mT.setText(message);
        return v;
    }
}
