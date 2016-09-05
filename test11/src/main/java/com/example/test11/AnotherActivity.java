package com.example.test11;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_another);
        Button button=(Button)findViewById(R.id.secend);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String name=intent.getStringExtra("name");
                Integer id=intent.getIntExtra("id",2014011406);
                intent.putExtra("result","name:" + name+ "学号:"+id);
                setResult(0,intent);


                finish();
            }
        });

        Toast.makeText(AnotherActivity.this,getIntent().getStringExtra("name"), Toast.LENGTH_LONG).show();


    }

}
