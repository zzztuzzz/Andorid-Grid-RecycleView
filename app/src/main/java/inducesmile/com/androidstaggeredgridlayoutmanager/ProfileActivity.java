package inducesmile.com.androidstaggeredgridlayoutmanager;

/**
 * Created by teiyuueki on 16/04/04.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProfileActivity extends Activity {

    private static final String EXTRA_ITEM = "item";

    public static Intent createIntent(Context context, ItemObjects item) {
        Intent intent = new Intent(context, ProfileActivity.class);
        intent.putExtra(EXTRA_ITEM, item);
        return intent;
    }

    private ItemObjects item;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_main);
        item = getIntent().getParcelableExtra(EXTRA_ITEM);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(EXTRA_ITEM, item);
    }

}


class Item {
    private final @DrawableRes int icon;
    private final String label;

    Item(int icon, String label) {
        this.icon = icon;
        this.label = label;
    }

    public int getIcon() {
        return icon;
    }

    public String getLabel() {
        return label;
    }
}

//class Activity {
//
//    static {
//        ArrayAdapter<Item> list = new ArrayAdapter<Item>(context, 0, list);
//        list.add(new Item(0, "プロフィール"));
//        ListView listView;
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                switch (position) {
//                    case 0:
//                }
//            }
//        });
//    }
//}
