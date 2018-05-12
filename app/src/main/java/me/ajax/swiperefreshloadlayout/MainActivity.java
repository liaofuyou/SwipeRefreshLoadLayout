package me.ajax.swiperefreshloadlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextAdapter textAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(textAdapter = new TextAdapter());

        textAdapter.setDatas(getDatas(0));
    }

    List<String> getDatas(int baseIndex) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("" + (baseIndex + i + 1));
        }
        return list;
    }
}
