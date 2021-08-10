package com.example.rvincrdecrement;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder{
    TextView mtvName;
    public Holder(@NonNull  View itemView) {
        super(itemView);
        initview();
    }

    private void initview() {
    mtvName = itemView.findViewById(R.id.tvName);
    }
    public void setData(Holder holder){
        mtvName.setText(holder.getN);
    }
}
