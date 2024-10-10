package com.example.swipe_hatoms;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;

public class testActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // Пример данных для записи
        String userId = "user123";
        String productId = "Ae6c4RVBRLQWpvZLXMAE"; // ID товара
        String categoryId = "электроника"; // Категория продукта
        String reviewId = "Отзыв_1"; // Уникальный ID отзыва

        // Оценки по характеристикам
        Map<String, Object> characteristicRatings = new HashMap<>();
        characteristicRatings.put("Качество экрана", 5);
        characteristicRatings.put("Производительность", 4);
        characteristicRatings.put("Автономность", 3);

        // Информация об отзыве
        Map<String, Object> reviewData = new HashMap<>();
        reviewData.put("userId", userId);
        reviewData.put("rating", 4); // Общая оценка
        reviewData.put("date", "2024-10-11"); // Дата отзыва
        reviewData.put("characteristicRatings", characteristicRatings); // Оценки по характеристикам

        // Добавление отзыва в коллекцию "Отзывы" для товара
        db.collection("ProductCategories")
                .document(categoryId) // Категория
                .collection(productId) // ID товара
                .document(reviewId) // Отзыв
                .set(reviewData)
                .addOnSuccessListener(aVoid -> Log.d("Firestore", "Отзыв успешно добавлен!"))
                .addOnFailureListener(e -> Log.w("Firestore", "Ошибка добавления отзыва", e));
    }
}
