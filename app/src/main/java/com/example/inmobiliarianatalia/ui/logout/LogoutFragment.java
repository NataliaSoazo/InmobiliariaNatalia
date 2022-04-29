package com.example.inmobiliarianatalia.ui.logout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.inmobiliarianatalia.R;


public class LogoutFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LogoutViewModel homeViewModel =
                new ViewModelProvider(this).get(LogoutViewModel.class);

        View root = inflater.inflate(R.layout.fragment_logout, container, false);

        return root;
    }

    /* private void dialogoCierre(){
         AlertDialog.Builder builder = new AlertDialog.Builder(this);
         builder.setTitle("Salir");
         builder.setMessage("Desea salir de la aplicación?");
         builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                        // finish();
                     }
                 });
         builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
               //  Toast.makeText(this,  "No sale",Toast.LENGTH_LONG).show();
             }
         })
                 .show();

    }*/

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}