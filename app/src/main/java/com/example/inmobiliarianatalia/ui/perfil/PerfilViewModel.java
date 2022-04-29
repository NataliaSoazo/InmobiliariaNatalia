package com.example.inmobiliarianatalia.ui.perfil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.inmobiliarianatalia.modelo.Propietario;

import com.example.inmobiliarianatalia.request.ApiClient;

public class PerfilViewModel extends ViewModel {
private MutableLiveData<Boolean> estado;
private MutableLiveData<String> textButton;
private MutableLiveData<Propietario> usuario;
private    ApiClient apiClient;

   private PerfilViewModel(){
       apiClient = ApiClient.getApi();
   }

public LiveData<Boolean> getEstado(){
    if(estado==null){
        estado = new MutableLiveData<>();
    }
    return estado;
}
    public LiveData<String> getTextButton() {
        if (textButton == null) {
            textButton = new MutableLiveData<>();
        }
        return textButton;
    }
    public LiveData<Propietario> getUsuario(){
        if(usuario==null){
            usuario = new MutableLiveData<>();
        }
        return usuario;
    }


     public void accionBoton(String tButton, Propietario propietario){
      if (tButton.equals("Editar datos")){
          textButton.setValue("Guardar");
          estado.setValue(true);


      }else{
          textButton.setValue("Editar datos");
          estado.setValue(false);
          ApiClient apiClient = ApiClient.getApi();
          apiClient.actualizarPerfil(propietario);
      }
     }

     public void traerDatos(){

        usuario.setValue(apiClient.obtenerUsuarioActual());
     }
}