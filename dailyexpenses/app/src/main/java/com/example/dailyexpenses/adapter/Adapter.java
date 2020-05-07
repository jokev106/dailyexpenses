package com.example.dailyexpenses.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyexpenses.R;
import com.example.dailyexpenses.model.User;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    ArrayList<User> userArrayList;

    public Adapter(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_listoutputuser, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( Adapter.ViewHolder holder, int position) {
        holder.auang.setText(userArrayList.get(position).getUang());
        holder.atanggal.setText(userArrayList.get(position).getTanggal());
        holder.acatatan.setText(userArrayList.get(position).getCatatan());
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView auang;
        public TextView atanggal;
        public TextView acatatan;

        public ViewHolder(View itemView) {
            super(itemView);
            auang = (TextView) itemView.findViewById(R.id.ouputuang);
            atanggal = (TextView) itemView.findViewById(R.id.outputtanggal);
            acatatan = (TextView) itemView.findViewById(R.id.outputcatatan);
        }
    }
}
