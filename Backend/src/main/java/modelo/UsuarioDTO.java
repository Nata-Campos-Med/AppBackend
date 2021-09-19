
package modelo;

public class UsuarioDTO {
    private String nombre, cedula, email, password, user; 

    public UsuarioDTO(String nombre, String cedula, String email, String user, String password) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.password = password;
        this.user = user;
    }

    public UsuarioDTO() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre de usuario: ").append(nombre);
        sb.append(", cedula: ").append(cedula);
        sb.append(", email: ").append(email);
        sb.append(", password: ").append(password);
        sb.append(", user: ").append(user);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
