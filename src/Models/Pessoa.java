
package Models;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Pessoa {
    
    private int id;
    private String nome;
    private String apelido;
    private String sexo;
    private Date dataNascimento;
    
    public Pessoa() {
        
    }

    public Pessoa(int id, String nome, String apelido, String sexo, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
    
   
}
