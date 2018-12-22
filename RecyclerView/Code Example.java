package com.udacity.abomed7at55.myownchallenge;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by AboMed7at on 11/18/2017.
 */

public class AdapterData extends RecyclerView.Adapter<AdapterData.MyViewHolder> {
    /**
     * Data which the adapter will use to fill the recycler view
     */
    private String data[] = null;
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /**
         * Context from the parent view
         */
        Context context = parent.getContext();
        /**
         * LayoutInflater object to access xml elements and create java objects of them
         */
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        /**
         * Layout View Object
         */
        View v =layoutInflater.inflate(R.layout.recycler_view_item,parent,false);
        /**
         * View representing one item in the RecyclerView
         */
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //Setting data in the RecyclerView
        holder.tv_data_holder.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        if(data != null) return data.length;
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        /**
         * TextView Which will contain the data shown in each item
         */
        TextView tv_data_holder;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_data_holder = itemView.findViewById(R.id.tv_item);
        }
    }

    /**
     * Sets the data which the adapter will use to fill the recycler view
     * @param dta data as string array
     */
    public void setData(String[] dta){
        data = dta;
        //Tells the adapter to start creating ViewHolders and Binding data
        notifyDataSetChanged();
    }
}
