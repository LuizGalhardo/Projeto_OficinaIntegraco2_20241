package Model;

import java.util.Date;


public class Item {
    
    
    private Integer id;
    private String desc;
    private String local;
    private boolean situacao;
    private String descricao;
    private String dataCriacao;
    private Usuario criadoPor;
    private Usuario alteradoPor;
    
  

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setCriadoPor(Usuario criadoPor) {
        this.criadoPor = criadoPor;
    }

    public Usuario getCriadoPor() {
        return criadoPor;
    }

    public void setAlteradoPor(Usuario alteradoPor) {
        this.alteradoPor = alteradoPor;
    }

    public Usuario getAlteradoPor() {
        return alteradoPor;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    
}
