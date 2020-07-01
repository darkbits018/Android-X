package com.example.covidtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Summary summary;

    public Adapter(Summary summary, Context context){
        this.summary = summary;
    }




    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View  view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder,parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        holder.tvCountryName.setText(summary.getCountries().get(position).getCountry());
        holder.tvTotalCase.setText(summary.getCountries().get(position).getOtalases());
        holder.tvNewCases.setText(summary.getCountries().get(position).getNewcases());

    }

    @Override
    public int getItemCount() {
        return summary.getCountries().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvCountryName,tvTotalCase,tvNewCases;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            tvCountryName = itemView.findViewById(R.id.tvCountryName);
            tvTotalCase = itemView.findViewById(R.id.tvTittleTotalCases);
            tvNewCases = itemView.findViewById(R.id.tvTittleNewCase);
        }
    }
}
