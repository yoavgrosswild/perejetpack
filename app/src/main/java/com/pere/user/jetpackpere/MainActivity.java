package com.pere.user.jetpackpere;

import android.os.Bundle;
import android.view.View;

import com.pere.user.jetpackpere.livedata.MyViewModel;
import com.pere.user.jetpackpere.work.MyWorker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

public class MainActivity extends AppCompatActivity {


    private MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(MyViewModel.class);
    }

    public void clickMethod(View view) {
        OneTimeWorkRequest oneTimeWorkRequest =
                new OneTimeWorkRequest.Builder(MyWorker.class).build();
        WorkManager.getInstance().enqueue(oneTimeWorkRequest);
    }

    private void observeStatus(OneTimeWorkRequest oneTimeWorkRequest){
       // WorkManager.getInstance().getStatusById(oneTimeWorkRequest.getId()).;


    }
}
