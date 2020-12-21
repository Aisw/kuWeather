package com.coolweather.android.util;

import org.junit.Test;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static org.junit.Assert.*;

public class HttpUtilTest {

    @Test
    public void sendOKHttpRequest() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("http://guolin.tech/api/china").build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body());
    }
}