package com.example.recyclerviewapplication;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    ArrayList<String> products;

    public ProductAdapter(ArrayList<String> products) {
        this.products = products;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView txtProduct;
        public ProductViewHolder (View itemView){
            super(itemView);
            txtProduct = (TextView) itemView;
        }
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView txtProductView = new TextView(parent.getContext());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        txtProductView.setLayoutParams(layoutParams);
        txtProductView.setTextSize(20.0F);
        txtProductView.setPadding(10,10,10,10);
        txtProductView.setTextColor(Color.WHITE);
        txtProductView.setBackgroundColor(Color.BLUE);
        return new ProductViewHolder(txtProductView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.txtProduct.setText(products.get(position));

    }

    @Override
    public int getItemCount() {
        return products.size() ;
    }

}
