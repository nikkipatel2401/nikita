package com.example.cuteheart.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class secondj extends AppCompatActivity {
    EditText emob;
    Button submit;
    Intent pi;
    String n,p,city,cpi,m;
    student st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        emob=(EditText)findViewById(R.id.emob);
        submit=(Button)findViewById(R.id.submit);

        pi=getIntent();

//        st=(student)pi.getSerializableExtra("st");
//        st.getCity();
//        st.getCpi();

//        final String n[]=pi.getStringArrayExtra("n");
//        final String p[]=pi.getStringArrayExtra("p");
//        final String m=n+""+p;

//        final Bundle b=pi.getBundleExtra("b");

       submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n=pi.getStringExtra("name");
                p=pi.getStringExtra("pswd");
                city=pi.getStringExtra("city");
                cpi=pi.getStringExtra("cpi");
                m=emob.getText().toString();


//                m=emob.getText().toString();
//                st.setNumber(m);




                String msg=n+" "+p+" "+city+" "+cpi+" "+m;
                Toast.makeText(secondj.this,""+msg,Toast.LENGTH_LONG).show();

//                dfghjkl


//                   Toast.makeText(secondj.this,""+m,Toast.LENGTH_LONG).show();

//                Toast.makeText(secondj.this,""+b.toString(),Toast.LENGTH_LONG).show();

            }
        });
    }
}
