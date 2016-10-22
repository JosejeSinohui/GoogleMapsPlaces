package com.example.joseje.googlemap;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.joseje.googlemap.MapsActivity.PLACE_EXTRA_KEY;

public class DetailPlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_place);

        DetailPlaceFragment fragment = new DetailPlaceFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.detail_container, fragment).commit();
    }

    public static void start(Activity activity, Place place){
        Intent intent = new Intent(activity, DetailPlaceActivity.class);
        intent.putExtra(PLACE_EXTRA_KEY, place);
        activity.startActivity(intent);
    }

}
