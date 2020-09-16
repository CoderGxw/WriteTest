package com.example.writetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private WrittenView mWrittenviewTest;
    private Button mClear;
    private Button mSave;
    private ImageView mSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWrittenviewTest = (WrittenView) findViewById(R.id.writtenview_test);
        mClear = (Button) findViewById(R.id.clear);
        mSave = (Button) findViewById(R.id.save);
        mSign = (ImageView) findViewById(R.id.sign);


        mClear.setOnClickListener(this);
        mSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.clear:
                mWrittenviewTest.clear();
                break;
            case R.id.save:
                mSign.setImageBitmap( mWrittenviewTest.saveToBitmap(true,0));
                break;
        }
    }
}