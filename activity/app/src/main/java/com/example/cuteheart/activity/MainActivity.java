package com.example.cuteheart.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ename,epswd;
    Button nxt1;
    String n[]={"A","B","C"};
    @Override
    protected void onCreate(final Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        ename=(EditText)findViewById(R.id.ename);
        epswd=(EditText)findViewById(R.id.epswd);
        nxt1=(Button)findViewById(R.id.nxt1);


        nxt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,firstj.class);

                String n=ename.getText().toString();
                String p=epswd.getText().toString();
                i.putExtra("name",n);
                i.putExtra("pswd",p);


//                String n=ename.getText().toString();
//                String p=epswd.getText().toString();
//                student st=new student();
//                st.setName(n);
//                st.setPassword(p);
//                i.putExtra("st",st);


//                i.putExtra("n",n);


//                i.putExtras(b);

                startActivity(i);



            }
        });
    }
}
