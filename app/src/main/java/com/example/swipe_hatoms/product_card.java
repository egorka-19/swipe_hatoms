package com.example.swipe_hatoms;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.example.swipe_hatoms.Model.PopularModel;
import com.example.swipe_hatoms.Model.ViewAllModel;

public class product_card extends AppCompatActivity {
    ImageView detailedImg;
    TextView price, description, name;

    ViewAllModel viewAllModel = null;
    PopularModel popularModel = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_card);

        final Object object = getIntent().getSerializableExtra("detail");
        if (object instanceof ViewAllModel){
            viewAllModel = (ViewAllModel) object;

        }
        if (object instanceof PopularModel){
            popularModel = (PopularModel) object;

        }

        detailedImg = findViewById(R.id.pro_card_img);
        price = findViewById(R.id.price);
        description = findViewById(R.id.description);
        name = findViewById(R.id.name);

        if (viewAllModel != null){
            Glide.with(getApplicationContext()).load(viewAllModel.getImg_url()).into(detailedImg);
            price.setText(viewAllModel.getPrice());
            description.setText(viewAllModel.getDescription());
            name.setText(viewAllModel.getName());
        }
        if (popularModel != null){
            Glide.with(getApplicationContext()).load(popularModel.getImg_url()).into(detailedImg);
            price.setText(popularModel.getPrice());
            description.setText(popularModel.getDescription());
            name.setText(popularModel.getName());
        }


    }
}