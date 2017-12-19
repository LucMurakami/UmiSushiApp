package shasha.example.com.umisushiapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Resources res = getResources();
        Intent in = getIntent();
        int index = in.getIntExtra("shasha.example.com.ITEM_INDEX", -1);
        String identifier = in.getStringExtra("shasha.example.com.ITEM_IDENTIFIER");

        if (index > -1) {
            int pic = getImgIdentifier(identifier, index);
            ImageView img = (ImageView) findViewById(R.id.imageView);
            scaleImg(img, pic);
            descriptions = res.getStringArray(getDescriptionIdentifier(identifier, index));
            TextView description = (TextView) findViewById(R.id.textViewDescription);
            description.setText(descriptions[index]);
        }
    }

    // Selects the right switch statement using the identifier passed in through
    // the Intent to display the correct image.
    private int getImgIdentifier(String identifier, int index) {
        switch (identifier) {
            case "appetizer": return getImgAppetizer(index);
            case "soup_salad": return getImgSoupSalad(index);
            case "rolls": return getImgRoll(index);
            case "sashimi": return getImgSashimi(index);
//            case "dons": return getImgDons(index);
//            case "a_la_cart": return getImgALaCart(index);
//            case "lunch_set": return getImgLunchSet(index);
//            case "party_set": return getImgPartySet(index);
//            case "sake_list": return getImgSakeList(index);
            case "desserts": return getImgDesserts(index);
            default: return -1;
        }
    }

    // Holds the pictures for the Appetizer page.
    private int getImgAppetizer(int index) {
        switch (index) {
            case 0: return R.drawable.appetizer_agedashi_tofu;
            case 1: return R.drawable.appetizer_ebi_sunomono;
            case 2: return R.drawable.appetizer_chawanmushi;
            case 3: return R.drawable.appetizer_gomaae;
            case 4: return R.drawable.appetizer_chicken_karaage;
            case 5: return R.drawable.appetizer_takoyaki;
            default: return -1;
        }
    }

    // Holds the pictures for the soup page.
    private int getImgSoupSalad(int index) {
        switch (index) {
            case 0: return R.drawable.soup_veggie_miso;
            case 1: return R.drawable.soup_clam_miso;
            case 2: return R.drawable.soup_shiromiso_tonjiru;
            case 3: return R.drawable.salad_ahi_tuna;
            case 4: return R.drawable.salad_kani;
            case 5: return R.drawable.salad_salmon_poke;
            default: return -1;
        }
    }

    // Holds the pictures for the rolls page.
    private int getImgRoll(int index) {
        switch (index) {
            case 0: return R.drawable.roll_avocado;
            case 1: return R.drawable.roll_calamari;
            case 2: return R.drawable.roll_tuna;
            case 3: return R.drawable.roll_rainbow;
            case 4: return R.drawable.roll_sunset;
            case 5: return R.drawable.roll_philadelphia;
            case 6: return R.drawable.roll_volcano;
            case 7: return R.drawable.roll_assorted_battera;
            default: return -1;
        }
    }

    // Holds the pictures for the sashimi page.
    private int getImgSashimi(int index) {
        switch (index) {
            case 0: return R.drawable.sashimi_saba;
            case 1: return R.drawable.sashimi_beni_sake;
            case 2: return R.drawable.sashimi_bincho_toro;
            case 3: return R.drawable.sashimi_maguro;
            case 4: return R.drawable.sashimi_hamachi;
            case 5: return R.drawable.sashimi_kampachi;
            case 6: return R.drawable.sashimi_hotate;
            case 7: return R.drawable.sashimi_otoro;
            case 8: return R.drawable.sashimi_botan_ebi;
            case 9: return R.drawable.sashimi_ikura;
            default: return -1;
        }
    }

    // Holds the pictures for the dons page.
    private int getImgDons(int index) {
        switch (index) {
//            case 0: return R.drawable.dons;
//            case 1: return R.drawable.dons;
//            case 2: return R.drawable.dons;
//            case 3: return R.drawable.dons;
            default: return -1;
        }
    }

    // Holds the pictures for the a la carte page.
    private int getImgALaCarte(int index) {
        switch (index) {
//            case 0: return R.drawable.a_la_carte;
//            case 1: return R.drawable.a_la_carte;
//            case 2: return R.drawable.a_la_carte;
//            case 3: return R.drawable.a_la_carte;
            default: return -1;
        }
    }

    // Holds the pictures for the lunch sets page.
    private int getImgLunchSet(int index) {
        switch (index) {
//            case 0: return R.drawable.lunch_set;
//            case 1: return R.drawable.lunch_set;
//            case 2: return R.drawable.lunch_set;
//            case 3: return R.drawable.lunch_set;
            default: return -1;
        }
    }

    // Holds the pictures for the party sets page.
    private int getImgPartySet(int index) {
        switch (index) {
//            case 0: return R.drawable.party_set;
//            case 1: return R.drawable.party_set;
//            case 2: return R.drawable.party_set;
//            case 3: return R.drawable.party_set;
            default: return -1;
        }
    }

    // Holds the pictures for the sake list page.
    private int getImgSakeList(int index) {
        switch (index) {
//            case 0: return R.drawable.sake_list;
//            case 1: return R.drawable.sake_list;
//            case 2: return R.drawable.sake_list;
//            case 3: return R.drawable.sake_list;
            default: return -1;
        }
    }

    // Holds the pictures for the desserts page.
    private int getImgDesserts(int index) {
        switch (index) {
            case 0: return R.drawable.dessert_raspberry_almond_gateau;
            case 1: return R.drawable.dessert_strawberry_cheesecake;
            case 2: return R.drawable.dessert_matcha_mousse_cake;
            default: return -1;
        }
    }

    // Selects the right switch statement using the identifier passed in through
    // the Intent to populate the description field.
    private int getDescriptionIdentifier(String identifier, int index) {
        switch (identifier) {
            case "appetizer": return R.array.appetizer_full_descriptions;
            case "soup_salad": return R.array.soup_salad_full_descriptions;
            case "rolls": return R.array.rolls_full_descriptions;
            case "sashimi": return R.array.sashimi_full_descriptions;
//            case "dons": return getImgDons(index);
//            case "a_la_cart": return getImgALaCart(index);
//            case "lunch_set": return getImgLunchSet(index);
//            case "party_set": return getImgPartySet(index);
//            case "sake_list": return getImgSakeList(index);
            case "desserts": return R.array.desserts_full_descriptions;
            default: return -1;
        }
    }

    private void scaleImg(ImageView img, int pic) {
        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();

        if (imgWidth > screenWidth) {
            int ratio = Math.round((float)imgWidth / (float)screenWidth);
            options.inSampleSize = ratio;
        }

        options.inJustDecodeBounds = false;
        Bitmap scaledImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaledImg);
    }
}
