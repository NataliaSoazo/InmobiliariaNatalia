package com.example.inmobiliarianatalia.ui.inquilinos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.inmobiliarianatalia.R;
import com.example.inmobiliarianatalia.ui.inmuebles.InmueblesViewModel;


public class InquilinosFragment extends Fragment {
    private TextView tvInquilinos;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InmueblesViewModel slideshowViewModel =
                new ViewModelProvider(this).get(InmueblesViewModel.class);


        View root = inflater.inflate(R.layout.fragment_inquilinos, container, false);
        tvInquilinos= root.findViewById(R.id.tvInquilinos);
        tvInquilinos.setText("Este es el fragment Inmuebles");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}