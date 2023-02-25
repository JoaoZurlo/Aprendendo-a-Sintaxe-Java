
public class MinhaClasse {
	private static final int dataDeNascimento =  13 ;
	private static final int mesDeNascimento =  8 ;
	private static final int anoDeNascimento =  2001;

	public static void main (String [] args)  {
		
		final String BR = "Brasil";
		
		
		String meuN0me = "Joao Paulo Zurlo";
		String primeiroNome = "Joao";
		String segundoNome = "Paulo";
		String terceiroNome = " Zurlo";
		String cidadeDeNascimento = "Limeira";
		String  nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome, cidadeDeNascimento);
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome,  String terceiroNome, String cidadeDeNascimento ) {
		return "Resultado do metodo " +  primeiroNome.concat(" ").concat(segundoNome).concat(terceiroNome)+ " nasceu na cidade de ".concat(cidadeDeNascimento) + " no dia  "  + dataDeNascimento +" do "+  mesDeNascimento + " de " + anoDeNascimento ;
	}
}
