package br.com.sistemajuridico.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Sidnei
 */
@Entity
@Table
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String email;
    private String documentoReceitaFedral;
    private String rg;
    private String estadoCivil;
    private String NomePai;
    private String nomeMae;
    private String profissao;
    private TipoPessoa tipo;
    
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String bairro;
    private String uf;
    private String cep;
    
    

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotBlank
    @Size(max = 100)
    @Column(nullable = false, length = 100)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @CPF
    @NotBlank
    @Column(name = "doc_receita_federal", nullable = false, length = 14)
    public String getDocumentoReceitaFedral() {
        return documentoReceitaFedral;
    }

    public void setDocumentoReceitaFedral(String documentoReceitaFedral) {
        this.documentoReceitaFedral = documentoReceitaFedral;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    

    @Column(name = "estado_civil", nullable = false)
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Column(name = "nome_pai", nullable = false, length = 100)
    public String getNomePai() {
        return NomePai;
    }

    public void setNomePai(String NomePai) {
        this.NomePai = NomePai;
    }

    @Column(name = "nome_mae", nullable = false, length = 100)
    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Column(name = "profissao", nullable = false, length = 100)
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
            
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    @NotBlank @Size(max = 150)
    @Column(nullable = false, length = 150)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @NotBlank @Size(max = 20)
    @Column(nullable = false, length = 20)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @NotBlank @Size(max = 60)
    @Column(nullable = false, length = 60)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    

    @NotBlank @Size(max = 60)
    @Column(nullable = false, length = 60)
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @NotBlank @Size(max = 60)
    @Column(nullable = false, length = 60)
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @NotBlank @Size(max = 60)
    @Column(nullable = false, length = 9)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
