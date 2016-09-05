package com.example.test10;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnohterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_anohter);
        Button button = (Button)findViewById(R.id.button) ;
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(AnohterActivity.this,MainActivity.class);
                intent.putExtra("name","wangsheng");
                intent.putExtra("id",2014011406);
                startActivity(intent);
                finish();
            }
        });
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Integer id=intent.getIntExtra("id",2014011406);
        Toast.makeText(this,name+id, Toast.LENGTH_LONG).show();

        }

}
