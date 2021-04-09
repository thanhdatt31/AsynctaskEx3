package com.vnw.asynctaskex;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class MyAsyncTaskLoader extends AsyncTaskLoader<String> {

    public MyAsyncTaskLoader(@NonNull Context context) {
        super(context);
    }

    @Nullable
    @Override
    public String loadInBackground() {
        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(50);
//                Log.d("datnt", "loadInBackground: " + i);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            Log.d("datnt", "loadInBackground: " + i);

        }
        return "Vjppro2021";
    }

    @Override
    protected void onStartLoading() {
       forceLoad();
    }
}
