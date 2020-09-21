package com.example.hellorelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hellotoast.R;

public class MainActivity extends AppCompatActivity {
    TextView showCount;
    int mCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount=findViewById(R.id.textCount);
    }


    public void showCount(View view){
        mCount++;
        if(showCount!=null){
            showCount.setText(mCount+"");
        }
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_LONG);
        toast.show();
    }
}