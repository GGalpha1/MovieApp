package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MovieListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        Button movieDetailButton = findViewById(R.id.btnMovieDetail);

        movieDetailButton.setOnClickListener(v -> {
            Intent intent = new Intent(MovieListActivity.this, MovieDetailActivity.class);
            startActivity(intent);
        });
    }
}
