package com.example.swipe_hatoms.UI.Admin.bottomnav.Profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.databinding.FragmentProfileAdminBinding;


public class AdminProfileFragment extends Fragment {
    public FragmentProfileAdminBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentProfileAdminBinding.inflate(inflater, container, false);
        FragmentProfileAdminBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}
