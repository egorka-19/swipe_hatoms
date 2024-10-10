package com.example.swipe_hatoms.UI.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.R;
import com.example.swipe_hatoms.UI.Admin.bottomnav.AddNewProducts.AddNewProductsFragment;
import com.example.swipe_hatoms.UI.Admin.bottomnav.Metrika.MetrikaFragment;
import com.example.swipe_hatoms.UI.Admin.bottomnav.Profile.AdminProfileFragment;

import com.example.swipe_hatoms.databinding.ActivityAdminCategoryBinding;


import java.util.HashMap;
import java.util.Map;

import io.paperdb.Paper;

public class AdminCategoryActivity extends AppCompatActivity {
    private ActivityAdminCategoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);
        Paper.init(this);
        binding = ActivityAdminCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().replace(binding.fragmentContainer.getId(), new AddNewProductsFragment()).commit();

        binding.bottomNav.setSelectedItemId(R.id.main);
        Map<Integer, Fragment> fragmentMap = new HashMap<>();
        fragmentMap.put(R.id.profile, new AdminProfileFragment());
        fragmentMap.put(R.id.category, new MetrikaFragment());
        fragmentMap.put(R.id.main, new AddNewProductsFragment());
        binding.bottomNav.setOnItemSelectedListener(item -> {
            Fragment fragment = fragmentMap.get(item.getItemId());

            getSupportFragmentManager().beginTransaction().replace(binding.fragmentContainer.getId(),fragment).commit();
            return true;
        });

    }
}