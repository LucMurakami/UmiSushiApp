package shasha.example.com.umisushiapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by LucMurakami on 2017-12-17.
 */

public class SubMenus extends AppCompatActivity {

    ListView myListView;
    String[] items;
    String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sashimi);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListViewSubMenu);
        items = res.getStringArray(R.array.sashimi_items);
        descriptions = res.getStringArray(R.array.descriptions);

        ItemAdapter itemAdapter = new ItemAdapter(this, items, descriptions);
        myListView.setAdapter(itemAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailActivity = new Intent(getApplicationContext(), DetailActivity.class);
                showDetailActivity.putExtra("shasha.example.com.ITEM_INDEX", i);
                startActivity(showDetailActivity);
            }
        });

    }
}
