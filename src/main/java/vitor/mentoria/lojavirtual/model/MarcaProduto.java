package vitor.mentoria.lojavirtual.model;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name= "marca_produto")
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto", allocationSize = 1, initialValue = 1) //organiza a geração das chaves primárias

public class MarcaProduto implements Serializable {

    private static final long serialVersionUID = 1L;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDesc() {
        return nomeDesc;
    }

    public void setNomeDesc(String nomeDesc) {
        this.nomeDesc = nomeDesc;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
    private long id;
    private String nomeDesc;
}
