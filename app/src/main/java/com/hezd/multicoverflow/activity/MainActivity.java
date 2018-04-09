package com.hezd.multicoverflow.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hezd.multicoverflow.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mHorizontalBtn;
    private Button mVerticalBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViews();
        setViews();
        setListeners();
    }

    private void setListeners() {
        mHorizontalBtn.setOnClickListener(this);
        mVerticalBtn.setOnClickListener(this);
    }

    private void setViews() {

    }

    private void getViews() {
        mHorizontalBtn = findViewById(R.id.horizontal_coverflow);
        mVerticalBtn = findViewById(R.id.vertical_coverflow);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.horizontal_coverflow:
                Intent intent = new Intent(this,HorizontalCoverflowActivity.class);
                startActivity(intent);
                break;
            case R.id.vertical_coverflow:

                break;
        }
    }
}
