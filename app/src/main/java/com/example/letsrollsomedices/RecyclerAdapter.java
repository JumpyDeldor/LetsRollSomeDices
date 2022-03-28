//package com.example.letsrollsomedices;
//Мне в падлу его делать
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.CheckBox;
//import android.widget.EditText;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
//
//    private final LayoutInflater inflater;
//    private final List<TableField> states;
//
//    RecyclerAdapter(Context context, List<TableField> states) {
//        this.states = states;
//        this.inflater = LayoutInflater.from(context);
//    }
//    @Override
//    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//
//        View view = inflater.inflate(R.layout.list_item, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
//        TableField state = states.get(position);
//        holder.flagView.setText(state.getFlagResource());
//
//        holder.checkBox1.setChecked(state.getCheckBox1Resource());
//        holder.checkBox2.setChecked(state.getCheckBox2Resource());
//        holder.checkBox3.setChecked(state.getCheckBox3Resource());
//    }
//
//    @Override
//    public int getItemCount() {
//        return states.size();
//    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        final EditText flagView;
//
//        final CheckBox checkBox1, checkBox2, checkBox3;
//        ViewHolder(View view){
//            super(view);
//            flagView = (EditText)view.findViewById(R.id.editTextTextPersonName2);
//
//            checkBox1 = (CheckBox) view.findViewById(R.id.checkBox1);
//            checkBox2 = (CheckBox) view.findViewById(R.id.checkBox2);
//            checkBox3 = (CheckBox) view.findViewById(R.id.checkBox3);
//        }
//    }
//}
