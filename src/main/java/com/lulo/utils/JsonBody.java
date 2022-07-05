package com.lulo.utils;

import java.util.List;

public class JsonBody {
    public static String crearBody(List<String> data) {
        String body;
        body = "{\n" +
                " \"id\": " + data.get(0) + ",\n" +
                " \"userName\": \"" + data.get(1) + "\",\n" +
                " \"firstName\": \"" + data.get(2) + "\",\n" +
                " \"lastName\": \"" + data.get(3) + "\",\n" +
                " \"email\": \"" + data.get(4) + "\",\n" +
                " \"password\": \"" + data.get(5) + "\",\n" +
                " \"phone\": \"" + data.get(6) + "\",\n" +
                " \"userStatus\": " + data.get(7) + "\n" +
                "}";
        return body;
    }
}
