package com.example.swipe_hatoms.UI.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.swipe_hatoms.R;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView car, moto, boat, service;
    private ImageView dress, shoes, clothes, hat;
    private ImageView phone, computer, photo, fridge;
    private ImageView sport, book, collecting, music;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        itin();
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "car");
                startActivity(intent);
            }
        });
        moto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "moto");
                startActivity(intent);
            }
        });
        boat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "boat");
                startActivity(intent);
            }
        });
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "service");
                startActivity(intent);
            }
        });
        dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "dress");
                startActivity(intent);
            }
        });
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "shoes");
                startActivity(intent);
            }
        });
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "clothes");
                startActivity(intent);
            }
        });
        hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "hat");
                startActivity(intent);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "phone");
                startActivity(intent);
            }
        });
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "computer");
                startActivity(intent);
            }
        });
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "photo");
                startActivity(intent);
            }
        });
        fridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "fridge");
                startActivity(intent);
            }
        });
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "sport");
                startActivity(intent);
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "book");
                startActivity(intent);
            }
        });
        collecting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "collecting");
                startActivity(intent);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeAdminActivity.class);
                intent.putExtra("category", "music");
                startActivity(intent);
            }
        });
    }

    private void itin() {
        car = (ImageView)findViewById(R.id.car);
        moto = (ImageView)findViewById(R.id.moto);
        boat = (ImageView)findViewById(R.id.boat);
        service = (ImageView)findViewById(R.id.service);

        dress = (ImageView)findViewById(R.id.dress);
        shoes = (ImageView)findViewById(R.id.shoes);
        clothes = (ImageView)findViewById(R.id.sweather);
        hat = (ImageView)findViewById(R.id.hats);

        phone = (ImageView)findViewById(R.id.phone);
        computer = (ImageView)findViewById(R.id.pc);
        photo = (ImageView)findViewById(R.id.photo);
        fridge = (ImageView)findViewById(R.id.fridge);

        sport = (ImageView)findViewById(R.id.bicycle);
        book = (ImageView)findViewById(R.id.books);
        collecting = (ImageView)findViewById(R.id.collecting);
        music = (ImageView)findViewById(R.id.guitar);
    }
}