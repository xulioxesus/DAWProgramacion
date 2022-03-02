import java.util.ArrayList;
import java.util.Iterator;

public class Usuario implements ParserXML{
    private int id;
    private String email;
    private String password;

    public static ArrayList<Usuario> list = new ArrayList<>();
    private static int idGenerator = 0;

    
    public Usuario(String email, String password) {
        
        this.password = password;

        if (this.isEmailAvailable(email)){
            this.id = idGenerator++;
            this.email = email;
            list.add(this);
        }else{
            this.id = -1;
            this.email = "Correo duplicado: " + email;
        }
    }

    private boolean isEmailAvailable(String email){
        boolean resultado = true;

        for (Usuario usuario : list) {
            if(email.equals(usuario.getEmail())){
                resultado = false;
                break;
            }
        }

        return resultado;
    }

    public int getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean removeOneByName(String email){

        boolean resultado = false;

        for (Usuario person : list) {
            if (person.email.equals(email)){
                list.remove(person);
                resultado = true;
                break;
            }
        }

        return resultado;
    }

    public static void removeAllByDomain(String domain){

        Iterator<Usuario> it = list.iterator();

        while(it.hasNext()){
            Usuario user = it.next();

            if (user.email.endsWith(domain)){
                list.remove(user);
            }
        }

    }


    public String generateXML() {
        String xml = "<usuario>\n";
        xml += "<id>" + id + "</id>\n";
        xml += "<password>" + password + "</password>\n";
        xml += "<email>" + email + "</email>\n";
        xml += "</usuario>\n";
        return xml;
    }
}