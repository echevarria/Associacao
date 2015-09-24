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
public class Empresa {
    
    private String razaoSocial;
    private Empregado empregados[];
    private int total_empregados;

    public Empresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        this.empregados= new Empregado[100];
        this.total_empregados = 0;
    }
    
    public void adicionaEmpregado(Empregado empregado) {
        this.empregados[this.total_empregados] = empregado;
        this.total_empregados++;
    }
    
    public int totalEmpregados(){
        return this.total_empregados;
    }
    
}
