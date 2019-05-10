package proyectopoo;

public class Usuario extends Persona {
    private String tipoUsuario;
   private String contra;

    public Usuario(String tipo_usuario, String contra, String id_persona,
            String nombre, String apellido, String fecha_nacimiento, String telefono, String direccion) {
        super(id_persona, nombre, apellido, fecha_nacimiento, telefono, direccion);
        this.tipoUsuario = tipo_usuario;
        this.contra = contra;
    }

    public Usuario(String tipoUsuario, String contra) {
        this.tipoUsuario = tipoUsuario;
        this.contra = contra;
    }
   
    public Usuario(){}
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getContrasena() {
        return contra;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setContrasena(String contra) {
        this.contra = contra;
    }
}
