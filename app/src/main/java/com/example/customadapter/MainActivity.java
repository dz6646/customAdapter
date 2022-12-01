package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] names = {"Choose a country:", "Israel", "USA", "Brazil", "Russia", "Isle of man",
    "Spain", "Afghanistan"};

    int[] imgid = {0, R.drawable.israel, R.drawable.usa, R.drawable.brazil, R.drawable.russia,
    R.drawable.isleman, R.drawable.spain, R.drawable.afgan};

    String[] capitals = {"", "Jerusalem", "Washington", "Brazilia", "Moscow", "Daglas", "Madrid", "Kabul"};

    String[] information = {"", "9.364M", "331.9M", "214M", "143.4M", "85.410K", "47.33M", "39.84M"};

    Spinner spin;
    TextView population;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = findViewById(R.id.spinner);
        population = findViewById(R.id.people);

        CustomAdapter customadp = new CustomAdapter(getApplicationContext(),
                names, imgid, capitals);
        spin.setAdapter(customadp);
        spin.setOnItemSelectedListener(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        population.setText("Country: " + names[i] + "\n\nPopulation: " + information[i] + "\n\nCapital City: " + capitals[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
