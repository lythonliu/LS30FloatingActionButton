package com.dongnao.ls29coordinatorlayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {
    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclverView);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setTitle("网易新闻");
        mToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(mToolbar);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            list.add("item"+i);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyRecyclerAdapter(list));
//        findViewById(R.id.btn).setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                view.setX(motionEvent.getX());
//                view.setY(motionEvent.getY());
//                return false;
//            }
//        });
    }
}
