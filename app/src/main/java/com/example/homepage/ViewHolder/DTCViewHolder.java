package com.example.homepage.ViewHolder;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homepage.Interface.ItemClickListener;
import com.example.homepage.R;

public class DTCViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtDTCnumber, txtDescription, txtAdvice;
    public ItemClickListener listener;


    public DTCViewHolder(@NonNull View itemView)
    {
        super(itemView);

        txtDTCnumber = (TextView) itemView.findViewById(R.id.add_new_dtc);
        txtDescription = (TextView) itemView.findViewById(R.id.description);
        txtAdvice = (TextView) itemView.findViewById(R.id.advice);

    }

    public void setItemClickListener (ItemClickListener listener)
    {
        this.listener = listener;
    }

    @Override
    public void onClick(View v)
    {
        listener.onClick(v, getAdapterPosition(),false);
    }

}
