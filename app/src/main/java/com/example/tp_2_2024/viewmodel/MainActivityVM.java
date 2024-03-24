package com.example.tp_2_2024.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tp_2_2024.model.RealEstate;
import com.example.tp_2_2024.model.RealEstateProvider;

import java.util.List;

public class MainActivityVM extends ViewModel {
    private MutableLiveData<List<RealEstate>> realEstateList;

    public MainActivityVM() {
        this.realEstateList = new MutableLiveData<>();
    }

    public MutableLiveData<List<RealEstate>> getRealEstateList() {
        if(realEstateList == null){
            this.realEstateList = new MutableLiveData<>();
            return  this.realEstateList;
        }
        return realEstateList;
    }

    public void getRealEstates(){
        List<RealEstate> list = RealEstateProvider.getAll();
        this.realEstateList.setValue(list);
    }
}
