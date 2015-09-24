/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploassociacao;

/**
 *
 * @author Avell B155 MAX
 */
public class Empregado {
    
    private String nome;
    private String cpf;

    public Empregado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
}
