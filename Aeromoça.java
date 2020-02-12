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
public class Aeromoça extends Funcionario {
 
    private String curso;
    private String idioma;
    private String idioma2;
    
    public Aeromoça(String pNome, int pIdade, int pSalario, String pCpf, String pFuncao) {
        super(pNome, pIdade, pSalario, pCpf, pFuncao);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
    
    
    
}
