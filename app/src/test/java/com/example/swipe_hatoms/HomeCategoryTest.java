package com.example.swipe_hatoms;

import org.junit.Test;
import static org.junit.Assert.*;

import com.example.swipe_hatoms.Model.HomeCategory;

public class HomeCategoryTest {

    @Test
    public void testConstructor() {
        HomeCategory category = new HomeCategory("Living Room", "Furniture");
        assertEquals("Living Room", category.getName());
        assertEquals("Furniture", category.getType());
    }

    @Test
    public void testSetName() {
        HomeCategory category = new HomeCategory();
        category.setName("Bedroom");
        assertEquals("Bedroom", category.getName());
    }

    @Test
    public void testSetType() {
        HomeCategory category = new HomeCategory();
        category.setType("Decor");
        assertEquals("Decor", category.getType());
    }
}
