package com.kel15.soloheritage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.kel15.soloheritage.databinding.ActivityListHeritageBinding;

import java.util.ArrayList;
import java.util.List;

public class ListHeritageActivity extends AppCompatActivity {

    private ActivityListHeritageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListHeritageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("category")) {
            String category = intent.getStringExtra("category");

            // Memuat data sesuai dengan kategori
            List<Heritage> heritageList;
            if ("Museum".equals(category)) {
                heritageList = DataHeritage.getMuseumList();
                binding.txtTitle.setText("Daftar Museum");
            } else if ("Cultural Heritage".equals(category)) {
                heritageList = DataHeritage.getCulturalHeritageList();
                binding.txtTitle.setText("Daftar Cagar Budaya");
            } else {
                // Handle kategori tidak dikenal atau nilai null
                heritageList = new ArrayList<>();
            }

            // Inisialisasi dan mengatur adapter untuk RecyclerView
            HeritageAdapter heritageAdapter = new HeritageAdapter(this, heritageList);
            binding.recyclerViewListHeritage.setAdapter(heritageAdapter);
            binding.recyclerViewListHeritage.setLayoutManager(new LinearLayoutManager(this));
        }
    }
}