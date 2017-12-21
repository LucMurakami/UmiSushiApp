package shasha.example.com.umisushiapp.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import shasha.example.com.umisushiapp.Interface.ItemClickListener;
import shasha.example.com.umisushiapp.R;

/**
 * Created by lucmurakami on 2017-12-20.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{

    public TextView txtMenuName;
    public ImageView imageView;

    private ItemClickListener itemClickListener;

    public MenuViewHolder(View itemView) {
        super(itemView);

        txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
        imageView = (ImageView)itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}
