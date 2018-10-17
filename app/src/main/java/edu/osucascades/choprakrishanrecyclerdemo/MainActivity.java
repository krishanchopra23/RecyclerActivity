package edu.osucascades.choprakrishanrecyclerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Item> mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //set up the recycler view
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //set up the data
        mItems = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Item item = new Item (
                    "Heading" + (i  + 1), "Dummy Desciption" + (i + 1));
            mItems.add(item);
        }

        mAdapter = new myAdapter(mItems, this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
