package com.zdxh.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<String> datas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datas = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        initDatas(datas);
        adapter = new MyAdapter(this,datas);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManger = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManger);


        Log.d("TAG","测试提交");



    }

    private void initDatas(List<String> datas) {

        for (int i = 'A';i<'z';i++){
            datas.add(""+(char)i);
        }
    }

}
