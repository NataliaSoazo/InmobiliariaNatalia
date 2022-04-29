package com.example.inmobiliarianatalia.ui.inmuebles;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.inmobiliarianatalia.R;

public class FragmentUnInmueble extends Fragment {

    private FragmentUnInmuebleViewModel mViewModel;

    public static FragmentUnInmueble newInstance() {
        return new FragmentUnInmueble();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_un_inmueble_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FragmentUnInmuebleViewModel.class);
        // TODO: Use the ViewModel
    }

}