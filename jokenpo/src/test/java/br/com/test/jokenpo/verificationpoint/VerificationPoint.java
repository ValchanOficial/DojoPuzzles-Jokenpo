package br.com.test.jokenpo.verificationpoint;

public class VerificationPoint {
	
	private String CHECKEMPATE = "Empate";
	private String CHECKPEDRA = "Pedra ganha de tesoura!";
	private String CHECKTESOURA = "Tesoura ganha de Papel!";
	private String CHECKPAPEL = "Papel ganha de Pedra!";
	
	
	public boolean check(String text) {
		if(text.equals(CHECKEMPATE) || text.equals(CHECKPEDRA) || text.equals(CHECKPAPEL) || text.equals(CHECKTESOURA)) {
			return true;
		} else {
			return false;
		}
	}
}