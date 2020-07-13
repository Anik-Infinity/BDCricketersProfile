package com.androidtime.bdcricketers.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.androidtime.bdcricketers.R;
import com.androidtime.bdcricketers.model.bean.Player;
import com.bumptech.glide.Glide;

import java.util.List;

public class CricketerListViewAdapter extends RecyclerView.Adapter<CricketerListViewAdapter.CricketerInfo> {

    private Context context;
    private List<Player> playerList;

    public CricketerListViewAdapter(Context context, List<Player> playerList) {
        this.context = context;
        this.playerList = playerList;
    }

    @NonNull
    @Override
    public CricketerInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_player_view, null);
        return new CricketerInfo(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CricketerInfo holder, int position) {
        holder.cricketerName.setText(playerList.get(position).getBangla().getBnFullName());
        Glide.with(context)
                .load(playerList.get(position).getPlayerImage())
                .into(holder.cricketerImage);
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    public static class CricketerInfo extends RecyclerView.ViewHolder {
        ImageView cricketerImage;
        TextView cricketerName;

        public CricketerInfo(@NonNull View itemView) {
            super(itemView);
            cricketerImage = itemView.findViewById(R.id.player_image);
            cricketerName = itemView.findViewById(R.id.player_name);
        }
    }
}
