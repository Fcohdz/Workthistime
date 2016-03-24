//Edit by Francisco Hernandez.

package githubtest;

public class Francisco
{
	private String fname;
	private String lname;
	
	public Francisco(String f, String l)
	{
		this.fname = f;
		this.lname = l;
	}
	
	public String getfname()
	{
		return fname;
	}
	
	public String getlname()
	{
		return lname;
	}
	
	public void printname()
	{
		System.out.println(fname + " " + lname);
	}
}