package com.zdxh.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by huangchuzhou on 2016/4/11.
 */
public class MyAdapter extends RecyclerView.Adapter<myViewHolder> {
    private Context mContext;
    private List<String> mDatas;
    private LayoutInflater inflater;
    public MyAdapter(Context context, List<String> datas){
        mContext = context;
        mDatas = datas;
        inflater = LayoutInflater.from(mContext);
    }
    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recyclerview_item,parent,false);
        myViewHolder holder = new myViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        holder.tv.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }


}

class myViewHolder extends RecyclerView.ViewHolder {
    TextView tv;
    public myViewHolder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.tv);
    }
}


