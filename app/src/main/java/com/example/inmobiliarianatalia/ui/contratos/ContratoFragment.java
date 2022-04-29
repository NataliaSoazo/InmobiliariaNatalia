package com.example.inmobiliarianatalia.ui.contratos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.inmobiliarianatalia.R;


public class ContratoFragment extends Fragment {
   private TextView tvContrato;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContratoViewModel homeViewModel =
                new ViewModelProvider(this).get(ContratoViewModel.class);

        View root = inflater.inflate(R.layout.fragment_contratos, container, false);
        tvContrato = root.findViewById(R.id.tvContrato);
        tvContrato.setText("Este es el fragment Contrato");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}