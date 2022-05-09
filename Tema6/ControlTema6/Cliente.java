public class Cliente extends Persona{

    private String id;
    private String email;

    public Cliente(String nif, String nombre, String apellidos, String id, String email) {
        super(nif, nombre, apellidos);
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nif:\t" + nif +
                "nombre:\t" + nombre +
                "apellidos:\t" + apellidos +
                "id:\t" + id +
                "email:\t" + email;
    }
   
    
}