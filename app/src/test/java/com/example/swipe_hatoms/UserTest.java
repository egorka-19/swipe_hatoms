package com.example.swipe_hatoms;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.swipe_hatoms.users.User;

// Введу набор примитивных тестов для покрытия моделей.
// Никаких моков вводить не будем просто ассерты на то, что "модельки работают правильно"

public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User("testuser", "image.jpg");

        assertNotNull(user);
        assertEquals("testuser", user.username);
        assertEquals("image.jpg", user.profileImage);
    }

    @Test
    public void testUserName() {
        User user = new User("testuser", "image.jpg");

        assertEquals("testuser", user.username);
    }

    @Test
    public void testUserProfileImage() {
        User user = new User("testuser", "image.jpg");

        assertEquals("image.jpg", user.profileImage);
    }
}