package com.android.swapnil.recylerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private GridLayoutManager gridLayoutManager;

    private String[] myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // added a comment to push it to git.
        
        TextView skip = (TextView) findViewById(R.id.skip);

        String htmlString="<u>Skip</u>";
        skip.setText(Html.fromHtml(htmlString));

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        gridLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myDataset = new String [] {"test3","test4","test5","test6","test7","test8","test9","test10","test11"};

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

    }
}
