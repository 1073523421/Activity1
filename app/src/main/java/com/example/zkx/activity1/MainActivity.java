package com.example.zkx.activity1;

import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText show;
    Button inner;
    Button outer;
    Button anonymous;
    Button activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.tv);
        inner = findViewById(R.id.inner);
        outer = findViewById(R.id.outer);
        anonymous = findViewById(R.id.anonymous);
        activity = findViewById(R.id.activity);

        inner.setOnClickListener(new InnerListener());
        outer.setOnClickListener(new OuterListener(show));
        activity.setOnClickListener(this);
        anonymous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("匿名内部类");
            }
        });

    }
    class InnerListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            show.setText("内部类");
        }
    }
    @Override
    public void onClick(View v){
        show.setText("Activity");

    }
    public void clickHandler(View view) {
        show.setText("绑定到标签");
    }
}
