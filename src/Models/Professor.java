
package Models;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Professor extends Pessoa{
    
    public Professor(){
    
    }
    
    Professor(int id, String nome, String apelido, String sexo, Date dataNascimento){
        super( id, nome, apelido, sexo, dataNascimento);
    }
    
    
    
}
