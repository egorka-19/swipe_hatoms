package com.example.swipe_hatoms.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.swipe_hatoms.R;

public class response extends RecyclerView.Adapter<response.MyViewHolder> {

    private List<String> dataList;

    public response(List<String> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_for_response, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Установка текста для заголовков SeekBar
        holder.seekbar1Title.setText("");
        holder.seekbar2Title.setText("SeekBar 2");
        holder.seekbar3Title.setText("SeekBar 3");

        // Установка текста для Switch и Button
        holder.switchElement.setText("Рекомендую этот товар");

        // Дополнительная логика, если нужно настроить SeekBar'ы или Switch
        holder.seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Логика изменения значения SeekBar 1
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        holder.seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Логика изменения значения SeekBar 2
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        holder.seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Логика изменения значения SeekBar 3
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        holder.switchElement.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Логика изменения состояния Switch
        });

        holder.send.setOnClickListener(v -> {
            // Логика для нажатия на кнопку
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        RatingBar rating;
        TextView seekbar1Title, seekbar2Title, seekbar3Title;
        SeekBar seekBar1, seekBar2, seekBar3;
        Switch switchElement;
        ImageButton send, qr_code;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            seekbar1Title = itemView.findViewById(R.id.seekbar1_title);
            seekbar2Title = itemView.findViewById(R.id.seekbar2_title);
            seekbar3Title = itemView.findViewById(R.id.seekbar3_title);
            seekBar1 = itemView.findViewById(R.id.seekBar1);
            seekBar2 = itemView.findViewById(R.id.seekBar2);
            seekBar3 = itemView.findViewById(R.id.seekBar3);
            switchElement = itemView.findViewById(R.id.switch_element);
            send = itemView.findViewById(R.id.button);
            qr_code = itemView.findViewById(R.id.qr_code);
            rating = itemView.findViewById(R.id.ratingBar);
        }
    }
}
