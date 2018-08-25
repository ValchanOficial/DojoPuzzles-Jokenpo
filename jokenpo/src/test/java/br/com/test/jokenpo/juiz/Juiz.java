package br.com.test.jokenpo.juiz;

public class Juiz {
	
	public String resultado(String jogadorUm, String jogadorDois) {
		if(jogadorUm.equals(jogadorDois)) {
			return "Empate";
		} else if(jogadorUm.equals("Pedra") && jogadorDois.equals("Tesoura") || jogadorUm.equals("Tesoura") && jogadorDois.equals("Pedra")){
			return "Pedra ganha de tesoura!";
		} else if(jogadorUm.equals("Tesoura") && jogadorDois.equals("Papel") || jogadorUm.equals("Papel") && jogadorDois.equals("Tesoura") ){
			return "Tesoura ganha de Papel!";
		} else if(jogadorUm.equals("Papel") && jogadorDois.equals("Pedra") || jogadorUm.equals("Pedra") && jogadorDois.equals("Papel")){
			return "Papel ganha de Pedra!";
		} else if(jogadorUm.equals(jogadorDois)) {
			return "Empate";
		} else{
			return "Ocorreu um erro!";
		}
	}
}