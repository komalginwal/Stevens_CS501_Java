

public class LinearEquation {
	
	private double a = 2; // = 2 so denominator != 0	
	private double b = 1;								
	private double c = 1;								
	private double d = 1;								
	private double e = 1;								
	private double f = 1;								
	private String errorMessage = "";
	
	
//Constructors

	public LinearEquation() {}
	public LinearEquation(double _a, double _b, double _c, 
						  double _d, double _e, double _f) throws Exception
	{//Constructor for inputing the constants of the Cramer Equation
		a = _a;
		b = _b;
		c = _c;
		setD(_d); //Only need to check if isSolvable for the combinations of a,b,c, and d
		e = _e;
		f = _f;
	}
	public LinearEquation(double x1, double y1, double x2, double y2,
						  double x3, double y3, double x4, double y4) throws Exception
	{//Constructor for entering coordinates of 2 lines endpoints
		a = (y1 - y2);
		b = (x1 - x2);
		c = (y3 - y4);
		setD(x3 - x4);
		e = (y1 - y2)*x1 - (x1 - x2)*y1;
		f = (y3 - y4)*x3 - (x3 - x4)*y3;

	}
	
	public double getA() { return a; }
	public double getB() { return b; }
	public double getC() { return c; }
	public double getD() { return d; }
	public double getE() { return e; }
	public double getF() { return f; }
	public String getErrorMessage() { return errorMessage; }

	public double getX() { return (e * d - b * f) / (a * d - b * c); }
	public double getY() { return (a * f - e * c) / (a * d - b * c); }
	

//isValid Method:

	public boolean isSolvable(double _a, double _b, double _c, double _d)
	{
		if((_a*_d - _b*_c) != 0)
			return true;
		else
		{
			errorMessage= "Equation has no solution: (a*d - b*c) must not equal 0";
			return false;
		}
	}
	

// Set  functions:

	public void setA(double _a) throws Exception
	{
		if(!isSolvable(_a,b,c,d))
			throw new Exception(errorMessage);
		a = _a;
	}
	public void setB(double _b) throws Exception
	{
		if(!isSolvable(a,_b,c,d))
			throw new Exception(errorMessage);
		b = _b;
	}
	public void setC(double _c) throws Exception
	{
		if(!isSolvable(a,b,_c,d))
			throw new Exception(errorMessage);
		c = _c;
	}
	public void setD(double _d) throws Exception
	{
		if(!isSolvable(a,b,c,_d))
			throw new Exception(errorMessage);
		d = _d;
	}
	public void setE(double _e) { e = _e; }
	public void setF(double _f) { f = _f; }


	public void print() 
	{
		System.out.println("Cramer Equation Constants:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("Solution:");
		System.out.println("---------");
		System.out.println("x = " + getX());
		System.out.println("y = " + getY());
		
	}
	public String toString() //Show Cramer equation used to calculate x and y
	{
		return "Solving Linear Equations:\n"+
			   "-------------------------\n"+
			   "ax + by = e \t    ed - bf \t    af - ec\n"+
			   "cx + dy = f \tx = ------- \ty = -------\n"+
			   "            \t    ad - bc \t    ad - bc\n";
	}
	public boolean equals(Object o)
	{
		// check for null parameter
		if( o == null) return false;
		
		// check for object type
		String s = o.getClass().getName(); // method to get class name
		if( !s.equals("LinearEquation")) return false;
		
		// check for equivalent parameter values
		LinearEquation z = (LinearEquation) o;	// cast unspecified object
							
		if(	a != z.getA()) return false;
		if( b != z.getB()) return false;
		if(	c != z.getC()) return false;
		if( d != z.getD()) return false;
		if(	e != z.getE()) return false;
		if( f != z.getF()) return false;
		
		return true;
	}




}
