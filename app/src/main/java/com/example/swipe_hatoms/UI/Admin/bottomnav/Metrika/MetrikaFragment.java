package com.example.swipe_hatoms.UI.Admin.bottomnav.Metrika;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.R;
import com.example.swipe_hatoms.UI.Admin.AdminCategoryActivity;
import com.example.swipe_hatoms.UI.Admin.HomeAdminActivity;
import com.example.swipe_hatoms.databinding.FragmentAddNewProductsBinding;
import com.example.swipe_hatoms.databinding.FragmentMetrikaBinding;

public class MetrikaFragment extends Fragment {
    public FragmentMetrikaBinding binding;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMetrikaBinding.inflate(inflater, container, false);
        FragmentMetrikaBinding.inflate(inflater, container, false);
        binding.car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "car");
                startActivity(intent);
            }
        });
        binding.moto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "moto");
                startActivity(intent);
            }
        });
        binding.boat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "boat");
                startActivity(intent);
            }
        });
        binding.service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "service");
                startActivity(intent);
            }
        });
        binding.dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "dress");
                startActivity(intent);
            }
        });
        binding.shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "shoes");
                startActivity(intent);
            }
        });
        binding.sweather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "clothes");
                startActivity(intent);
            }
        });
        binding.hats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "hat");
                startActivity(intent);
            }
        });
        binding.phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "phone");
                startActivity(intent);
            }
        });
        binding.pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "computer");
                startActivity(intent);
            }
        });
        binding.photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "photo");
                startActivity(intent);
            }
        });
        binding.fridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "fridge");
                startActivity(intent);
            }
        });
        binding.bicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "sport");
                startActivity(intent);
            }
        });
        binding.books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "book");
                startActivity(intent);
            }
        });
        binding.collecting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "collecting");
                startActivity(intent);
            }
        });
        binding.guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MetrikaFragment.this.getActivity(), HomeAdminActivity.class);
                intent.putExtra("category", "music");
                startActivity(intent);
            }
        });




        return binding.getRoot();
    }

}
