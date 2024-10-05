package com.example.swipe_hatoms.bottomnav.rate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.databinding.FragmentRateBinding;

public class RateFragment extends Fragment {
    private FragmentRateBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentRateBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}
