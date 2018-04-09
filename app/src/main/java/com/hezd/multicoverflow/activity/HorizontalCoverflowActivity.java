package com.hezd.multicoverflow.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hezd.multicoverflow.R;
import com.hezd.multicoverflow.adapter.CoverFlowAdapter;
import com.hezd.multicoverflow.widget.VerticalCoverFlowView;

import java.util.ArrayList;


public class HorizontalCoverflowActivity extends AppCompatActivity {

    private VerticalCoverFlowView mHorizontalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_coverflow);

        getViews();
        setViews();
        setListeners();
    }

    private void getViews() {
        mHorizontalView = findViewById(R.id.hcf_coverflow);
    }

    private void setViews() {
        ArrayList<String> data = new ArrayList<>();
        CoverFlowAdapter coverFlowAdapter = new CoverFlowAdapter(this,data);
        mHorizontalView.setAdapter(coverFlowAdapter);
    }

    private void setListeners() {

    }
}
