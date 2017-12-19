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
        setContentView(R.layout.sub_menu);

        Intent in = getIntent();
        int index = in.getIntExtra("shasha.example.com.ITEM_INDEX", -1);

        if (index > -1) {
            int item = getItem(index);
            int description = getDescription(index);
            final String identifier = getIdentifier(index);

            Resources res = getResources();
            myListView = (ListView) findViewById(R.id.myListViewSubMenu);
            items = res.getStringArray(item);
            descriptions = res.getStringArray(description);

            ItemAdapter itemAdapter = new ItemAdapter(this, items, descriptions);
            myListView.setAdapter(itemAdapter);

            myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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

    // Determines which main menu item was clicked and returns the corresponding
    // string which will be passed to the DetailActivity page using it's Intent.
    private String getIdentifier(int index) {
        switch (index) {
            case 0:
                return "appetizer";
            case 1:
                return "soup_salad";
            case 2:
                return "rolls";
            case 3:
                return "sashimi";
            case 4:
                return "udon";
            case 5:
                return "dons";
            case 6:
                return "a_la_carte";
            case 7:
                return "lunch_set";
            case 8:
                return "party_set";
            case 9:
                return "sake_list";
            default:
                return "";
        }
    }

    // Grabs the corresponding String array from the string.xml file in the values
    // folder to populate the items in the submenu.
    private int getItem(int index) {
        switch (index) {
            case 0:
                return R.array.appetizer_items;
            case 1:
                return R.array.soup_salad_items;
            case 2:
                return R.array.rolls_items;
            case 3:
                return R.array.sashimi_items;
            case 4:
                return R.array.udon_items;
            case 5:
                return R.array.dons_items;
            case 6:
                return R.array.a_la_carte_items;
            case 7:
                return R.array.lunch_set_items;
            case 8:
                return R.array.party_set_items;
            case 9:
                return R.array.sake_list_items;
            default:
                return -1;
        }
    }

    // Grabs the corresponding String array from the string.xml file in the values
    // folder to populate the descriptions in the submenu.
    private int getDescription(int index) {
        switch (index) {
            case 0:
                return R.array.appetizer_descriptions;
            case 1:
                return R.array.soup_salad_descriptions;
            case 2:
                return R.array.rolls_descriptions;
            case 3:
                return R.array.sashimi_descriptions;
            case 4:
                return R.array.udon_descriptions;
            case 5:
                return R.array.dons_descriptions;
            case 6:
                return R.array.a_la_carte_descriptions;
            case 7:
                return R.array.lunch_set_descriptions;
            case 8:
                return R.array.party_set_descriptions;
            case 9:
                return R.array.sake_list_descriptions;
            default:
                return -1;
        }
    }
}
