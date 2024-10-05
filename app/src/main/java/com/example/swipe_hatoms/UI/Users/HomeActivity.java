package com.example.swipe_hatoms.UI.Users;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.R;
import com.example.swipe_hatoms.bottomnav.games.GamesFragment;
import com.example.swipe_hatoms.bottomnav.profile.ProfileFragment;
import com.example.swipe_hatoms.bottomnav.quiz.QuizFragment;
import com.example.swipe_hatoms.bottomnav.rate.RateFragment;
import com.example.swipe_hatoms.databinding.ActivityHomeBinding;
import com.example.swipe_hatoms.databinding.ActivityHomeBinding;

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
        getSupportFragmentManager().beginTransaction().replace(binding.fragmentContainer.getId(), new QuizFragment()).commit();

        binding.bottomNav.setSelectedItemId(R.id.quiz);
        Map<Integer, Fragment> fragmentMap = new HashMap<>();
        fragmentMap.put(R.id.profile, new ProfileFragment());
        fragmentMap.put(R.id.games, new GamesFragment());
        fragmentMap.put(R.id.quiz, new QuizFragment());
        fragmentMap.put(R.id.rate, new RateFragment());
        binding.bottomNav.setOnItemSelectedListener(item -> {
            Fragment fragment = fragmentMap.get(item.getItemId());

            getSupportFragmentManager().beginTransaction().replace(binding.fragmentContainer.getId(),fragment).commit();
            return true;
        });
    }
}