package com.cs407.lab6;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity {

    private final LatLng bascomHallCoordinates = new LatLng(43.07593236468259, -89.404050668132);
    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_map);

        mapFragment.getMapAsync(googleMap -> {
            mMap = googleMap;
            //This line moves the camera the the default position of the marker
            mMap.moveCamera(CameraUpdateFactory.newLatLng(bascomHallCoordinates));

            googleMap.addMarker( new MarkerOptions()
                    .position(bascomHallCoordinates)
                    .title("Destination")
            );
        });
    }
}