package com.example.inmobiliarianatalia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.database.Observable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button login;
    private EditText etUsuario,etContraseña;
    private LoginViewModel lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        lv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(LoginViewModel.class);
        inicializarVista();
        lv.getMensaje().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(LoginActivity.this,s,Toast.LENGTH_LONG).show();
            }
        });

    }

    private void inicializarVista() {
        login=findViewById(R.id.bLogin);
        etUsuario=findViewById(R.id.etUsuario);
        etContraseña=findViewById(R.id.etContraseña);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lv.iniciarSesion(etUsuario.getText().toString(),etContraseña.getText().toString());
            }
        });
    }

}