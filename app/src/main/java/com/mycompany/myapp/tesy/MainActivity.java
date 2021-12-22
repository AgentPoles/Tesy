package com.mycompany.myapp.tesy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends FragmentActivity{
MyFragmentAdapter FrAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    List<Fragment> fragmentsa = getFragment();
        FrAdapter = new MyFragmentAdapter(getSupportFragmentManager(),fragmentsa);
        ViewPager page = (ViewPager)findViewById(R.id.page);
        page.setAdapter(FrAdapter);
    }
    private List<Fragment> getFragment(){
        List<Fragment> flist = new ArrayList<Fragment>();
        flist.add(MyFragment.newInstance("Home"));
        flist.add(MyFragment.newInstance("news"));
                return flist;
    }

}
