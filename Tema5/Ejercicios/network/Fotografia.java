public class Fotografia {
    private String usuario;
    private String archivo;
    private String titulo;
    private String marcaTemporal;
    private int likes;
    private ArrayList<String> comentarios;

    public Fotografia(String usuario, String archivo, String titulo, String marcaTemporal) {
        this.usuario = usuario;
        this.archivo = archivo;
        this.titulo = titulo;
        this.marcaTemporal = marcaTemporal;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getArchivo() {
        return archivo;
    }
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
