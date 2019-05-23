/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationsqlserver;

import Data.PessoaData;
import Models.Pessoa;

/**
 *
 * @author thiago
 */
public class Gravar {
    private PessoaData dat;
    
        public boolean AddPessoa() throws Exception{
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Thiago");
        pessoa.setEmail("thiago.fernando@msn.com");
        
        dat = new PessoaData();
        boolean ret = dat.Incluir(pessoa);
        
        return ret;
    }
    
}
