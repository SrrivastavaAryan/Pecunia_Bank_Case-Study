package GlaMathura.GlaMathura;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class FirstTestCase {
@Test
public void     m()
{
	 EBank1   e=new EBank1();e.setAccountBalance(2000);
	 Assertions.assertTrue((e.getAccountBalance()<5000));
	 }
@Test
public void     m1()
{
	EBank1  e=new EBank1();
	 e.setAccountBalance(6000);
	 e.setAccountHolderName("suresh");
	 e.setPassword("1234");
	 e.setAccountType("Savings");
	 e.setAccountNumberGenerator(e.getAccountNumber());
	 Assertions.assertEquals(e.getAccountNumber(), new Random().nextInt(1000));
}
@Test
public void     m2()
{
	EBank1  e=new EBank1();
	 e.setAccountBalance(6000);
	 e.setAccountHolderName("suresh");
	 e.setPassword("1234");
	 e.setAccountType("Savings");
	 Assertions.assertEquals(e.getPassword(), "1234");
}
}
