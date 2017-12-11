/* That Better Team (Hasif Ahmed, Motahsim Howlader, Kyle Tau)
APCS1 pd 2
HW 26 -- Ye Olde Role Playing Game
11-08-17 */

public class Monster{
    //all attributes of Monster
    private String name;
    private int life;
    private int strength;
    private int defense;
    private double attackr;

    public Monster(){
	//initializes attributes
	name = "ye olde monster";
	life = 150;
	strength = (int) (Math.random() * 44) + 20;
	defense = 20;
	attackr = 1.0;
    }
    public boolean isAlive(){
	return life >  0;
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
    public int attack(Protagonist x){
	int damage = (int) (strength * attackr) - x.getDefense();
	x.lowerHP(damage); //HP of protagonist is lowered by the attack from monster
	return damage;
    }
}
