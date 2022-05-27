import java.io.Serializable;

/**
 * Usuario
 */
public class Usuario implements Serializable{

    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;

    private static final long serialVersionUID = 1L;

    public Usuario(){
        this.nombre = "";
        this.apellidos = "";
        this.telefono = "";
        this.email = "";
    }
    
    public Usuario(String nombre, String apellidos, String telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nombre + "\t" +
                apellidos + "\t" +
                telefono + "\t" +
                email + "\t";
    }
}