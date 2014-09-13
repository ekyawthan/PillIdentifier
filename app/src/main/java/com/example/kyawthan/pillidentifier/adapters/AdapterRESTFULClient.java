package com.example.kyawthan.pillidentifier.adapters;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.entity.StringEntity;



/**
 * Created by kyawthan on 9/12/14.
 */
public class AdapterRESTFULClient {

    private static final int DEFAUTL_TIMEOUT = 20*1000;

    private static final String BASE_URL = "";
    private static AsyncHttpClient client= new AsyncHttpClient();

    public static void get(String url, AsyncHttpResponseHandler asyncHttpResponseHandler){
        client.get(null, url, asyncHttpResponseHandler);
    }

    public static void post(String url, StringEntity stringEntity, AsyncHttpResponseHandler asyncHttpResponseHandler){
        client.post(null, getAbsoluteUrl(url), stringEntity, "application/json", asyncHttpResponseHandler);
    }

    private static String getAbsoluteUrl(String url) {
        return BASE_URL + url;
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler asyncHttpResponseHandler){
        client.post(null, getAbsoluteUrl(url), params, asyncHttpResponseHandler);
    }
}
