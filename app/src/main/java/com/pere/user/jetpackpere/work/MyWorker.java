package com.pere.user.jetpackpere.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import timber.log.Timber;

/**
 * Created by Yoav G on 04/11/2018.
 */
public class MyWorker extends Worker {


    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Timber.e("worker works");
        

        return Result.SUCCESS;
    }
}
