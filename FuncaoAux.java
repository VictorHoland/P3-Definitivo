/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author Beatriz
 */
public class Faxineiro extends Funcionario{
    
    private String setor;
    
    public Faxineiro(String pNome, int pIdade, int pSalario, String pCpf, String pFuncao) {
        super(pNome, pIdade, pSalario, pCpf, pFuncao);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
