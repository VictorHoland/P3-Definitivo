package projeto;

import java.util.*;
/*
 * @author Victor
 */
public class Projeto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Conta> lc = new ArrayList();
        Conta c1;
        String aux;
        boolean j = true;
        int opcao = 0,numero;
        Menu m = new Menu();
        FuncaoAux valida = new FuncaoAux();
        
        do{
            System.out.println("--Menu--");
            
            System.out.println("(1) Criar conta");
            System.out.println("2) Logar");
            System.out.println("3) Recuperar senha");
            System.out.println("4) Excluir conta");
            System.out.println("0) Sair");
            
            System.out.print("Escolha a opção:");
            while(j){
                try{
                    opcao = Integer.parseInt(in.next());
                    in.nextLine();
                    break;
                }catch(NumberFormatException e){
                    System.out.println("Digite apenas numeros inteiros!");
                }
            }
            
            switch (opcao){
                case 1:
                    c1 = new Conta();
                    
                    System.out.println("Digite seu nome");
                    aux = in.nextLine();
                    c1.setNome(aux);
                    
                    System.out.println("Digite sua senha");
                    String pSenha = in.nextLine();
                    c1.setSenha(pSenha);
                    
                    System.out.println("Digite seu cpf");
                    
                    
                    while(j){  
                        String pCpf = in.nextLine();
                        if(pCpf.equals("00000000000")|| pCpf.equals("11111111111") || pCpf.equals("22222222222") ||
                           pCpf.equals("33333333333")|| pCpf.equals("44444444444") || pCpf.equals("55555555555") ||
                           pCpf.equals("66666666666")|| pCpf.equals("77777777777") || pCpf.equals("88888888888") ||
                           pCpf.equals("99999999999")|| pCpf.length() != 11){
                           System.out.println("Cpf invalido digite novamente");
                        }else{
                            c1.setCpf(pCpf);
                            break;
                        }
                    } 
                    
                                 
                    
                    c1.DadosConta();
                    lc.add(c1);
                    
                    break;
                case 2:
                    System.out.println("Digite seu nome");
                    String nome = in.nextLine();
                    int id;
                    boolean existe = false;
                    boolean existes;
                    
                    for(Conta pesquisa : lc){
                        
                        if(pesquisa.verificadorNome(nome)){
                            id = pesquisa.getId();
                            existe = true;
                        }
                        if(existe){
                            System.out.println("Digite sua senha");
                            String senha = in.nextLine();
                            if(pesquisa.verificadorSenha(senha)){
                                id = pesquisa.getId();
                                existes = true;
                                if(existes){    
                                    System.out.println("Voce esta logado");
                                    m.Menu(pesquisa);
                                }
                            }else{
                                System.out.println("Usuario não existe");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite seu cpf");
                    String cpf = in.nextLine();
                    
                        for(Conta cc: lc){
                            if(cpf.equals(cc.getCpf())){
                                System.out.println("Seu cpf é"+cc.getCpf());
                            }
                        }
                    
                    break;
                case 4:
                    
                    System.out.println("Deseja mesmo excluir sua conta?\n1- Sim\n2- Não");
                        int excluirE = 0;
                        
                        while(j){
                            try{
                                excluirE = in.nextInt();
                                if(excluirE >= 1 && excluirE < 3){
                                    break;
                                }else{
                                    System.out.println("Digite apenas os valores listados");
                                }
                            }catch (InputMismatchException e){
                                System.out.println("Digite apenas os valores listados");
                            }
                        }
                        if(excluirE == 1){
                            System.out.println("Digite seu cpf");
                            in.nextLine();
                            String cpf2 = in.nextLine();
                            

                            for (Conta contaa : lc) {
                                if(contaa.getCpf().equals(cpf2)){

                                    System.out.println("Digite sua senha");
                                    String senha2 = in.nextLine();                                      

                                    if(contaa.verificadorSenha(senha2)){
                                        contaa.setNome(null);
                                        contaa.setCpf("0");
                                        lc.remove(contaa);
                                        System.out.println("Conta excluída");
                                    }else{
                                        System.out.println("Senha incorreta\nOperação cancelada");
                                    }                                                                   
                                }
                                break;
                            }
                        }else{
                            System.out.println("Operação cancelada");
                        }
                    break;               
                default:
                    if(opcao == 0){
                        System.out.println("Deslogado");
                        
                    }
                    break;
            }
            
        }while(opcao!=0);
    }
}
