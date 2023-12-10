package com.kel15.soloheritage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kel15.soloheritage.databinding.ActivityMainBinding;
import com.kel15.soloheritage.databinding.ItemMenuBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMenu(binding.menu1, "DAFTAR MUSEUM", R.drawable.menu1);
        setupMenu(binding.menu2, "DAFTAR CAGAR BUDAYA", R.drawable.menu2);
        setupMenu(binding.menu3, "PERSEBARAN MUSEUM", R.drawable.menu3);
        setupMenu(binding.menu4, "PERSEBARAN CAGAR BUDAYA", R.drawable.menu4);

        binding.menu1.getRoot().setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListHeritageActivity.class);
            intent.putExtra("category", "Museum");
            startActivity(intent);
        });

        binding.menu2.getRoot().setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListHeritageActivity.class);
            intent.putExtra("category", "Cultural Heritage");
            startActivity(intent);
        });

        binding.menu3.getRoot().setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DistributionHeritageActivity.class);
            intent.putExtra("category", "Museum");
            startActivity(intent);
        });

        binding.menu4.getRoot().setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DistributionHeritageActivity.class);
            intent.putExtra("category", "Cultural Heritage");
            startActivity(intent);
        });
    }

    private void setupMenu(ItemMenuBinding menuBinding, String title, int imageResource) {
        menuBinding.txtMenu.setText(title);
        menuBinding.imgMenu.setImageResource(imageResource);
    }

}