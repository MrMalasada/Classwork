package MakeYourChoiceGame;

public class Character {

	private String userName;
	
	private String grade;
	
	private String favSubject;
	
	private String favSubject2;
	
	private String favSubject3;
	
	private String favSubject4;
	
	public Character (String name , String grd , String favSubj , String favSubj2 , String favSubj3, String favSubj4)
	{
		userName = name;
		
		grade = grd;
		
		favSubject = favSubj;
		
		favSubject2 = favSubj2;
		
		favSubject3 = favSubj3;
		
		favSubject4 = favSubj4;
	}
	
	public String getUsername()
	{
		return userName;
	}
	
	public String getUserGrade()
	{
		return grade;
	}
	
	public String getUserFavSubject()
	{
		return favSubject;
	}
	
	public String getUserFavSubject2()
	{
		return favSubject2;
	}
	
	public String getUserFavSubject3()
	{
		return favSubject3;
	}
	
	public String getUserFavSubject4()
	{
		return favSubject4;
	}
}
