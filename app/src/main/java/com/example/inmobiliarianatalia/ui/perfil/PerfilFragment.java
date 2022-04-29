package com.example.inmobiliarianatalia.ui.perfil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.inmobiliarianatalia.R;
import com.example.inmobiliarianatalia.modelo.Propietario;


public class PerfilFragment extends Fragment {
     private EditText etNombre, etApellido, etTelefono, etEmail, etDni, etClave;
     Button btEditar;
     private PerfilViewModel perfilvMoldel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PerfilViewModel perfilvModel =
                new ViewModelProvider(this).get(PerfilViewModel.class);

        View root = inflater.inflate(R.layout.fragment_perfil, container, false);
            inicializarVista(root);
            perfilvMoldel.traerDatos();
            perfilvMoldel.getUsuario().observe(getViewLifecycleOwner(), new Observer<Propietario>() {
                @Override
                public void onChanged(Propietario propietario) {
                    etNombre.setText(propietario.getNombre().toString());
                    etApellido.setText(propietario.getApellido().toString());
                    etTelefono.setText((propietario.getTelefono().toString()));
                    etDni.setText(propietario.getDni().toString());
                    etEmail.setText(propietario.getEmail().toString());
                    etClave.setText(propietario.getContraseña().toString());
                }
            });

             perfilvModel.getEstado().observe(getViewLifecycleOwner(), new Observer<Boolean>() {
                 @Override
                 public void onChanged(Boolean aBoolean) {
                     etNombre.setEnabled(aBoolean);
                     etApellido.setEnabled(aBoolean);
                     etTelefono.setEnabled(aBoolean);
                     etDni.setEnabled(aBoolean);
                     etEmail.setEnabled(aBoolean);
                     etClave.setEnabled(aBoolean);
                 }
             });

             perfilvModel.getTextButton().observe(getViewLifecycleOwner(), new Observer<String>() {
                 @Override
                 public void onChanged(String s) {
                     btEditar.setText(s);
                 }
             });
        perfilvMoldel.traerDatos();


            return  root;
    }

    private void inicializarVista(View root) {
        etNombre= root.findViewById(R.id.etNombre);
        etApellido= root.findViewById(R.id.etApellido);
        etTelefono =root.findViewById(R.id.etDomicilio);
        etEmail = root.findViewById(R.id.etEmail);
        etDni= root.findViewById(R.id.etDni);
        etClave = root.findViewById(R.id.etClave);
        btEditar =root.findViewById(R.id.btEditar);

        btEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Propietario propietario = new Propietario();
                propietario.setNombre(etNombre.getText().toString());
                propietario.setApellido(etApellido.getText().toString());
                propietario.setTelefono(etTelefono.getText().toString());
                propietario.setDni(Long.parseLong(etDni.getText().toString()));
                propietario.setEmail(etEmail.getText().toString());
                propietario.setContraseña(etClave.getText().toString());

                String texto = btEditar.getText().toString();
                perfilvMoldel.accionBoton(texto,propietario);


            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}