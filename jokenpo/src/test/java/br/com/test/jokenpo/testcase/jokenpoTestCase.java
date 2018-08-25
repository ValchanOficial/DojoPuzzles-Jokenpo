package br.com.test.jokenpo.testcase;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import br.com.test.jokenpo.juiz.Juiz;
import br.com.test.jokenpo.verificationpoint.VerificationPoint;

public class jokenpoTestCase {
	
	private VerificationPoint verificationPoint;
	private Juiz juiz;
	
	@Before
	public void setUp() {
		verificationPoint = new VerificationPoint();
		juiz = new Juiz();
	}
	
	@Test
	public void testMain() {
		String mensagem = juiz.resultado("Tesoura","Papel"); //JoKenPo
		System.out.println(mensagem);
		assertTrue(mensagem, verificationPoint.check(mensagem));
	}
	
	@After
	public void tearDown() {
		System.out.println("Teste finalizado.");
	}
}