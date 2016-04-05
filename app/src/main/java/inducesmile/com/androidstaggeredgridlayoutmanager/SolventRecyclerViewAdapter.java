package inducesmile.com.androidstaggeredgridlayoutmanager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SolventRecyclerViewAdapter  extends RecyclerView.Adapter<SolventViewHolders> {

    //代入用のデータエリア確保
    private List<ItemObjects> itemList;
    private Context context;

    //第一引数が呼び出し元クラス名、第二引数がlist
    public SolventRecyclerViewAdapter(Context context, List<ItemObjects> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    //viewadapter -> ViewHolder --> viewの使い回し作業をするために、データを渡している。
    @Override
    public SolventViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate先のxmlを指定して、使い回す予定の場所を確保する。
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.solvent_list, null);
        SolventViewHolders rcv = new SolventViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(SolventViewHolders holder, int position) {
        holder.setItem(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

}
