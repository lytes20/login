package com.lytestech.login;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by gideon bamuleseyo on 5/11/2017.
 */

public class BackgroundTask extends AsyncTask<String, Void, Void> {
    Context ctx;
    BackgroundTask(Context ctx){
        this.ctx = ctx;
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(String... params) {
        String reg_url = "";
        String login_url = "";
        String method = "";
        //if(){}

        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
