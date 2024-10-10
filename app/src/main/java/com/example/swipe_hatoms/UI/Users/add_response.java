package com.example.swipe_hatoms.UI.Users;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.swipe_hatoms.R;
import com.example.swipe_hatoms.adapters.response;

import java.util.ArrayList;
import java.util.List;

public class add_response extends AppCompatActivity {
    SeekBar ratingSeekBar;
    TextView ratingValue;

    response responseAdapter;
    RecyclerView recycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_response);

        recycle = findViewById(R.id.recycle);

        recycle.setLayoutManager(new LinearLayoutManager(this));
        List<String> responses = new ArrayList<>();
        // Пример данных для списка
        responses.add("Ответ 1");
        responseAdapter = new response(responses);
        recycle.setAdapter(responseAdapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}