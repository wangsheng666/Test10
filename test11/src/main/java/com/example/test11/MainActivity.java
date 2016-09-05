package com.example.test11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.first);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("name","wangsheng");
                intent.putExtra("id",2014011406);
                startActivityForResult(intent,0);



            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==0 && resultCode==0){
            String a=data.getStringExtra("result");
            Toast.makeText(this,a, Toast.LENGTH_LONG).show();
        }

    }
}
