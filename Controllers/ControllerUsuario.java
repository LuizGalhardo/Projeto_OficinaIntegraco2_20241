package Controllers;


import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class ControllerUsuario {
    
    private Usuario usu = new Usuario();
    private List<Usuario> listUsuario = new ArrayList<Usuario>();
    
    
    
    public List<Usuario> getListUsuario(){
            return listUsuario;
        }
    
    public Usuario InsUsuario(Usuario usuario) {

        if (consUsuario(usuario) == null) {
            listUsuario.add(usuario);
            return usuario;
        } else {
            return null;
        }

    }
    
    
    public Usuario consUsuario(Usuario usuario){
		for(int i = 0; i < listUsuario.size(); i++){
			if(Objects.equals(usuario.getId(), listUsuario.get(i).getId())){
				return listUsuario.get(i);
			}
		}
		return null;
	}
    
    
    
    
    
}
