package com.kel15.soloheritage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.kel15.soloheritage.databinding.ItemHeritageBinding;

import java.util.List;

public class HeritageAdapter extends RecyclerView.Adapter<HeritageAdapter.HeritageViewHolder> {

    private final Context context;
    private final List<Heritage> heritageList;

    public HeritageAdapter(Context context, List<Heritage> heritageList) {
        this.context = context;
        this.heritageList = heritageList;
    }

    @Override
    public HeritageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemHeritageBinding binding = ItemHeritageBinding.inflate(inflater, parent, false);
        return new HeritageViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(HeritageViewHolder holder, int position) {
        Heritage heritage = heritageList.get(position);
        holder.bind(heritage);
    }

    @Override
    public int getItemCount() {
        return heritageList.size();
    }

    public class HeritageViewHolder extends RecyclerView.ViewHolder {
        private final ItemHeritageBinding binding;

        public HeritageViewHolder(View itemView) {
            super(itemView);
            binding = ItemHeritageBinding.bind(itemView);
        }

        public void bind(Heritage heritage) {
            binding.imgMenu.setImageResource(heritage.getPhoto());
            binding.txtTitle.setText(heritage.getTitle());
            binding.txtDesc.setText(heritage.getDescription());
        }
    }
}
