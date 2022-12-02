package main.java.model;

import java.util.ArrayList;

public class ClassTest {
    Model model = new Model();
    public void test1(){
        ArrayList<Property> property = new ArrayList<>();
        property.addAll(model.getAllProperties());
        Property p = new Property("3349B","10000","San Juan 25", 2255, 12000 );

    }

}
