package MakeYourChoiceGame;

public class Character {

	private String userName;
	
	private String grade;
	
	private String favSubject;
	
	public Character (String name , String grd , String favSubj)
	{
		userName = name;
		
		grade = grd;
		
		favSubject = favSubj;
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
}
