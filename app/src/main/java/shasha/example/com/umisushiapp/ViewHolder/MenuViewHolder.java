package shasha.example.com.umisushiapp.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import shasha.example.com.umisushiapp.R;

/**
 * Created by lucmurakami on 2017-12-20.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder //implements View.onClickListener
{

    public TextView txtMenuName;
    public ImageView imageView;

    public MenuViewHolder(View itemView) {
        super(itemView);

//        textMenuName = (TextView)itemView.findViewById(R.id);
    }

//    @Override
    public void onClick(View view) {

    }
}
