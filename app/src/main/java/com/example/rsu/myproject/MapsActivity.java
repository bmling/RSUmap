package com.example.rsu.myproject;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    Double LatB1,LngB1,LatB2,LngB2,LatB3,LngB3,LatB4,LngB4,LatB4_1,LngB4_1,LatB4_2,LngB4_2,
            LatB5,LngB5,LatB6,LngB6,LatB7,LngB7, LatB8,LngB8,LatB9,LngB9,LatB10,LngB10,
            LatB11,LngB11,LatB12,LngB12,LatB12_1,LngB12_1,LatB13,LngB13,LatB14,LngB14,
            LatB15,LngB15,LatB16,LngB16;
    Double  LatBPatana,LngBPatana,LatGuan,LngGuan,LatMusicHall,LngMusicHall,
            Latsunshine,Lngsunshine;
    Double  LatSP,LngSP,LatUStudio,LngUStudio;

    Double Centerlat, Centerlng;

    Double Latpark1,Lngpark1,Latpark2,Lngpark2,Latpark3, Lngpark3;

    Double Latfood1,Lngfood1,Latfood2, Lngfood2;

    Double Latcafe1,Lngcafe1,Latcafe2,Lngcafe2,Latcafe3,Lngcafe3,Latcafe4,Lngcafe4,
            Latcafe5,Lngcafe5,Latcafe6,Lngcafe6,Latcafe7,Lngcafe7,Latcafe8,Lngcafe8,
            Latcafe9,Lngcafe9,Latcafe10, Lngcafe10;

    Double Latcopy1, Lngcopy1,Latcopy2, Lngcopy2,Latcopy3, Lngcopy3,Latcopy4, Lngcopy4,
            Latcopy5, Lngcopy5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            Centerlat = bundle.getDouble("CenterLat");
            Centerlng = bundle.getDouble("CenterLng");

            LatB1 = bundle.getDouble("LatBuild1");
            LngB1 = bundle.getDouble("LngBuild1");
            LatB2 = bundle.getDouble("LatBuild2");
            LngB2 = bundle.getDouble("LngBuild2");
            LatB3 = bundle.getDouble("LatBuild3");
            LngB3 = bundle.getDouble("LngBuild3");
            LatB4 = bundle.getDouble("LatBuild4");
            LngB4 = bundle.getDouble("LngBuild4");
            LatB4_1 = bundle.getDouble("LatBuild4/1");
            LngB4_1 = bundle.getDouble("LngBuild4/1");
            LatB4_2 = bundle.getDouble("LatBuild4/2");
            LngB4_2 = bundle.getDouble("LngBuild4/2");
            LatB5 = bundle.getDouble("LatBuild5");
            LngB5 = bundle.getDouble("LngBuild5");
            LatB6 = bundle.getDouble("LatBuild6");
            LngB6 = bundle.getDouble("LngBuild6");
            LatB7 = bundle.getDouble("LatBuild7");
            LngB7 = bundle.getDouble("LngBuild7");
            LatB8 = bundle.getDouble("LatBuild8");
            LngB8 = bundle.getDouble("LngBuild8");
            LatB9 = bundle.getDouble("LatBuild9");
            LngB9 = bundle.getDouble("LngBuild9");
            LatB10 = bundle.getDouble("LatBuild10");
            LngB10 = bundle.getDouble("LngBuild10");
            LatB11 = bundle.getDouble("LatBuild11");
            LngB11 = bundle.getDouble("LngBuild11");
            LatB12 = bundle.getDouble("LatBuild12");
            LngB12 = bundle.getDouble("LngBuild12");
            LatB12_1 = bundle.getDouble("LatBuild12/1");
            LngB12_1 = bundle.getDouble("LngBuild12/1");
            LatB13 = bundle.getDouble("LatBuild13");
            LngB13 = bundle.getDouble("LngBuild13");
            LatB14 = bundle.getDouble("LatBuild14");
            LngB14 = bundle.getDouble("LngBuild14");
            LatB15 = bundle.getDouble("LatBuild15");
            LngB15 = bundle.getDouble("LngBuild15");
            LatB16 = bundle.getDouble("LatBuild16");
            LngB16 = bundle.getDouble("LngBuild16");
            LatMusicHall = bundle.getDouble("LatMusicHall");
            LngMusicHall = bundle.getDouble("LngMusicHall");
            LatGuan = bundle.getDouble("LatGuan");
            LngGuan = bundle.getDouble("LngGuan");
            LatBPatana = bundle.getDouble("LatBPatana");
            LngBPatana = bundle.getDouble("LngBPatana");

            //-----------------------------------------
            Latfood1 = bundle.getDouble("LatFood1");
            Lngfood1 = bundle.getDouble("LngFood1");
            Latfood2 = bundle.getDouble("LatFood2");
            Lngfood2 = bundle.getDouble("LngFood2");
            //------------------------------------------
            Latpark1 = bundle.getDouble("LatPark1");
            Lngpark1 = bundle.getDouble("LngPark1");
            Latpark2 = bundle.getDouble("LatPark2");
            Lngpark2 = bundle.getDouble("LngPark2");
            Latpark3 = bundle.getDouble("LatPark3");
            Lngpark3 = bundle.getDouble("LngPark3");
            //------------------------------------------
            Latcafe1 = bundle.getDouble("LatCafe1");
            Lngcafe1 = bundle.getDouble("LngCafe1");
            Latcafe2 = bundle.getDouble("LatCafe2");
            Lngcafe2 = bundle.getDouble("LngCafe2");
            Latcafe3 = bundle.getDouble("LatCafe3");
            Lngcafe3 = bundle.getDouble("LngCafe3");
            Latcafe4 = bundle.getDouble("LatCafe4");
            Lngcafe4 = bundle.getDouble("LngCafe4");
            Latcafe5 = bundle.getDouble("LatCafe5");
            Lngcafe5 = bundle.getDouble("LngCafe5");
            Latcafe6 = bundle.getDouble("LatCafe6");
            Lngcafe6 = bundle.getDouble("LngCafe6");
            Latcafe7 = bundle.getDouble("LatCafe7");
            Lngcafe7 = bundle.getDouble("LngCafe7");
            Latcafe8 = bundle.getDouble("LatCafe8");
            Lngcafe8 = bundle.getDouble("LngCafe8");
            Latcafe9 = bundle.getDouble("LatCafe9");
            Lngcafe9 = bundle.getDouble("LngCafe9");
            Latcafe10 = bundle.getDouble("LatCafe10");
            Lngcafe10 = bundle.getDouble("LngCafe10");

            //------------------------------------------
            Latcopy1 = bundle.getDouble("LatCopy1");
            Lngcopy1 = bundle.getDouble("LngCopy1");
            Latcopy2 = bundle.getDouble("LatCopy2");
            Lngcopy2 = bundle.getDouble("LngCopy2");
            Latcopy3 = bundle.getDouble("LatCopy3");
            Lngcopy3 = bundle.getDouble("LngCopy3");
            Latcopy4 = bundle.getDouble("LatCopy4");
            Lngcopy4 = bundle.getDouble("LngCopy4");
            Latcopy5 = bundle.getDouble("LatCopy5");
            Lngcopy5 = bundle.getDouble("LngCopy5");

        }

    }//End of onCreate


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        //ZoomMap
        LatLng center = new LatLng(Centerlat, Centerlng);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 18));


        LatLng build1 = new LatLng(LatB1, LngB1);
        mMap.addMarker(new MarkerOptions().position(build1).title(getString(R.string.title_build1))
                .snippet(getString(R.string.snippet_build1)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build2 = new LatLng(LatB2, LngB2);
        mMap.addMarker(new MarkerOptions().position(build2).title(getString(R.string.title_build2))
                .snippet(getString(R.string.snippet_build2)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build3 = new LatLng(LatB3, LngB3);
        mMap.addMarker(new MarkerOptions().position(build3).title(getString(R.string.title_build3))
                .snippet(getString(R.string.snippet_build3)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build4 = new LatLng(LatB4, LngB4);
        mMap.addMarker(new MarkerOptions().position(build4).title(getString(R.string.title_build4))
                .snippet(getString(R.string.snippet_build4)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build4_1 = new LatLng(LatB4_1, LngB4_1);
        mMap.addMarker(new MarkerOptions().position(build4_1).title(getString(R.string.title_build4_1))
                .snippet(getString(R.string.snippet_build4_1)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build4_2 = new LatLng(LatB4_2, LngB4_2);
        mMap.addMarker(new MarkerOptions().position(build4_2).title(getString(R.string.title_build4_2))
                .snippet(getString(R.string.snippet_build4_2)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build5 = new LatLng(LatB5, LngB5);
        mMap.addMarker(new MarkerOptions().position(build5).title(getString(R.string.title_build5))
                .snippet(getString(R.string.snippet_build5)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build6 = new LatLng(LatB6, LngB6);
        mMap.addMarker(new MarkerOptions().position(build6).title(getString(R.string.title_build6))
                .snippet(getString(R.string.snippet_build6)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build7 = new LatLng(LatB7, LngB7);
        mMap.addMarker(new MarkerOptions().position(build7).title(getString(R.string.title_build7))
                .snippet(getString(R.string.snippet_build7)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build8 = new LatLng(LatB8, LngB8);
        mMap.addMarker(new MarkerOptions().position(build8).title(getString(R.string.title_build8))
                .snippet(getString(R.string.snippet_build8)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build9 = new LatLng(LatB9, LngB9);
        mMap.addMarker(new MarkerOptions().position(build9).title(getString(R.string.title_build9))
                .snippet(getString(R.string.snippet_build9)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build10 = new LatLng(LatB10, LngB10);
        mMap.addMarker(new MarkerOptions().position(build10).title(getString(R.string.title_build10))
                .snippet(getString(R.string.snippet_build10)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build11 = new LatLng(LatB11, LngB11);
        mMap.addMarker(new MarkerOptions().position(build11).title(getString(R.string.title_build11))
                .snippet(getString(R.string.snippet_build11)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build12 = new LatLng(LatB12, LngB12);
        mMap.addMarker(new MarkerOptions().position(build12).title(getString(R.string.title_build12))
                .snippet(getString(R.string.snippet_build12)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build12_1 = new LatLng(LatB12_1, LngB12_1);
        mMap.addMarker(new MarkerOptions().position(build12_1).title(getString(R.string.title_build12_1))
                .snippet(getString(R.string.snippet_build12_1)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build13 = new LatLng(LatB13, LngB13);
        mMap.addMarker(new MarkerOptions().position(build13).title(getString(R.string.title_build13))
                .snippet(getString(R.string.snippet_build13)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build14 = new LatLng(LatB14, LngB14);
        mMap.addMarker(new MarkerOptions().position(build14).title(getString(R.string.title_build14))
                .snippet(getString(R.string.snippet_build14)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build15 = new LatLng(LatB15, LngB15);
        mMap.addMarker(new MarkerOptions().position(build15).title(getString(R.string.title_build15))
                .snippet(getString(R.string.snippet_build15)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build16 = new LatLng(LatB16, LngB16);
        mMap.addMarker(new MarkerOptions().position(build16).title(getString(R.string.title_build16))
                .snippet(getString(R.string.snippet_build16)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build17 = new LatLng(LatMusicHall, LngMusicHall);
        mMap.addMarker(new MarkerOptions().position(build17).title(getString(R.string.title_buildMusicHall))
                .snippet(getString(R.string.snippet_buildMusicHall)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));

        LatLng build18 = new LatLng(LatGuan, LngGuan);
        mMap.addMarker(new MarkerOptions().position(build18).title(getString(R.string.title_buildGuan))
                .snippet(getString(R.string.snippet_buildGuan)).icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));


        LatLng buildPatana = new LatLng(LatBPatana, LngBPatana);
        mMap.addMarker(new MarkerOptions().position(buildPatana).title(getString(R.string.title_buildPatana))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_build48)));


        ////-----------Bank--------------/////
        LatLng bankbbl = new LatLng(13.965195, 100.587199);
        mMap.addMarker(new MarkerOptions().position(bankbbl).title(getString(R.string.title_bankbbl))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.bbl)));

        LatLng bankscb = new LatLng(13.963575, 100.587003);
        mMap.addMarker(new MarkerOptions().position(bankscb).title(getString(R.string.title_bankscb))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.scb)));

        ////-------ETC------------
        LatLng s_p = new LatLng(13.966182, 100.586694);
        mMap.addMarker(new MarkerOptions().position(s_p).title(getString(R.string.title_sp))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.sp)));

        LatLng book = new LatLng(13.966082, 100.585460);
        mMap.addMarker(new MarkerOptions().position(book).title(getString(R.string.title_book))
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.book)));

        LatLng fitness = new LatLng(13.968414, 100.587401);
        mMap.addMarker(new MarkerOptions().position(fitness).title(getString(R.string.title_fitness))
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.fit)));

        LatLng pool = new LatLng(13.969359, 100.587155);
        mMap.addMarker(new MarkerOptions().position(pool).title(getString(R.string.title_pool))
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.pool)));

        LatLng post = new LatLng(13.966222, 100.585433);
        mMap.addMarker(new MarkerOptions().position(post).title(getString(R.string.title_post))
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.post)));

        LatLng ustudio = new LatLng(13.965022, 100.584949);
        mMap.addMarker(new MarkerOptions().position(ustudio).title(getString(R.string.title_ustudio))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.apple)));


        //------------Food-----------------
        LatLng food1 = new LatLng(Latfood1, Lngfood1);
        mMap.addMarker(new MarkerOptions().position(food1).title(getString(R.string.title_food))
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_food48)));

        LatLng food2 = new LatLng(Latfood2, Lngfood2);
        mMap.addMarker(new MarkerOptions().position(food2).title(getString(R.string.title_food10))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_food48)));

        //------------Park-----------------
        LatLng park = new LatLng(Latpark1, Lngpark1);
        mMap.addMarker(new MarkerOptions().position(park).title(getString(R.string.title_park15))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_park48)));

        LatLng park2 = new LatLng(Latpark2, Lngpark2);
        mMap.addMarker(new MarkerOptions().position(park2).title(getString(R.string.title_parksun))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_park48)));

        LatLng park3 = new LatLng(Latpark3, Lngpark3);
        mMap.addMarker(new MarkerOptions().position(park3).title(getString(R.string.title_park12))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_park48)));

        //-------------Cafe---------------
        LatLng cafe1 = new LatLng(Latcafe1, Lngcafe1);
        mMap.addMarker(new MarkerOptions().position(cafe1).title(getString(R.string.cafe1))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        LatLng cafe2 = new LatLng(Latcafe2, Lngcafe2);
        mMap.addMarker(new MarkerOptions().position(cafe2).title(getString(R.string.cafe2))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        LatLng cafe3 = new LatLng(Latcafe3, Lngcafe3);
        mMap.addMarker(new MarkerOptions().position(cafe3).title(getString(R.string.cafe3))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        LatLng cafe4 = new LatLng(Latcafe4, Lngcafe4);
        mMap.addMarker(new MarkerOptions().position(cafe4).title(getString(R.string.cafe4))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        LatLng cafe5 = new LatLng(Latcafe5, Lngcafe5);
        mMap.addMarker(new MarkerOptions().position(cafe5).title(getString(R.string.cafe5))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        LatLng cafe6 = new LatLng(Latcafe6, Lngcafe6);
        mMap.addMarker(new MarkerOptions().position(cafe6).title(getString(R.string.cafe6))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        LatLng cafe7 = new LatLng(Latcafe7, Lngcafe7);
        mMap.addMarker(new MarkerOptions().position(cafe7).title(getString(R.string.cafe7))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        LatLng cafe8 = new LatLng(Latcafe8, Lngcafe8);
        mMap.addMarker(new MarkerOptions().position(cafe8).title(getString(R.string.cafe8))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        LatLng cafe9 = new LatLng(Latcafe9, Lngcafe9);
        mMap.addMarker(new MarkerOptions().position(cafe9).title(getString(R.string.cafe9))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        LatLng cafe10 = new LatLng(Latcafe10, Lngcafe10);
        mMap.addMarker(new MarkerOptions().position(cafe10).title(getString(R.string.cafe10))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_cafe48)));

        //-------------Copy---------------
        LatLng copy1 = new LatLng(Latcopy1, Lngcopy1);
        mMap.addMarker(new MarkerOptions().position(copy1).title(getString(R.string.copy1))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_copy48)));

        LatLng copy2 = new LatLng(Latcopy2, Lngcopy2);
        mMap.addMarker(new MarkerOptions().position(copy2).title(getString(R.string.copy2))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_copy48)));

        LatLng copy3 = new LatLng(Latcopy3, Lngcopy3);
        mMap.addMarker(new MarkerOptions().position(copy3).title(getString(R.string.copy3))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_copy48)));

        LatLng copy4 = new LatLng(Latcopy4, Lngcopy4);
        mMap.addMarker(new MarkerOptions().position(copy4).title(getString(R.string.copy4))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_copy48)));

        LatLng copy5 = new LatLng(Latcopy5, Lngcopy5);
        mMap.addMarker(new MarkerOptions().position(copy5).title(getString(R.string.copy5))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_copy48)));

    }//End of onMapReady

}// End of Main
