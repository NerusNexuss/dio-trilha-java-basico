package aula;

public class MinhaClasse { 
	
public static void main (String [] args) {
	String primeiroNome = "Marcos"; 
	String segundoNome = "José";  
	
	String nomeCompleto = nomeCompleto (primeiroNome,segundoNome); 
	
	System.out.println(nomeCompleto);


	
	
	
}
public static String nomeCompleto(String primeiroNome, String segundoNome) {
	return "Resultado do métado" + primeiroNome.concat(" ").concat(segundoNome);
}

}
