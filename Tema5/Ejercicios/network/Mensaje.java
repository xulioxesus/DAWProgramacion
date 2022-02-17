public class Mensaje {
    
    private String usuario;
    private String texto;
    private String marcaTemporal;
    private int likes;
    private ArrayList<String> comentarios;

    public Mensaje(String usuario, String texto, String marcaTemporal) {
        this.usuario = usuario;
        this.texto = texto;
        this.marcaTemporal = marcaTemporal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getMarcaTemporal() {
        return marcaTemporal;
    }

    public void setMarcaTemporal(String marcaTemporal) {
        this.marcaTemporal = marcaTemporal;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }
}
