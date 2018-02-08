package com.example.techtron.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    int[] IMAGES = { R.drawable.bigie, R.drawable.ghandi, R.drawable.cobain, R.drawable.musk, R.drawable.swazey, R.drawable.patrick, R.drawable.dog};
    String[] NAMES = {"Biggie Smalls", "Mahatma Gandhi", "Kurt Cobain", "Elon Musk", "Patrick Swazye", "Patrick Star", "Dog"};
    String[] DESCRIPTIONS = {"Rapper", "Activist", "Rock Star", "SpaceMan", "Bouncer", "Actor", "Mans Best Friend"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);

    }

    class CustomerAdapter extends BaseAdapter{
        
    }
}
