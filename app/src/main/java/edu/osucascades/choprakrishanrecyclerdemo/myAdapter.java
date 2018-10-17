package edu.osucascades.choprakrishanrecyclerdemo;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private List<Item> mItems;
    private Context mContext;

    public myAdapter(List<Item> items, Context context) {
        mItems = items;
        mContext = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mTextViewHeading;
        public TextView mTextViwDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewHeading = (TextView) itemView.findViewById(R.id.textViewHeading);
            mTextViwDescription = (TextView) itemView.findViewById(R.id.textViewDescription);
        }
    }

    @NonNull
    @Override
    public myAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.ViewHolder viewHolder, int i) {
        Item item = mItems.get(i);
        viewHolder.mTextViewHeading.setText(item.getHeading());
        viewHolder.mTextViwDescription.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
