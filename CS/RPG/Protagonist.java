/* That Better Team (Hasif Ahmed, Motahsim Howlader, Kyle Tau)
APCS1 pd 2
HW 26 -- Ye Olde Role Playing Game
11-08-17 */

public class Protagonist{
    //all attributes
    private String name;
    private int life;
    private int strength;
    private int defense;
    private double attackr;

    public Protagonist(String x){
	//overloaded constructor, sets attributes, takes name param
	name = x;
	life = 125;
	strength = 100;
	defense = 40;
	attackr = .4;
    }
    public boolean isAlive(){
	return life > 0;
    }
    public int getDefense(){
	return defense;
    }
    public String getName(){
	return name;
    }
    public void lowerHP(int x){
	life -= x;
    }
    public int attack(Monster x){
	int damage = (int) (strength * attackr) - x.getDefense();
	x.lowerHP(damage);//damage to monster given from protagonist
	return damage;
    }
    public void specialize(){
	defense -= 10;
	attackr += .6;
    }
    public void normalize(){
	defense += 10;
	attackr -= .6;
    }
}
    
	
