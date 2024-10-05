package com.example.swipe_hatoms.bottomnav.games;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.databinding.FragmentGamesBinding;

import io.paperdb.Paper;

public class GamesFragment extends Fragment {
    public FragmentGamesBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentGamesBinding.inflate(inflater, container, false);
        FragmentGamesBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}
