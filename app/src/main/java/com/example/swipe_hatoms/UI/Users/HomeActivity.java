package com.example.swipe_hatoms.UI.Users;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.R;
import com.example.swipe_hatoms.bottomnav.chats.ChatsFragment;
import com.example.swipe_hatoms.bottomnav.profile.ProfileFragment;
import com.example.swipe_hatoms.bottomnav.main.MainFragment;
import com.example.swipe_hatoms.bottomnav.like.LikeFragment;
import com.example.swipe_hatoms.databinding.ActivityHomeBinding;
import com.example.swipe_hatoms.product_card;

import java.util.HashMap;
import java.util.Map;

import io.paperdb.Paper;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Paper.init(this);
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        System.out.println("home" + intent.getStringExtra("phone"));

        String phone = intent.getStringExtra("phone");
        new Intent(HomeActivity.this, product_card.class);
        intent.putExtra("phone", phone);

        getSupportFragmentManager().beginTransaction().replace(binding.fragmentContainer.getId(), new MainFragment()).commit();

        binding.bottomNav.setSelectedItemId(R.id.main);
        Map<Integer, Fragment> fragmentMap = new HashMap<>();
        fragmentMap.put(R.id.profile, new ProfileFragment());
        fragmentMap.put(R.id.main, new MainFragment());
        fragmentMap.put(R.id.chats, new ChatsFragment());
        fragmentMap.put(R.id.like, new LikeFragment());
        binding.bottomNav.setOnItemSelectedListener(item -> {
            Fragment fragment = fragmentMap.get(item.getItemId());

            getSupportFragmentManager().beginTransaction().replace(binding.fragmentContainer.getId(),fragment).commit();
            return true;
        });
    }
}