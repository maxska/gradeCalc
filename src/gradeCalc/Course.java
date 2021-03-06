package gradeCalc;

public abstract class Course 
{
	private String code;
	private String name;
	
	
	/*
	 * Constructor
	 */
	public Course(String _code, String _name)
	{
		if (!checkCode(_code) || !checkName(_name))
		{
			throw new java.lang.RuntimeException("ERROR: Invalid values for members in Course class...");
		}
		
		code = _code;
		name = _name;
	}
	

	public boolean checkCode(String code)
	{
		return code.length() == 6;
	}
	
	public boolean checkName(String name)
	{
		if (name.length() > 3 && name.length() < 30)
		{
			return true;
		}
		
		return false;
	}
	
	
	public String getCode()
	{
		return code;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	abstract public String getGrade();
	
	
	public boolean setCode(String _code)
	{
		if (checkCode(_code))
		{
			code = _code;
			return true;
		}
		
		return false;
	}
	
	
	public boolean setName(String _name)
	{
		if (Logic.checkName(_name))
		{
			name = _name;
			return true;
		}
		
		return false;
	}

	abstract public boolean setGrade(String grade);
}
