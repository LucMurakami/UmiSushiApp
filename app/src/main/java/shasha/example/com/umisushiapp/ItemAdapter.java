package shasha.example.com.umisushiapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by ShashaHua on 2017-12-17.
 */

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] descriptions;

    public ItemAdapter() {
    }

    public ItemAdapter(Context c, String[] items, String[] descriptions) {
        this.items = items;
        this.descriptions = descriptions;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);

        String name = items[i];
        String desc = descriptions[i];

        nameTextView.setText(name);
        descriptionTextView.setText(desc);

        return v;
    }
}
