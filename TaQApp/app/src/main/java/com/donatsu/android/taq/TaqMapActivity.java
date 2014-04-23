package com.donatsu.android.taq;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class TaqMapActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_taqmap);

        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        LatLng cpp = new LatLng(34.055409, -117.821021);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(cpp, 15));

        map.addMarker(new MarkerOptions()
                .title("Cal Poly Pomona")
                .snippet("Computer Science CS480")
                .position(cpp));
        /*
         * map.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.house_flag))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(41.889, -87.622)));
         */
    }
}