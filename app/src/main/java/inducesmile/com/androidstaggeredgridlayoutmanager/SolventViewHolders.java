package inducesmile.com.androidstaggeredgridlayoutmanager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SolventViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView countryName;
    public ImageView countryPhoto;
    private ItemObjects item;

    public SolventViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        countryName = (TextView) itemView.findViewById(R.id.country_name);
        countryPhoto = (ImageView) itemView.findViewById(R.id.country_photo);
    }

    public void setItem(ItemObjects item) {
        this.item = item;
        countryName.setText(item.getName());
        countryPhoto.setImageResource(item.getPhoto());
    }

    @Override
    public void onClick(View view) {
        Context context = view.getContext();
        Toast.makeText(view.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        // Sub 画面を起動
        Intent intent = ProfileActivity.createIntent(context, item);
        context.startActivity(intent);
    }
}
