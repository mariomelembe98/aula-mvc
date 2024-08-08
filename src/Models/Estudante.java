/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Estudante extends Pessoa{
    
    public Estudante(){
    
    }
    
    public Estudante(int id, String nome, String apelido, String sexo, Date dataNascimento){
        super( id, nome, apelido, sexo, dataNascimento);
    }
    
}
