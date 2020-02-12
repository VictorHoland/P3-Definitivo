package projeto;

import java.util.*;
/*
 * @author Victor
 */


public class Menu{
    
    Scanner in = new Scanner(System.in);
    AdmMenu adm = new AdmMenu();
    boolean j;
    Passagem pass = new Passagem("Vazio");
    
    public void Menu(Conta c1){
        int opcaoMenu = 0;
        
        
        
        do{
            System.out.println("\t\t## Vai Filhao AirLines :: ##");
            System.out.println("\n                  ==============================");
            System.out.println("                  |     1 - Agendar vôo    |");
            System.out.println("                  |     2 - Cancelar vôo    |");
            System.out.println("                  |     3 - Check in       |");
            System.out.println("                  |     4 - Estatos atuais       |");
            System.out.println("                  |     5 - Alterar senha da conta|");
            System.out.println("                  |     0 - Sair                  |");
            System.out.println("                  ==============================\n");
            System.out.print("Digite sua Opcao -> ");   
            
            try {
                opcaoMenu = in.nextInt();
            } catch (java.util.InputMismatchException e) {
                in.nextLine();
                continue;
            }
            
                switch(opcaoMenu){
                    case 0:
                        System.out.println("Deslogado...");
                        break;
                    case 1: 
                        
                        if(adm.verificarDisponibilidade()){
                        
                            System.out.println("Deseja agendar um vôo?\n1- Sim\n2- Não");
                            int agendar = 0;
                            while(j){
                                try{
                                    agendar = in.nextInt();
                                    break;
                                }catch(NumberFormatException e){
                                    System.out.println("Digite apenas os valores listados");
                                }
                            }
                            if(agendar == 1){
                                System.out.println("Qual sua localizaçãoo atual\n");
                                System.out.println("1- Brasil, AL- MCZ");
                                System.out.println("2- Brasil, SP- São Bernado do Campo");
                                System.out.println("3- EUA, CA- São Francisco");
                                System.out.println("4- Inglaterra, LPL- Garston");
                                System.out.println("5- Polônia, KRK- Pequena Polônia");
                                System.out.println("6- Cancelar operação");

                                int localizacao = in.nextInt();
                                String local = null;

                                switch (localizacao) {
                                    case 1:
                                        local = "Brasil, AL- MCZ";
                                        break;
                                    case 2:
                                        local = "Brasil, SP- São Bernado do Campo";
                                        break;
                                    case 3:
                                        local = "EUA, CA- São Francisco";
                                        break;
                                    case 4:
                                        local = "Inglaterra, LPL- Garston";
                                        break;
                                    case 5:
                                        local = "Polônia, KRK- Pequena Polônia";
                                        break;
                                    default:
                                        break;
                                }

                                String localiza = local;

                                 pass.setLocalizacao(local);

                                System.out.println("Escola o destino\n");
                                System.out.println("Qual sua localização atual\n");
                                System.out.println("1- Brasil, AL- MCZ");
                                System.out.println("2- Brasil, SP- São Bernado do Campo");
                                System.out.println("3- EUA, CA- São Francisco");
                                System.out.println("4- Inglaterra, LPL- Garston");
                                System.out.println("5- Polônia, KRK- Pequena Polônia");
                                System.out.println("6- Cancelar operação");                         

                                int destino = 0;
                                while(j){                             
                                    try{
                                        destino = in.nextInt();
                                        break;
                                    }catch(NumberFormatException e){
                                        System.out.println("Digite apenas os valores listados");
                                    }
                                }
                                String destinar = null;
                                switch (destino) {
                                    case 1:
                                        destinar = "Brasil, AL- MCZ";
                                        pass.setDestino(destinar);
                                        break;
                                    case 2:
                                        destinar = "Brasil, SP- São Bernado do Campo";
                                        pass.setDestino(destinar);
                                        break;
                                    case 3:
                                        destinar = "EUA, CA- São Francisco";
                                        pass.setDestino(destinar);
                                        break;
                                    case 4:
                                        destinar = "Inglaterra, LPL- Garston";
                                        pass.setDestino(destinar);
                                        break;
                                    case 5:
                                        destinar = "Polônia, KRK- Pequena Polônia";
                                        pass.setDestino(destinar);
                                        break;
                                    default:
                                        break;
                                }                        
                                    String destina = destinar;

                                    if(localiza.equals("Brasil, AL- MCZ") && destina.equals("Brasil, AL- MCZ")){
                                        System.out.println("Digite um destino diferente de sua localizaÃ§Ã£o atual\nOperação cancelada");
                                        pass.setLocalizacao(null);
                                        pass.setDestino(null);
                                    }
                                    else if(localiza.equals("Brasil, SP- São Bernado do Campo") && destina.equals("Brasil, SP- São Bernado do Campo")){
                                        System.out.println("Digite um destino diferente de sua localizaÃ§Ã£o atual\nOperação cancelada");
                                        pass.setLocalizacao(null);
                                        pass.setDestino(null);
                                    }
                                    else if(localiza.equals("EUA, CA- São Francisco") && destina.equals("EUA, CA- São Francisco")){
                                        System.out.println("Digite um destino diferente de sua localizaÃ§Ã£o atual\nOperação cancelada");
                                        pass.setLocalizacao(null);
                                        pass.setDestino(null);
                                    }
                                    else if(localiza.equals("Inglaterra, LPL- Garston") && destina.equals("Inglaterra, LPL- Garston")){
                                        System.out.println("Digite um destino diferente de sua localizaÃ§Ã£o atual\nOperação cancelada");
                                        pass.setLocalizacao(null);
                                        pass.setDestino(null);
                                    }
                                    else if(localiza.equals("Polônia, KRK- Pequena Polônia") && destina.equals("Polônia, KRK- Pequena Polônia")){
                                        System.out.println("Digite um destino diferente de sua localizaÃ§Ã£o atual\nOperação cancelada");
                                        pass.setLocalizacao(null);
                                        pass.setDestino(null);
                                    }
                                    
                                    else if(localiza.equals("Brasil, AL- MCZ") && destina.equals("Brasil, SP- São Bernado do Campo")){
                                        pass.setPreco(1500);
                                    }
                                    else if(localiza.equals("Brasil, AL- MCZ") && destina.equals("EUA, CA- São Francisco")){
                                        pass.setPreco(4500);
                                    }
                                    else if(localiza.equals("Brasil, AL- MCZ") && destina.equals("Inglaterra, LPL- Garston")){
                                        pass.setPreco(5000);
                                    }
                                    else if(localiza.equals("Brasil, AL- MCZ") && destina.equals("Polônia, KRK- Pequena Polônia")){
                                        pass.setPreco(5500);
                                    }

                                    else if(localiza.equals("Brasil, SP- São Bernado do Campo") && destina.equals("Brasil, AL- MCZ")){
                                        pass.setPreco(1500);
                                    }
                                    else if(localiza.equals("Brasil, SP- São Bernado do Campo") && destina.equals("EUA, CA- São Francisco")){
                                        pass.setPreco(4700);
                                    }
                                    else if(localiza.equals("Brasil, SP- São Bernado do Campo") && destina.equals("Inglaterra, LPL- Garston")){
                                        pass.setPreco(5200);
                                    }
                                    else if(localiza.equals("Brasil, SP- São Bernado do Campo") && destina.equals("Polônia, KRK- Pequena Polônia")){
                                        pass.setPreco(5700);
                                    }

                                    else if(localiza.equals("EUA, CA- São Francisco") && destina.equals("Brasil, AL- MCZ")){
                                        pass.setPreco(4500);
                                    }
                                    else if(localiza.equals("EUA, CA- São Francisco") && destina.equals("Brasil, SP- São Bernado do Campo")){
                                        pass.setPreco(4700);
                                    }
                                    else if(localiza.equals("EUA, CA- São Francisco") && destina.equals("Inglaterra, LPL- Garston")){
                                        pass.setPreco(3500);
                                    }

                                    else if(localiza.equals("EUA, CA- São Francisco") && destina.equals("Polônia, KRK- Pequena Polônia")){
                                        pass.setPreco(3700);
                                    }

                                    else if(localiza.equals("Inglaterra, LPL- Garston") && destina.equals("Brasil, AL- MCZ")){
                                        pass.setPreco(5000);
                                    }
                                    else if(localiza.equals("Inglaterra, LPL- Garston") && destina.equals("Brasil, SP- São Bernado do Campo")){
                                        pass.setPreco(5200);
                                    }
                                    else if(localiza.equals("Inglaterra, LPL- Garston") && destina.equals("EUA, CA- São Francisco")){
                                        pass.setPreco(3500);
                                    }
                                    else if(localiza.equals("Inglaterra, LPL- Garston") && destina.equals("Polônia, KRK- Pequena Polônia")){
                                        pass.setPreco(1300);
                                    }

                                    else if(localiza.equals("Polônia, KRK- Pequena Polônia") && destina.equals("Brasil, AL- MCZ")){
                                        pass.setPreco(5500);
                                    }
                                    else if(localiza.equals("Polônia, KRK- Pequena Polônia") && destina.equals("Brasil, SP- São Bernado do Campo")){
                                        pass.setPreco(5700);
                                    }
                                    else if(localiza.equals("Polônia, KRK- Pequena Polônia") && destina.equals("EUA, CA- São Francisco")){
                                        pass.setPreco(3700);
                                    }
                                    else if(localiza.equals("Polônia, KRK- Pequena Polônia") && destina.equals("Inglaterra, LPL- Garston")){
                                        pass.setPreco(3700);
                                    }
                                    if(pass.getPreco() > 0){
                                        System.out.println("Escolha a classe do seu vôo\n1- Presidencial\n2- Luxo\n-3 Conforto\n4- Simples");
                                        
                                        int classe = 0;
                                        while(j){
                                            try{
                                                classe = in.nextInt();
                                                break;
                                            }catch(NumberFormatException e){
                                                System.out.println("Digite apenas os valores listados!");
                                            }
                                        }
                                        
                                        if(classe == 1){
                                            pass.classe("Presidencial");
                                        }else if(classe == 2){
                                            pass.classe("Luxo");
                                        }else if(classe == 3){
                                            pass.classe("Conforto");
                                        }else{
                                            pass.classe("Simples");
                                        }
                                    }
                                }
                            }else{
                            System.out.println("Não há funcionarios disponiveis");
                        }
                        break;
                    case 2:
                        System.out.println("Deseja cancelar o seu agendamento?\n1- Sim\n2- Não");
                        
                        int cancelar = in.nextInt();
                        /*while(j){
                            try{
                                cancelar = in.nextInt();
                                break;
                            }catch(NumberFormatException e){
                                System.out.println("Digite apenas os valores listados");
                            }
                        }*/
                        
                        if(cancelar == 1){
                            if(!pass.getCheckin() || pass.getPreco() == 0){
                                pass.setDestino("Vazio");
                                pass.setLocalizacao("Vazio");
                                pass.setPreco(0);
                                adm.agendaCancelada();
                            }else
                            System.out.println("Check in já¡ foi realizado ou Não há¡ agendamento cadastrado, operaa§a£o cancelada");
                        }else System.out.println("Operaa§a£o cancelada");
                                                       
                        break;
                    case 3:
                        System.out.println("Deseja fazer check in?(Depois de fazer check in o agendamento na£o pode ser cancelado)\n1-Sim\n2- Não");
                        int checkin = 0;
                        while(j){
                            try{
                                in.nextInt();
                            }catch(NumberFormatException e){
                                System.out.println("Digite apenas os valores listados!");
                            }
                        }
                        if(checkin == 1){
                            pass.setCheckin(true);
                        }
                        
                        break;
                    case 4:
                        pass.estatos();
                        break;
                    case 5:
                        System.out.println("Digite uma nova senha");
                        in.nextLine();
                        String novaSenha = in.nextLine();
                        
                        c1.setSenha(novaSenha);
                        System.out.println("Senha alterada com sucesso");
                        
                        break;
                    case 99:
                        
                        System.out.println("Area de genrenciamento\n");
                        System.out.println("Deseja acessar a area de gerenciamento ?\n1- Sim\n2- Não");
                        
                        int gerenciar = 0;
                        while(true){
                            try{
                                gerenciar = in.nextInt();
                                in.nextLine();
                                if(entradaValida(gerenciar)){
                                    break;
                                }else{
                                    System.out.println("Digite uma ");
                                }
                                
                                
                            }catch(InputMismatchException e){
                                in.nextLine();
                                System.out.println("Digite apenas os valores listados");
                            }
                        }
                        
                        
                        if(gerenciar == 1){                                               		
                        
                            System.out.println("Digite a senha");
                        
                            String senhaadm = in.nextLine();
                        
                            if(senhaadm.equals("admin")){
                               adm.AdmMenu();
                            }else{
                                System.out.println("Senha incorreta");
                            }
                        }
                        
                        break;		  
                        
                     default:  System.out.println("Voce digitou uma opcao incorreta!!");					
                }
	}while(opcaoMenu != 0);
        
    }
    public boolean entradaValida(int entrada){
        if(entrada >= 1 && entrada <4){
            return true;
        }else{
            return false;
        }
    }
}
