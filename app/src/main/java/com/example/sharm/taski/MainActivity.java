package com.example.sharm.taski;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.sharm.taski.model.DataForCards;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<DataForCards> data=new ArrayList<>();
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv= (RecyclerView) findViewById(R.id.rv);
        linearLayoutManager=new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);
        data.add(new DataForCards("Word of The Day",R.drawable.list,R.drawable.back1));
        data.add(new DataForCards("Interactive Learning",R.drawable.thinking,R.drawable.back2));
        data.add(new DataForCards("Image Capture",R.drawable.camera,R.drawable.back4));
        data.add(new DataForCards("Status Report",R.drawable.blackboard,R.drawable.back5));
        data.add(new DataForCards("Personality of The Day",R.drawable.people,R.drawable.back3));
        rv.setAdapter(new MyAdapter());
    }
    public class MyHolder extends RecyclerView.ViewHolder{
        TextView tv_description;
        ImageView iv_icon,iv_back;

        public MyHolder(View itemView) {
            super(itemView);
            View v=itemView;
            tv_description= (TextView) v.findViewById(R.id.tv);
            iv_icon = (ImageView) v.findViewById(R.id.iv);
            iv_back= (ImageView) v.findViewById(R.id.iv_back);
        }
    }
    public class MyAdapter extends RecyclerView.Adapter<MyHolder>{

        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyHolder holder=new MyHolder(getLayoutInflater().inflate(R.layout.card_layout,parent,false));
            return holder;
        }

        @Override
        public void onBindViewHolder(MyHolder holder, int position) {
//            Picasso.with(getApplicationContext()).load(data.get(position).getIcon()).into(holder.iv_icon);
            Glide.with(getApplicationContext()).load(data.get(position).getIcon()).fitCenter().into(holder.iv_icon);
            holder.tv_description.setText(data.get(position).getDescription());
//            Picasso.with(getApplicationContext()).load(data.get(position).getBackground()).into(holder.iv_back);
            Glide.with(getApplicationContext()).load(data.get(position).getBackground()).fitCenter().into(holder.iv_back);
        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }
}
