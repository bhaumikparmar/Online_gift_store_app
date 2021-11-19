package com.example.online_gift_store.ui.rate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RateViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Rate");

    }

    public LiveData<String> getText() {
        return mText;
    }
}
