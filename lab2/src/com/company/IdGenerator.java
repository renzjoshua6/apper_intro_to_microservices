package com.company;

import java.util.UUID;

public class IdGenerator {

    public static String getNext() {
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        return uuidString;
    }
}
