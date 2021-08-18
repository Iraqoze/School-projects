package com.iraqoz.servicemappapp;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.iraqoz.servicemappapp.databinding.ActivityMapsBinding;

import java.io.IOException;
import java.util.List;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    SupportMapFragment mapFragment;
    private ActivityMapsBinding binding;
    SearchView sv, svv;
    private int ACCESS_LOCATION_REQUEST_CODE=1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //sv=findViewById(R.id.sv_location);
        svv=findViewById(R.id.sv_location);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

       /* sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                String location=sv.getQuery().toString();
                List<Address> addresses=null;
                if (location!=null || !location.equals("")){
                    Geocoder geocoder=new Geocoder(MapsActivity.this);
                    try {
                        addresses=geocoder.getFromLocationName(location,1);
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                    Address ad=addresses.get(0);
                    LatLng latLng= new LatLng(ad.getLatitude(), ad.getLongitude());
                    mMap.addMarker(new MarkerOptions().position(latLng).title(location));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,10));
                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });*/
        svv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                String service= svv.getQuery().toString();
                if (service.equals("nairobi")){
                    LatLng nairobi= new LatLng(-1.286389,36.817223);
                    mMap.addMarker(new MarkerOptions().position(nairobi).title("KCB BANK Nairobi Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(nairobi,10));

                    LatLng thika= new LatLng(-1.03326,37.06933);
                    mMap.addMarker(new MarkerOptions().position(thika).title("KCB BANK Thika Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(thika,10));

                    LatLng kikuyu= new LatLng(-1.254337,36.681660);
                    mMap.addMarker(new MarkerOptions().position(kikuyu).title("KCB BANK Kikuyu Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kikuyu,10));

                    LatLng juja= new LatLng(-1.102554,37.013193);
                    mMap.addMarker(new MarkerOptions().position(juja).title("KCB BANK Juja Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(juja,10));

                }
               else if (service.equals("mombasa")){
                    LatLng kisumu= new LatLng(-4.043740,39.658871);
                    mMap.addMarker(new MarkerOptions().position(kisumu).title("KCB BANK Mombasa Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kisumu,10));

                    LatLng m1= new LatLng(-4.043740,39.648871);
                    mMap.addMarker(new MarkerOptions().position(m1).title("KCB BANK Malimdi Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(m1,10));

                    LatLng m2= new LatLng(-4.043740,39.668871);
                    mMap.addMarker(new MarkerOptions().position(m1).title("KCB BANK Diani Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(m1,10));
                }
               else if (service.equals("kisumu")){
                    LatLng kisumu= new LatLng(-0.091702,34.767956);
                    mMap.addMarker(new MarkerOptions().position(kisumu).title("KCB BANK Kisumu Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kisumu,10));

                    LatLng k= new LatLng(-0.091702,34.757956);
                    mMap.addMarker(new MarkerOptions().position(k).title("KCB BANK Kisumu central Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(k,10));

                    LatLng k1= new LatLng(-0.091702,34.797956);
                    mMap.addMarker(new MarkerOptions().position(k1).title("KCB BANK Ndani Branch"));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(k1,10));


                }




                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
    if (ContextCompat.checkSelfPermission(this, ACCESS_FINE_LOCATION)== getPackageManager().PERMISSION_GRANTED){
        enableUserLocation();
    }
    else {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, ACCESS_FINE_LOCATION)){
            ActivityCompat.requestPermissions(this, new String[]{ACCESS_FINE_LOCATION},ACCESS_LOCATION_REQUEST_CODE);
        }
        else {
            ActivityCompat.requestPermissions(this, new String[]{ACCESS_FINE_LOCATION},ACCESS_LOCATION_REQUEST_CODE);
        }
    }

    }

    private void enableUserLocation() {
        if (ActivityCompat.checkSelfPermission(this,ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
            return;
        mMap.setMyLocationEnabled(true);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull  String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==ACCESS_LOCATION_REQUEST_CODE)
        {
            if (grantResults.length>0 || grantResults[0]==getPackageManager().PERMISSION_GRANTED)
                enableUserLocation();
            else {

            }
        }
    }
}