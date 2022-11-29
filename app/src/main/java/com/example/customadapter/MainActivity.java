package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    String[] names = {"Choose a country:", "Israel", "USA", "Brazil", "Russia", "Isle of man",
    "Spain", "Afghanistan"};

    int[] imgid = {R.drawable.israel, R.drawable.usa, R.drawable.brazil, R.drawable.russia,
    R.drawable.isleman, R.drawable.spain, R.drawable.afgan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter customadp = new CustomAdapter(getApplicationContext(),
                names, imgid);


    }
}
