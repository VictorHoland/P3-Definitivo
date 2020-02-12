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
public class Passagem {
    
    protected int preco = 0;
    protected String localizacao = "Vazio";
    protected String destino = "Vazio";
    private boolean checkin = false;

    public Passagem(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean getCheckin() {
        return checkin;
    }

    public void setCheckin(boolean chekin) {
        this.checkin = chekin;
    }    

    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
    
    public void classe(String classe){
        switch (classe) {
            case "Presidencial":
                this.preco += 1000;
                break;
            case "Luxo":
                this.preco += 700;
                break;
            case "Conforto":
                this.preco += 400;
                break;
            default:
                this.preco +=100;
                break;
        }
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public void estatos(){
        System.out.println("De:    "+this.getLocalizacao());
        System.out.println("Para:  "+this.getDestino());
        System.out.println("Preço: "+this.getPreco());
        
    }
}
