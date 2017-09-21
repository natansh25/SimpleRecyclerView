package com.example.natan.simplerecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by natan on 9/21/2017.
 */

        public class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.MyViewHolder> {

            private int mNumberItems;



            public GreenAdapter(int numberofItems)
            {
                mNumberItems=numberofItems;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.number_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bind(position);

    }


    @Override
    public int getItemCount() {
        return mNumberItems;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView listItemNumberView;


        public MyViewHolder(View itemView) {
            super(itemView);

            listItemNumberView=(TextView)itemView.findViewById(R.id.txt);

        }

        void bind(int listIndex)
        {
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }







}
