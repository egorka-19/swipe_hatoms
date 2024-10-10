package com.example.swipe_hatoms.UI.Admin.bottomnav.AddNewProducts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.databinding.FragmentAddNewProductsBinding;

public class AddNewProductsFragment extends Fragment {
    public FragmentAddNewProductsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentAddNewProductsBinding.inflate(inflater, container, false);
        FragmentAddNewProductsBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}
