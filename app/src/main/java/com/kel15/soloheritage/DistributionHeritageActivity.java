package com.kel15.soloheritage;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.kel15.soloheritage.databinding.ActivityDistributionHeritageBinding;

import java.util.ArrayList;
import java.util.List;

public class DistributionHeritageActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityDistributionHeritageBinding binding;
    private String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDistributionHeritageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("category")) {
            category = intent.getStringExtra("category");
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (category != null) {
            // Memuat data sesuai dengan kategori
            List<Heritage> heritageList;
            if ("Museum".equals(category)) {
                heritageList = DataHeritage.getMuseumList();
            } else if ("Cultural Heritage".equals(category)) {
                heritageList = DataHeritage.getCulturalHeritageList();
            } else {
                // Handle kategori tidak dikenal atau nilai null
                heritageList = new ArrayList<>();
            }

            // Menambahkan marker untuk setiap lokasi pada peta
            for (Heritage heritage : heritageList) {
                LatLng location = new LatLng(heritage.getLatitude(), heritage.getLongitude());
                mMap.addMarker(new MarkerOptions().position(location).title(heritage.getTitle()));
            }

            if (!heritageList.isEmpty()) {
                // Pindahkan kamera ke lokasi pertama dalam daftar untuk memastikan semua marker terlihat
                LatLng firstLocation = new LatLng(heritageList.get(0).getLatitude(), heritageList.get(0).getLongitude());
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(firstLocation, 10f));
            }
            // Enable zoom controls
            mMap.getUiSettings().setZoomControlsEnabled(true);
        }

    }
}
