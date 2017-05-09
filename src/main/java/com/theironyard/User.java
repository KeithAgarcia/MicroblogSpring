package com.theironyard;

import java.util.ArrayList;

/**
 * Created by Keith on 5/8/17.
 */
public class User {
    String name;
    ArrayList<Message> messages = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
}
