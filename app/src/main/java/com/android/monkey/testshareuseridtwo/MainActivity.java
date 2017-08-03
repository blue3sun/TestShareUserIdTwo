package com.android.monkey.testshareuseridtwo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int mTag = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.btn_switch).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            finish();
                        getResources().getDrawable(R.mipmap.koala);
                    }
                }
        );
        findViewById(R.id.btn_tag).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mTag++;
                    }
                }
        );
        findViewById(R.id.btn_sharedpreference).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sp = getSharedPreferences("pref", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("key","share");
                        editor.commit();
                    }
                }
        );

    }
}
