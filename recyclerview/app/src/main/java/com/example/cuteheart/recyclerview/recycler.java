package com.example.cuteheart.recyclerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Movie;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class recycler extends RecyclerView.Adapter<recycler.MyViewHolder> {

    ArrayList<person> datalist;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,password;
        ImageView iv;
        public MyViewHolder( View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            password=(TextView)itemView.findViewById(R.id.pswd);
            iv=(ImageView)itemView.findViewById(R.id.iv);

        }
    }

    public recycler(ArrayList<person> datalist) {
        this.datalist=datalist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.textviews, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int i) {

        person per=(person)datalist.get(i);
        holder.name.setText(per.getF_name());
       holder.password.setText(per.getPassword());
        new MyTask(holder.iv).execute(per.getFile_path());


    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    private class MyTask extends AsyncTask<String,Void,Bitmap> {
        ImageView imageView;

        public MyTask(ImageView imageView){
            this.imageView = imageView;
        }

            /*
                doInBackground(Params... params)
                    Override this method to perform a computation on a background thread.
             */

        protected Bitmap doInBackground(String...urls){
            String urlOfImage = urls[0];
            Bitmap logo = null;
            try{
                InputStream is = new URL(urlOfImage).openStream();
                /*
                    decodeStream(InputStream is)
                        Decode an input stream into a bitmap.
                 */
                logo = BitmapFactory.decodeStream(is);
            }catch(Exception e){ // Catch the download exception
                e.printStackTrace();
                Log.e("Error Message", e.getMessage());
            }
            return logo;
        }

        /*
            onPostExecute(Result result)
                Runs on the UI thread after doInBackground(Params...).
         */
        protected void onPostExecute(Bitmap result){

            Log.d("error123","asfghgfewsd"+result);

            imageView.setImageBitmap(result);
        }
    }

}
