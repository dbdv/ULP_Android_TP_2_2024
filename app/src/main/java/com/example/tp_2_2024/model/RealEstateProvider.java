package com.example.tp_2_2024.model;

import com.example.tp_2_2024.R;

import java.util.Arrays;
import java.util.List;

public class RealEstateProvider {

    public static List<RealEstate> getAll() {
        List<RealEstate> realEstates = Arrays.asList(
                new RealEstate("San Luis", com.example.tp_2_2024.R.drawable.san_luis, 150000.00),
                new RealEstate("Villa Mercedes", R.drawable.villa_mercedes, 120000.00),
                new RealEstate("Merlo", R.drawable.merlo, 180000.00),
                new RealEstate("La Punta", R.drawable.la_punta, 200000.00),
                new RealEstate("Concarán", R.drawable.concaran, 90000.00),
                new RealEstate("Juana Koslay", R.drawable.juana_koslay, 135000.00),
                new RealEstate("La Toma", R.drawable.la_toma, 95000.00),
                new RealEstate("La Florida", R.drawable.la_florida, 210000.00),
                new RealEstate("Nueva Galia", R.drawable.nueva_galia, 105000.00),
                new RealEstate("Quines", R.drawable.quines, 110000.00)
        );
        return realEstates;
    }
}
