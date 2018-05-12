package cubex.mahesh.googleplacestest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyAdapter extends
                    RecyclerView.Adapter<MyHolder> {

    MainActivity mActivity;
    ArrayList<Place> list;

    public MyAdapter(MainActivity mainActivity,
                                                        ArrayList<Place> list) {
        this.mActivity = mainActivity;
        this.list = list ;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =
                    LayoutInflater.from(mActivity);
        View v = inflater.inflate(R.layout.myview,parent,
                false);
        return new MyHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.tv1.setText(list.get(position).getName());
        holder.tv2.setText(list.get(position).getVicinity());

    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
