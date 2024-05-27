package com.example.recyclerviewapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView productsRecyclerViews;
    ProductAdapter productAdapter;
    ArrayList<String> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initProducts();
        initViews();

    }
    private void initViews(){
        productsRecyclerViews = findViewById(R.id.productRecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false);
        productsRecyclerViews.setLayoutManager(linearLayoutManager);
        productAdapter = new ProductAdapter(products);
        productsRecyclerViews.setAdapter(productAdapter);

    }
    private void initProducts(){
        products = new ArrayList<>();
        for(int i=0;i<5;i++){
            products.add("T-shirts "+i);
            products.add("Mobile "+i);
            products.add("Laptop "+i);
            products.add("Charger "+i);
            products.add("Earphone "+i);
        }


    }
}