package com.example.tp_2_2024.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tp_2_2024.R;
import com.example.tp_2_2024.adapter.RealEstateAdapter;
import com.example.tp_2_2024.databinding.ActivityMainBinding;
import com.example.tp_2_2024.model.RealEstate;
import com.example.tp_2_2024.model.RealEstateProvider;
import com.example.tp_2_2024.viewmodel.MainActivityVM;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MainActivityVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(MainActivityVM.class);
        viewModel.getRealEstateList().observe(this, realEstates -> {
            if(realEstates.size() < 1){
                viewModel.getRealEstates();
            }
            this.loadList(realEstates);
        });
        viewModel.getRealEstates();
    }

    public void loadList(List<RealEstate> list) {
        ArrayAdapter<RealEstate> adapter = new RealEstateAdapter(this, R.layout.list_item, list, getLayoutInflater());
        ListView view = findViewById(R.id.RealEstateList);
        view.setAdapter(adapter);
    }
}