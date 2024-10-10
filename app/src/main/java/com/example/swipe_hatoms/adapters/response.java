package com.example.swipe_hatoms.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.swipe_hatoms.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class response extends RecyclerView.Adapter<response.MyViewHolder> {

    private List<String> dataList;
    private Map<String, List<String>> productCategories;
    public String category;
    private Random random = new Random();

    public response(List<String> dataList, Map<String, List<String>> productCategories) {
        this.dataList = dataList;
        this.productCategories = productCategories;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_for_response, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        category = "бытовая техника"; // Предположим, категория "электроника" для демонстрации

        // Получение 3 случайных характеристик из productCategories по категории
        List<String> characteristics = productCategories.get(category);
        // Перемешиваем список
        Collections.shuffle(characteristics);
        List<String> result = new ArrayList<>();
        // Добавляем элементы в результат, пока не будет собрано нужное количество
        int index = 0;
        while (result.size() <= 3) {
            // Если мы прошли весь список, начинаем снова
            if (index >= characteristics.size()) {
                index = 0;
            }
            result.add(characteristics.get(index));
            index++;
        }

        String characteristic1 = result.get(0);
        String characteristic2 = result.get(1);
        String characteristic3 = result.get(2);

        // Установка заголовков для SeekBar
        holder.seekbar1Title.setText(characteristic1);
        holder.seekbar2Title.setText(characteristic2);
        holder.seekbar3Title.setText(characteristic3);

        // Логика для обработки нажатия на кнопку отправки
        holder.sendBtn.setOnClickListener(v -> {
            // Получение значений прогресса из SeekBar'ов
            int rating1 = holder.seekBar1.getProgress();
            int rating2 = holder.seekBar2.getProgress();
            int rating3 = holder.seekBar3.getProgress();

            // Создание словаря с характеристиками и их оценками
            Map<String, Integer> ratings = new HashMap<>();
            ratings.put(characteristic1, rating1);
            ratings.put(characteristic2, rating2);
            ratings.put(characteristic3, rating3);

            // Пример вывода или отправки данных в базу
            Toast.makeText(holder.itemView.getContext(), "Данные отправлены: " + ratings.toString(), Toast.LENGTH_SHORT).show();

            // Можно добавить логику для отправки этих данных в базу данных
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    // Функция для получения случайной характеристики
    private String getRandomCharacteristic(List<String> characteristics) {
        return characteristics.get(random.nextInt(characteristics.size()));
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView seekbar1Title, seekbar2Title, seekbar3Title;
        SeekBar seekBar1, seekBar2, seekBar3;
        Switch switchElement;
        ImageButton sendBtn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            seekbar1Title = itemView.findViewById(R.id.seekbar1_title);
            seekbar2Title = itemView.findViewById(R.id.seekbar2_title);
            seekbar3Title = itemView.findViewById(R.id.seekbar3_title);
            seekBar1 = itemView.findViewById(R.id.seekBar1);
            seekBar2 = itemView.findViewById(R.id.seekBar2);
            seekBar3 = itemView.findViewById(R.id.seekBar3);
            switchElement = itemView.findViewById(R.id.switch_element);
            sendBtn = itemView.findViewById(R.id.send_btn);
        }
    }
}
