package com.example.swipe_hatoms.bottomnav.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.swipe_hatoms.UI.LoginActivity;
import com.example.swipe_hatoms.UI.Users.MainActivity;
import com.example.swipe_hatoms.databinding.FragmentQuizBinding;

import io.paperdb.Paper;

public class QuizFragment extends Fragment {
    private FragmentQuizBinding binding;
    private ImageButton nextButton;

    private CheckBox low12, bow12;
    private int age;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentQuizBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paper.book().destroy();
                Intent loginIntent = new Intent(QuizFragment.this.getContext(), LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        return view;
    }
}
