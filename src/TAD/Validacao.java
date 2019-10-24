

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Nesta classe constam diferentes metodos de validacao.
 * Em especial, a validacao do BI e do E-mail do usuario.
 * No caso de existirem excepcoes o programa nao sera interrompido, 
 * ate que o usuario digite a informacao correcta.
 */

public class Validacao implements Serializable{

    

    public Validacao() {
        
    }

    public String validarBI() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bi = "", aux1 = "";
        float aux2 = 0;
        boolean error = true;

        do {
            do {
                try { //Caso houver alguma exepcao, havera repeticao das operacoes.
                    System.out.println("Introduza o seu BI: ");
                    bi = br.readLine();

                    //Levando a parte numerica do BI, cada iteracao representa um digito a ser concatenado na string aux1.
                    if ((bi.length() == 13) && (Character.isLetter(bi.charAt(12)))) {

                        for (int i = 0; i < bi.length() - 1; i++) {
                            aux1 += bi.charAt(i) + "";
                        }

                        aux2 = Float.parseFloat(aux1); //conversao da String aux1 em um valor real
                        error = false; //se o programa for executado ate essa linha significa que nao houve nunhuma excepcao
                    }
                    else{
                        System.out.println("ERRO! Numero de BI invalido! \nPor favor tente novamente(Modelo:000000000000A)\n______________________________________________________");
                    }
                } catch (NumberFormatException e1) {
                    System.out.println("ERRO! Numero de BI invalido! \nPor favor tente novamente(Modelo:000000000000A)\n______________________________________________________");
                } catch (IOException e2) {
                    System.out.println(e2.getMessage());
                }
            } while (error);
            System.out.println(bi);

            if ((bi.length() != 13) || (!Character.isLetter(bi.charAt(12))) || ((aux2 < 100000000000f) || (aux2 > 999999999999f))) 
                System.out.println("ERRO! Numero de BI invalido! \nPor favor tente novamente(Modelo:000000000000A)\n______________________________________________________");
            
            aux1 = "";
        } while ((bi.length() != 13) || (!Character.isLetter(bi.charAt(12))) || ((aux2 < 100000000000f) || (aux2 > 999999999999f)));
        return bi;
    }
    
    /* Para validar o E-mail do usuario, foram utilizadas classes da biblioteca java.util*
     * Tais metodos sao usados para verificar uma certa sequencia de caracteres.
     */ 
    public String validarEmail() {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String res = "";
		Matcher matcher;
		boolean aux = true;
		
		do {
			System.out.println("Introduza o seu email pessoal:");
			try {
				res = br.readLine(); //introducao do email do teclado
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
			/* exemplo: usuario@gmail.com
			 * Antes do caracter @, podem constar letras, e alguns simbolos
			 * Depois do caracter @, vem o tipo de email ex: gmail, hotmail, yahoo, etc...,
			 * Logo apos o tipo vem um ponto (.) 
			 * Por fim vem o dominio exemplo: .com, .mz, etc...
			 */
			String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
			Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
			matcher = emailPat.matcher(res);
			System.out.println(res);
			aux = matcher.find();
            if (aux == false)
            	System.out.println("ERRO! Email invalido! \nPor favor tente novamente (Modelo: utilizador@org.com)\n______________________________________________________");
		} while (aux == false);
		return res;
    }
    
    public String validarString(String msg, byte b1, byte b2) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        boolean error = true;

        do {
            do {
                try {
                    System.out.println(msg);
                    name = br.readLine();
                    error = false;
                } catch (IOException e1) {
                    System.out.println(e1.getMessage());
                }
            } while (error);
            System.out.println(name);
            if ((name.equals("") ||(!name.matches("^[a-zA-Z]*$"))) || (name.length() < b1 || name.length() > b2))
                System.out.println("ERRO! Por favor digite novamente. \nCertifique-se que nao introduziu um algarismo e que o numero de caracteres esta' entre "+b1+" e "+b2+".\n______________________________________________________");

        } while ((name.equals("") || (!name.matches("^[a-zA-Z]*$"))) || (name.length() < b1 || name.length() > b2));
        return name;
   }
     
     public String validarStringEspecifica(String msg, String op1,String op2, String op3){
            /*Metodo usado para validacao de Strings com valores predefindos
         */
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String resultado="";
         byte aux;
         aux = (byte) validarLong(msg,1,3);
         switch(aux){
             case 1:
                 resultado=op1;
                 break;
             case 2: 
                 resultado=op2;
                 break;
             case 3:
                 resultado=op3;
                 break;
         }
         
         return resultado;
     }

    public boolean validarChar(String msg, char a, char b, char c, char d) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char resp = 's';
        boolean val = true, error = true;

        do {
            do {
                try {
                    System.out.println(msg+"\n"+a+"\n"+b+"\n"+c+"\n"+d);
                    resp = br.readLine().charAt(0);
                    error=false;
                } catch (StringIndexOutOfBoundsException e1) {
                    System.out.println("ERRO! Valor invalido! \nPor favor tente novamente(Escolha uma das opcoes apresentadas)\n______________________________________________________");
                } catch (IOException e2) {
                    System.out.println(e2.getMessage());
                }
            } while (error);
            System.out.println(resp);
            if (resp == a || resp == b)
                val = true;
            else
            if (resp == c || resp == d)
                val = false;
            else
                System.out.println("ERRO! Valor invalido! \nPor favor tente novamente(Escolha uma das opcoes apresentadas)\n______________________________________________________");
        } while (resp != a && resp != b && resp != c && resp != d);
        return val;
    }
    
    
    public long validarLong(String msg, long a, long b) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = 0;
        boolean error = true;

        do {
            do {
                try {
                    System.out.println(msg);
                    x = Integer.parseInt(br.readLine());
                    error=false;
                } catch (NumberFormatException e1) {
                    System.out.println("ERRO! O valor introduzido nao e' inteiro  \nPor favor tente novamente com um valor inteiro\n______________________________________________________");
                } catch (IOException e2) {
                    System.out.println(e2.getMessage());
                }
            } while (error);
            System.out.println(x);
            if (x < a || x > b)
                System.out.println("ERRO! Valor fora do intervalo "+a+" a "+b+" \nPor favor tente novamente\n______________________________________________________");
        } while (x < a || x > b);
        return x;
    }

    public double validarDouble(String msg1, double a, double b) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double d = 0;
        boolean error = true;

        do {
            do {
                try {
                    System.out.println(msg1);
                    d = Double.parseDouble(br.readLine());
                    error=false;
                } catch (NumberFormatException e1) {
                    System.out.println("ERRO! O valor introduzido nao e' real  \nPor favor tente novamente com um valor real\n______________________________________________________");
                } catch (IOException e2) {
                    System.out.println(e2.getMessage());
                }
            } while (error);
            System.out.println(d);
            if (d < a || d > b)
                System.out.println("ERRO! Valor fora do intervalo "+a+" a "+b+" \nPor favor tente novamente\n______________________________________________________");
        } while (d < a || d > b);
        return d;
    }
    
    public String validarArea(){
    int c,l;
      c = (int)validarLong("Introduza o comprimento do quintal: ",10,100);
      System.out.println("_________________________________________________________");
      l =  (int)validarLong("Introduza a largua do quinta: ",10,100);
      System.out.println("_________________________________________________________");
      
    return c+" X "+l+" m2";
    }
}