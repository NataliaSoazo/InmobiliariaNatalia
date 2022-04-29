package com.example.inmobiliarianatalia.ui.inmuebles;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.inmobiliarianatalia.R;


public class InmueblesFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InmueblesViewModel slideshowViewModel =
                new ViewModelProvider(this).get(InmueblesViewModel.class);


        View root = inflater.inflate(R.layout.fragment_inmuebles, container, false);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}