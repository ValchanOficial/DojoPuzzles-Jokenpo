package br.com.jokenpo.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.com.test.jokenpo.testcase.jokenpoTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	jokenpoTestCase.class
})
public class regressionTestSuite {
	@BeforeClass
	public static void initTest() {
		System.out.println("Iniciando suite de testes..");
		System.out.println("---------------------------");
	}
	@AfterClass
	public static void endTest() {
		System.out.println("---------------------------");
		System.out.println("Suite de testes finalizada!");
	}
}