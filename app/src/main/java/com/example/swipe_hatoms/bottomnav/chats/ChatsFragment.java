package com.example.swipe_hatoms.bottomnav.chats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.swipe_hatoms.databinding.FragmentChatsBinding;

import io.paperdb.Paper;

public class ChatsFragment extends Fragment {
    public FragmentChatsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentChatsBinding.inflate(inflater, container, false);
        FragmentChatsBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}
