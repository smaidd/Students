package com.example.mgmcartofior.students;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mReciclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        mReciclerView = findViewById(R.id.recicler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mReciclerView.setLayoutManager(layoutManager);

        StudentAdapter studentAdapter = new StudentAdapter(getList());
        mReciclerView.setAdapter(studentAdapter);

    }
    private List<Students> getList(){
        List<Students> list = new ArrayList<>();
        list.add(new Students("Alexandru","Ionita"));
        list.add(new Students("George","Melcic"));
        list.add(new Students("Marian","Xulescu"));
        list.add(new Students("Maria","Tataur"));
        list.add(new Students("Andreea","Alama"));
        list.add(new Students("Alina","Ciutu"));
        list.add(new Students("Iulia","Balint"));
        list.add(new Students("Traian","Ionita"));
        return list;
    }

}
