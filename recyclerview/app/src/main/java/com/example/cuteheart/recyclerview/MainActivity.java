package com.example.cuteheart.recyclerview;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<person> datalist;
    private RecyclerView recyclerView;
    private recycler rec;
    String url="http://192.168.1.82:8080/WebApplication2/emp";// return json collections of person

    JSONArray ab = new JSONArray();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        datalist=new ArrayList<person>();




      /*  datalist.add(new person("a","b","c"));
        datalist.add(new person("d","e","f"));
        datalist.add(new person("g","h","i"));
        datalist.add(new person("j","k","l"));
        datalist.add(new person("m","n","o"));
        datalist.add(new person("p","q","r"));
        datalist.add(new person("s","t","u"));
        datalist.add(new person("v","w","x"));
        datalist.add(new person("y","z","1"));
        datalist.add(new person("2","3","4"));
        datalist.add(new person("5","6","7"));
        datalist.add(new person("a","b","c"));
        datalist.add(new person("d","e","f"));
        datalist.add(new person("g","h","i"));
        datalist.add(new person("j","k","l"));
        datalist.add(new person("m","n","o"));
        datalist.add(new person("p","q","r"));
        datalist.add(new person("s","t","u"));
        datalist.add(new person("v","w","x"));
        datalist.add(new person("y","z","1"));
        datalist.add(new person("2","3","4"));
        datalist.add(new person("5","6","7"));
        datalist.add(new person("a","b","c"));
        datalist.add(new person("d","e","f"));
        datalist.add(new person("g","h","i"));
        datalist.add(new person("j","k","l"));
        datalist.add(new person("m","n","o"));
        datalist.add(new person("p","q","r"));
        datalist.add(new person("s","t","u"));
        datalist.add(new person("v","w","x"));
        datalist.add(new person("y","z","1"));
        datalist.add(new person("2","3","4"));
        datalist.add(new person("5","6","7"));
     //   rec.notifyDataSetChanged();
     */

        MyTask1 mt1=new MyTask1();
        mt1.execute(url);
    }

    class MyTask1 extends AsyncTask<String, String, String> {


        public String doInBackground(String... params) {
            String resp = null;

            String weburl=params[0];

            StringBuffer output=new StringBuffer();
            try {
                InputStream stream = null;
                // start of code of connnetion

                Log.d("url",weburl);
                URL url = new URL(weburl);
                URLConnection connection = url.openConnection();

                String sd = "abcbjj";
                Log.d("error41",sd);
                HttpURLConnection httpConnection = (HttpURLConnection) connection;
                String sm = "bnhjbc";
                Log.d("error42",sm);
                httpConnection.setRequestMethod("GET");
                String sg = "abcggh";
                Log.d("error43",sg);
                httpConnection.connect();
                String sk = "abcmj";
                Log.d("error44",sk);
                stream = httpConnection.getInputStream();
                String sl = "abckkii";
                Log.d("error46",sl);
                BufferedReader buffer = new BufferedReader(new InputStreamReader(stream));
                String s = "abc";
                Log.d("error45",s);
                while ((s = buffer.readLine()) != null)
                    output.append(s);
            } catch (Exception e) {
                Log.e("error62",e.getMessage());

            }
            return output.toString();


        }


        protected void onPreExecute(){

        }

        protected void onPostExecute(String s) {

            JSONTokener jt=new JSONTokener(s);

            try {
                JSONArray ja=new JSONArray(s);
                for(int i=0;i<ja.length();i++) {

                    JSONObject obj = (JSONObject) ja.getJSONObject(i);

                    String f_name = obj.getString("f_name");
                    String password = obj.getString("password");
                    String file_path=obj.getString("file_path");
                    Log.d("edfr", jt.toString());
                    datalist.add(new person(f_name,password,file_path));
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            String n="get is called";
            Log.d("149",n);

           /* Intent intent1=new Intent(Registration.this,HomePage.class);
            startActivity(intent1);*/
            rec=new recycler(datalist);

            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            //  recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, LinearLayoutManager.VERTICAL));

            recyclerView.setAdapter(rec);
        }


    }
 /*   private class MyTask extends ASyntask<>
    {



        public void onPostExecute(String jsonperson)
        {
            // jsonperson is string obj of jason record of mulitple person
            //" {}""
            // take data from jsonperson and make object of person class and add it in list
            //write code to show recyler view
        }
    }*/

}
