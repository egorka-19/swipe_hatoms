package com.example.swipe_hatoms.bottomnav.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.databinding.FragmentCategoryBinding;

public class CategoryFragment extends Fragment {
    public FragmentCategoryBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCategoryBinding.inflate(inflater, container, false);
        FragmentCategoryBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}
