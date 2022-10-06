package classes;

public class Comensal {

    private int id_comensal;
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean menuEspecial;
    private String invitado;

    //Getters
    public int getId_comensal() {
        return id_comensal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isMenuEspecial() {
        return menuEspecial;
    }

    public String getInvitado() {
        return invitado;
    }

    //Setters
    public void setId_comensal(int id_comensal) {
        this.id_comensal = id_comensal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMenuEspecial(boolean menuEspecial) {
        this.menuEspecial = menuEspecial;
    }

    public void setInvitado(String invitado) {
        this.invitado = invitado;
    }

    //Constructor vacio
    public Comensal() {
    }


}

