/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author Victor
 */
public class Piloto extends Funcionario{
    
    private String especialidade;
    //tipo de vôo
    private String idioma;
    private String idioma2;
    private String forma�ao;

    public Piloto(String pNome, int pIdade, int pSalario, String pCpf, String pFuncao) {
        super(pNome, pIdade, pSalario, pCpf, pFuncao);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma2() {
        return idioma2;
    }

    public void setIdioma2(String idioma2) {
        this.idioma2 = idioma2;
    }

    public String getForma�ao() {
        return forma�ao;
    }

    public void setForma�ao(String forma�ao) {
        this.forma�ao = forma�ao;
    }
    
    @Override
    public void bonus(){
        this.salario = this.salario + 500;
    }
    
    @Override
    public void puni�ao(){
        this.salario = this.salario - 500;
    }

    @Override
    public void setDisponibilidade(boolean disponivel) {
        this.disponibilidade = disponivel;
    }
}
