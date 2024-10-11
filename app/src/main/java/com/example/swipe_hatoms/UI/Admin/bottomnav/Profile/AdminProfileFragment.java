package com.example.swipe_hatoms.UI.Admin.bottomnav.Profile;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.swipe_hatoms.R;
import com.example.swipe_hatoms.UI.Users.settings;
import com.example.swipe_hatoms.databinding.FragmentProfileAdminBinding;
import com.example.swipe_hatoms.UI.Users.favourite;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;


public class AdminProfileFragment extends Fragment {
    public FragmentProfileAdminBinding binding;
    private Uri filePath;
    public String phone;

    //private List<publish> PublishList = new ArrayList<>();

    RecyclerView recyclepublish;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentProfileAdminBinding.inflate(inflater, container, false);

        phone = requireActivity().getIntent().getStringExtra("phone");

        loadUserInfo();


        binding.buttonLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminProfileFragment.this.getActivity(), favourite.class));
            }
        });

        binding.setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminProfileFragment.this.getActivity(), settings.class));
            }
        });

        return binding.getRoot();
    }


    private void loadUserInfo() {
        FirebaseDatabase.getInstance().getReference().child("Admins").child(phone)
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String username = snapshot.child("name").getValue().toString();
                            binding.usernameTv.setText(username);

                            } else {
                                Toast.makeText(getContext(), "Загрузите свое фото!", Toast.LENGTH_SHORT).show();
                            }
                        }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        // Обработка ошибок базы данных
                    }
                });
    }



//    private void setPublishRecycler() {
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
//        recyclepublish = binding.recyclepublish;
//        recyclepublish.setLayoutManager(layoutManager);
//
//        PublishAdapter publishAdapter = new PublishAdapter(getContext(), PublishList);
//        recyclepublish.setAdapter(publishAdapter);
//    }


}

