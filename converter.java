class converter
{
	double f, c, r;

	public converter ()
	{
		
	}
	public double f_to_c(double f)
	{   
	   c = ((f-32) * 5)/9;
	   System.out.println("Suhu dalam Fahrenheit : " + f + "\nHasil konversi ke Celcius : " + c);
	   return c;
	}
	
	public double f_to_r(double f)
	{  
		r = ((f - 32) * 4)/ 9;
		System.out.println("Suhu dalam Fahrenheit : " + f + "\nHasil konversi ke Reamur : " + r);
		return r;
	}
	
	public double c_to_f(double c)
	{  
		f = ((c * 9)/5) + 32;
		System.out.println("Suhu dalam Celcius : " + c + "\nHasil konversi ke Farenheit : " + f);
		return f;
	}
	
	public double c_to_r(double c)
	{
		r = ((c * 4)/5);
		System.out.println("Suhu dalam Celcius : " + c + "\nHasil konversi ke Reamur : " + r);
		return r;
	}
	
	public double r_to_c(double r)
	{
		c = ((r * 5)/4);
		System.out.println("Suhu dalam Reamur : " + r + "\nHasil konversi ke Celcius : " + c);
		return c;
	}
	
	public double r_to_f(double r)
	{
		f = ((r * 9)/4) + 32;
		System.out.println("Suhu dalam Reamur : " + r + "\nHasil konversi ke Farenheit : " + f);
		return f;
	}
}