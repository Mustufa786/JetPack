package com.codixlab.jetPack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;

import com.codixlab.jetPack.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bi;
    MainActivityViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this,R.layout.activity_main);

        model = ViewModelProviders.of(this).get(MainActivityViewModel.class);


        bi.textView.setText("Count " + model.getInitialCount());

        bi.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bi.textView.setText("Count " + model.getIncrementCount());
            }
        });
    }
}
