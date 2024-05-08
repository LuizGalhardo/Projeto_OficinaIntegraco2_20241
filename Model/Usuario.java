package Model;


    public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String campus;
    private String tipoUsuario;
    
    

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getCampus() {
        return campus;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    

   
}

