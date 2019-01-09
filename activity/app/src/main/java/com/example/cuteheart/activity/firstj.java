package com.example.cuteheart.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class firstj extends AppCompatActivity {
    EditText ecity,ecpi;
    Button nxt2;
    Intent pi;
    String n,p;
    student st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        ecity=(EditText)findViewById(R.id.ecity);
        ecpi=(EditText)findViewById(R.id.ecpi);
        nxt2=(Button)findViewById(R.id.nxt2);

        pi=getIntent();

//        n=pi.getStringExtra("name");
//        p=pi.getStringExtra("pswd");


//        st=(student)pi.getSerializableExtra("st");
//        st.getName();
//        st.getPassword();


//        Bundle b=pi.getBundleExtra("b");

        nxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(firstj.this,secondj.class);

                String city=ecity.getText().toString();
                String cpi=ecpi.getText().toString();
                i.putExtra("city",city);
                i.putExtra("cpi",cpi);
                i.putExtras(pi);


//                String city=ecity.getText().toString();
//                String cpi=ecpi.getText().toString();
//                st.setCity(city);
//                st.setCpi(cpi);
//                i.putExtra("st",st);


//                i.putExtras(pi);
//                String p[]={"J","K","L"};
//                i.putExtra("p",p);

//                i.putExtras(pi);

                startActivity(i);

            }
        });
    }
}
