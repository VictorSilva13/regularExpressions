public class Main extends ExpReg{
    public static void main(String[] args) {
        String exp = "";
        String sent = "";
        
        do {

            System.out.println("Para sair digite # \n");
            
            exp = askExpressao();
            if(exp.charAt(0) == '#'){
                break;
            }
            sent = askSentenca();
            if(sent.charAt(0) == '#'){  
                break;
            }
            conferir(exp, sent);
            System.out.print("\n");

        }while (true);
        

    }
}

