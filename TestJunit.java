import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   double f = 212;
   double c = 100;
   double r = 80;	
   converter converter = new converter();

   @Test
   public void testconverter() {
      assertEquals(100,converter.f_to_c(f),0.001);
	  assertEquals(80,converter.f_to_r(f),0.001);
	  assertEquals(80,converter.c_to_r(c),0.001);
	  assertEquals(212,converter.c_to_f(c),0.001);
	  assertEquals(100,converter.r_to_c(r),0.001);
	  assertEquals(212,converter.r_to_f(r),0.001);
   }
}