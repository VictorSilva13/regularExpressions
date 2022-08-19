import java.util.Scanner;

public class ExpReg {

    public static void conferir(String expressao, String sentenca){
        if(sentenca.matches(expressao)){
            System.out.println("\n>>> A expressão " + expressao + " ACEITA a sentença " + sentenca + " <<<");
        }else{
            System.out.println("\n>>> A expressão " + expressao + " REJEITA a sentença " + sentenca + " <<<");
        }
    }
    
    public static String askExpressao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a expressão regular que deseja utilizar? ");
        String exp = scan.nextLine();
        return exp;
    }

    public static String askSentenca(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a sentença de caractéres para ser analisada? ");
        String sent = scan.nextLine();
        return sent;
    }
}
