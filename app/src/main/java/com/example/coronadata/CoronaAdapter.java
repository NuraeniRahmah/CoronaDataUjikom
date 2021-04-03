package com.example.coronadata;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class CoronaAdapter extends RecyclerView.Adapter<CoronaAdapter.CoronaHolder> {
    List<Provinsi> list_data;
    Activity activity;

    public CoronaAdapter(List<Provinsi> list_data, Activity activity) {
        this.list_data = list_data;
        this.activity = activity;
    }

    @NonNull
    @Override
    public CoronaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.rv_item,parent,false);
        return new CoronaHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CoronaHolder holder, int position) {
    holder.txtprov.setText(list_data.get(position).getKey());
    float a=list_data.get(position).getDoc_count();
    holder.txtdoc.setText(Float.toString(a));
    long b=list_data.get(position).getJumlah_kasus();
    holder.txtkasus.setText(Long.toString(b));
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Provinsi kirimkan=list_data.get(position);
            Intent pindah=new Intent(activity,DetailActivity.class);
            pindah.putExtra("kirim", kirimkan);
            v.getContext().startActivity(pindah);
        }
    });
    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }

    static class CoronaHolder extends RecyclerView.ViewHolder {
        TextView txtprov, txtdoc,txtkasus;

        public CoronaHolder(View itemView){
            super(itemView);
            txtprov=(TextView)itemView.findViewById(R.id.txt_prov);
            txtdoc=(TextView)itemView.findViewById(R.id.txt_doc);
            txtkasus=(TextView)itemView.findViewById(R.id.txt_kasus);
        }

    }
}
