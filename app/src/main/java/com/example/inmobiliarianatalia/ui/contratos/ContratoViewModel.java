package com.example.inmobiliarianatalia.ui.contratos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContratoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ContratoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is contrato fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}