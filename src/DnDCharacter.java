
public class DnDCharacter {
	
	private String race;
	private String classType;
	private int level;
	private boolean sizeSmall;
	
	
	
	DnDCharacter(){
		
	}
	
	DnDCharacter(String race, String classType){
		this.race = race;
		this.classType = classType;
	}
	
	DnDCharacter(String race, String ClassType, int level, boolean sizeSmall){
		this.race = race;
		this.classType = classType;
		this.level = level;
		this.sizeSmall = sizeSmall;
	}
	
	public String getRace() {
		return race;
	}
	
	public String getClassType() {
		return classType;
	}
	
	public int getLevel() {
		return level;
	}
	
	public boolean _isSmall() {
		return sizeSmall;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public void setRace(int level) {
		this.level = level;
	}
	
	public boolean isSmall() {
		return sizeSmall;
	}
	
	public String getCharacterInfo() {
		return "Your character is a: " + classType + " " + race + " at level " + level; 
	}
	
	
}
