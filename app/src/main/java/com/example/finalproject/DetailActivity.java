package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_title";
    public static final String EXTRA_IMAGES = "extra_images";
    public static final String EXTRA_CATEGORY = "extra_category";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    public static final String EXTRA_URL = "extra_url";
    int Click = 0;
    ImageView dimages, back,lovebtn;
    TextView dtitle;
    TextView dcategory;
    TextView ddeskripsi;
    Button downloadbtn;
    String category, title, deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        back = findViewById(R.id.backbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        lovebtn = findViewById(R.id.buttonlove);
        lovebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailActivity.this, "Sorry , Still Under Construction :) ", Toast.LENGTH_SHORT).show();
            }
        });
        dimages = findViewById(R.id.images);
        dtitle = findViewById(R.id.title);
        dcategory = findViewById(R.id.category);
        ddeskripsi = findViewById(R.id.deskripsi);
        downloadbtn = findViewById(R.id.button);
        downloadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String booklink = getIntent().getStringExtra(EXTRA_URL);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(booklink));
                startActivity(intent);
            }
        });
        String title = getIntent().getStringExtra(EXTRA_NAME);
        String category = getIntent().getStringExtra(EXTRA_CATEGORY);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);


        int Url = getIntent().getIntExtra(EXTRA_IMAGES, 0);

        Glide.with(dimages.getContext())
                .load(Url)
                .into(dimages);
        ddeskripsi.setText(deskripsi);
        dcategory.setText(category);
        dtitle.setText(title);
    }
}