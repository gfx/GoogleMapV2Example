package com.example.googlemapv2example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

/**
 * @see https://developers.google.com/maps/documentation/android/start
 */
public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.map);
		final GoogleMap map = ((SupportMapFragment)fragment).getMap();
		map.setMyLocationEnabled(true);

		final LatLng mtFujiCoord = new LatLng(35.3580, 138.7310);
		map.moveCamera( CameraUpdateFactory.newLatLngZoom(mtFujiCoord, 10.0f) );
	}
}
