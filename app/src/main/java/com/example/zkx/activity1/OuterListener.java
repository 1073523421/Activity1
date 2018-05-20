package com.example.zkx.activity1;


import android.view.View;
import android.widget.EditText;

public class OuterListener implements View.OnClickListener {
    EditText editText;

    public OuterListener(EditText text){
        editText = text;
    }
    @Override
    public void onClick(View view){
        editText.setText("外部类");
    }
}