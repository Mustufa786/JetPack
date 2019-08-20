package com.codixlab.jetPack;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int count = 0;




    public int getInitialCount(){

        return count;
    }


    public int getIncrementCount(){

        count++;

        return count;
    }
}
