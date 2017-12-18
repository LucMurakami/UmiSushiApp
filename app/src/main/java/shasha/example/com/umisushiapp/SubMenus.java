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

    ListView myListView2;
    String[] items2;
    String[] descriptions2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_menu);

        Intent in = getIntent();
        int index = in.getIntExtra("shasha.example.com.ITEM_INDEX", -1);

        if (index > -1) {
            int item = getItem(index);
            int description = getDescription(index);
            final String identifier = getIdentifier(index);

            Resources res2 = getResources();
            myListView2 = (ListView) findViewById(R.id.myListViewSubMenu);
            items2 = res2.getStringArray(item);
            descriptions2 = res2.getStringArray(description);

            ItemAdapter itemAdapter2 = new ItemAdapter(this, items2, descriptions2);
            myListView2.setAdapter(itemAdapter2);

            myListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent showDetailActivity = new Intent(getApplicationContext(), DetailActivity.class);
                    showDetailActivity.putExtra("shasha.example.com.ITEM_IDENTIFIER", "" + identifier);
                    showDetailActivity.putExtra("shasha.example.com.ITEM_INDEX", i);
                    startActivity(showDetailActivity);
                }
            }
            );
        }
    }

    private String getIdentifier(int index) {
        switch (index) {
            case 0:
                return "appetizer";
            case 1:
                return "soup";
            case 2:
                return "rolls";
            case 3:
                return "sashimi";
            default:
                return "";
        }
    }

    private int getItem(int index) {
        switch (index) {
            case 0:
//                return R.layout.appetizer_items;
            case 1:
//                return R.layout.soup_items;
            case 2:
//                return R.layout.roll_items;
            case 3:
                return R.array.sashimi_items;
            default:
                return -1;
        }
    }
    private int getDescription(int index) {
        switch (index) {
            case 0:
//                return R.layout.appetizer_descriptions;
            case 1:
//                return R.layout.soup_descriptions;
            case 2:
//                return R.layout.roll_descriptions;
            case 3:
                return R.array.sashimi_descriptions;
            default:
                return -1;
        }
    }
}
