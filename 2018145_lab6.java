import java.util.*;
class monster{
	protected String name;
	protected final int level;
	protected int HP;
	protected int outof;
	monster(String name,int level,int HP,int outof){
		this.name=name;
		this.level=level;
		this.HP=HP;
		this.outof=outof;
	}
	public void set_monstername(String name) {
		this.name=name;
	}
	public void set_monsterHP(int HP) {
		this.HP=HP;
	}
	public void set_outof(int outof) {
		this.outof=outof;
	}
	public String get_monstername() {
		return this.name;
	}
	public int get_monsterHP() {
		return this.HP;
	}
	public int get_monsterlevel() {
		return this.level;
	}
	public int get_outof() {
		return this.outof;
	}
}
class hero{
	protected String name;
	protected int XP;
	protected int HP;
	protected int attack;
	protected int defence;
	protected int outof;
	hero(String name,int XP,int HP,int attack,int defence,int outof){
		this.name=name;
		this.HP=HP;
		this.XP=XP;
		this.attack=attack;
		this.defence=defence;
		this.outof=outof;
	}
	public void specialattack() {
		this.attack=attack;
		this.defence=defence;
	}
	public void set_heroname(String name) {
		this.name=name;
	}
	public void set_heroHP(int HP) {
		this.HP=HP;
	}
	public void set_heroXP(int XP) {
		this.XP=XP;
	}
	public void set_attack(int attack) {
		this.attack=attack;
	}
	public void set_defence(int defence) {
		this.defence=defence;
	}
	public String get_heroname() {
		return this.name;
	}
	public void set_houtof(int outof) {
		this.outof=outof;
	}
	public int get_heroHP() {
		return this.HP;
	}
	public int get_heroXP() {
		return this.XP;
	}
	public int get_attack() {
		return this.attack;
	}
	public int get_defence() {
		return this.defence;
	}
	public int get_houtof() {
		return this.outof;
	}
}
class Goblins extends monster{
	Goblins(String name,int level,int HP,int outof){
		super(name,level,HP,outof);
	}	
}
class Zombies extends monster{
	Zombies(String name,int level,int HP,int outof){
		super(name,level,HP,outof);
	}	
}
class Fiends extends monster{
	Fiends(String name,int level,int HP,int outof){
		super(name,level,HP,outof);
	}	
}
class LionFang extends monster{
	LionFang(String name,int level,int HP,int outof){
		super(name,level,HP,outof);
	}	
}
///////////////////////////////////////////////////////////
class Warrior extends hero{
	Warrior(String name,int XP,int HP,int attack,int defence,int outof){
		super(name, XP, HP,attack,defence,outof); 
	}
	@Override 
	public void specialattack() {
		this.set_attack(get_attack()+5);
		this.set_defence(get_defence()+5);
		
	}
}
class Mage extends hero {
	Mage(String name,int XP,int HP,int attack,int defence,int outof){
		super(name, XP, HP,attack,defence,outof); 
	}
	@Override
	public void specialattack() {
		this.set_heroHP(get_heroXP());
	}
}
class Thief extends hero{
	Thief(String name,int XP,int HP,int attack,int defence,int outof){
		super(name, XP, HP,attack,defence,outof); 
	}
	@Override
	public void specialattack() {
		this.set_heroHP(get_heroXP());
	}
}
class Healer extends hero{
	Healer(String name,int XP,int HP,int attack,int defence,int outof){
		super(name, XP, HP,attack,defence,outof); 
	}
	@Override
	public void specialattack() {
		this.set_heroXP((int)(get_heroXP()+get_heroXP()*0.05));
	}
}
public class ArchLegends2 {
	public static int calc_mean(int[] arr,int n) {
		int sum=0;
		int m=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		m=sum/n;
		return m;
	}
	static double variance(int a[], int n)
    {
       
        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
        double mean = (double)sum/(double)n;
        double sqDiff = 0;
        for (int i = 0; i < n; i++) 
            sqDiff += (a[i] - mean) * (a[i] - mean);
         
        return (double)sqDiff/n;
    }
	public static double calc_stdeviation(int[] arr, int n) {
		int s=0;
		return Math.sqrt(variance(arr, n));
	}
	static hero hero;
	static monster monster;
	
	public static void main(String[] args) {
		int hr;
		ArrayList<hero> n_hero=new ArrayList<hero>();
		ArrayList<monster> n_monster=new ArrayList<monster>();
		ArrayList<String> arr1=new ArrayList<String>();
		int mean=0;
		int sum=0;
		int attack=0;
		double a=0;
		int standard_deviation=0;
		Scanner s=new Scanner(System.in);
		Random rand = new Random();
		//System.out.println();
		//////////////////////////////////////////
		hero=new hero("WARRIOR",0,100,10,3,100);
		n_hero.add(hero);
		hero=new hero("THIEF",0,100,6,4,100);
		n_hero.add(hero);
		hero=new hero("MAGE",0,100,5,5,100);
		n_hero.add(hero);
		hero=new hero("HEALER",0,100,4,8,100);
		n_hero.add(hero);
		///////////////////////////////////////////
		monster=new monster("GOBLINS",1,100,100);
		n_monster.add(monster);
		monster=new monster("ZOMBIES",2,100,100);
		n_monster.add(monster);
		monster=new monster("FIENDS",3,200,200);
		n_monster.add(monster);
		monster=new monster("LIONFANG",4,250,250);
		n_monster.add(monster);
		Boolean t0=true;
		Boolean t1=true;
		Boolean t2=true;
		Boolean t3=true;
		Boolean t4=true;
		Boolean t5=true;
		Boolean t6=true;
		Boolean t7=true;
		Boolean t8=true;
		Boolean t9=true;
		Boolean t10=true;
		int direction=0;
		int newgain=50;
		int i=0;
		int y=0;
		int assign=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int rand1=0;
		double find=0;
		int newat=0;
		int get=1;
		while(t1!=false) {
			System.out.println("WELCOME TO ARCHLEGENDS");
			System.out.println("CHOOSE YOUR OPTION");
			System.out.println("1) NEW USER");
			System.out.println("2) EXISTING USER");
			System.out.println("3) EXIT");
			int q1=s.nextInt();
			//t2=true;
			if(q1==1) {
				
				System.out.println("ENTER USERNAME");
				String user_name=s.next();
				arr1.add(user_name);
				System.out.println("CHOOSE A HERO");
				System.out.println("1) WARRIOR");
				System.out.println("2) THIEF");
				System.out.println("3) MAGE");
				System.out.println("4) HEALER");
				int hero=s.nextInt();
				i=hero;
				System.out.println("USER CREATION DONE....USERNAME:"+arr1.get(y)+" HERO TYPE:"+n_hero.get(i-1).get_heroname()+" LOG IN TO PLAY THE GAME..EXITING");
				y+=1;	
			}
			//t3=true;
			if(q1==2) {
				
				System.out.println("ENTER USERNAME");
				String find_name=s.next();
				for(int j=0;j<arr1.size();j++) {
					if(arr1.get(j).contentEquals(find_name)) {
						System.out.println("USER FOUND....LOGING IN");
						System.out.println("WELCOME "+arr1.get(j));
						t6=true;
						while(t6!=false) {
						t7=true;
						if(n_hero.get(i-1).get_heroXP()==0&&t7!=false) {
							System.out.println("YOU ARE AT THE STARTING LOCATION...CHOOSE PATH");
							System.out.println("1) GO TO LOCATION 0");
							System.out.println("2) GO TO LOCATION 3");
							System.out.println("3) GO TO LOCATION 6");
							System.out.println("4) ENTER -1 TO EXIT");
						}
						t8=true;
						if(n_hero.get(i-1).get_heroXP()==20&&t8!=false) {
							System.out.println("YOU ARE AT THE STARTING LOCATION...CHOOSE PATH");
							System.out.println("1) GO TO LOCATION 1");
							System.out.println("2) GO TO LOCATION 4");
							System.out.println("3) GO TO LOCATION 7");
							System.out.println("3) GO BACK TO PREVIOUS PATH");
							System.out.println("4) ENTER -1 TO EXIT");
						}
						t9=true;
						if(n_hero.get(i-1).get_heroXP()==40&&t9!=false) {
							System.out.println("YOU ARE AT THE STARTING LOCATION...CHOOSE PATH");
							System.out.println("1) GO TO LOCATION 2");
							System.out.println("2) GO TO LOCATION 5");
							System.out.println("3) GO TO LOCATION 8");
							System.out.println("3) GO BACK TO PREVIOUS PATH");
							System.out.println("4) ENTER -1 TO EXIT");
						}
						t10=true;
						if(n_hero.get(i-1).get_heroXP()>40&&t10!=false) {
							System.out.println("YOU ARE AT THE STARTING LOCATION...CHOOSE PATH");
							System.out.println("1) GO TO LOCATION 10");
							System.out.println("3) GO BACK TO PREVIOUS PATH");
							System.out.println("4) ENTER -1 TO EXIT");
						}
						int in1=s.nextInt();
						t4=true;
						while(t4!=false) {
							if(n_hero.get(i-1).get_heroXP()==0) {
							if(in1==1)
								direction=0;
							else if(in1==2)
								direction=3;
							else if(in1==3)
								direction=6;
							else if(in1==-1)
								t4=t6=t7=t8=t9=t10=false;
							}
							if(n_hero.get(i-1).get_heroXP()==20) {
								if(in1==1)
									direction=1;
								else if(in1==2)
									direction=4;
								else if(in1==3)
									direction=7;
								else if(in1==4)
									t4=t10=t8=t9=false;
								else if(in1==-1)
									t4=t6=t7=t8=t9=t10=false;
								}
							if(n_hero.get(i-1).get_heroXP()==40) {
								if(in1==1)
									direction=2;
								else if(in1==2)
									direction=5;
								else if(in1==3)
									direction=8;
								else if(in1==4)
									t4=t7=t9=t10=false;
								else if(in1==-1)
									t4=t6=t7=t8=t9=t10=false;
								}
							if(n_hero.get(i-1).get_heroXP()>40) {
								if(in1==1)
									direction=10;
								else if(in1==2)
									t4=t7=t8=t10=false;
								else if(in1==3)
									t4=t10=t8=t7=false;
								
								}
							System.out.println("MOVING TO LOCATION "+direction);
							if(n_hero.get(i-1).get_heroXP()<=40)
								rand1=rand.nextInt(3);
							else
								rand1=3;
							double find_xp=n_monster.get(rand1).get_monsterHP()*0.25;
							int idx=(int)Math.ceil(find_xp);
							int arr[]=new int[idx];
							for(int k=0;k<find_xp;k++) {
								arr[k]=k+1;
							}
							mean=calc_mean(arr,idx);
							standard_deviation=(int)calc_stdeviation(arr,idx);
							System.out.println("FIGHT STARTED..YOUR FIGHTING A LEVEL "+(rand1+1)+" MONSTER");
							t5=true;
							while(n_monster.get(rand1).get_monsterHP()>0&&t5!=false) {
								t0=true;
								if(n_monster.get(rand1).get_monsterlevel()<4) {
									a=rand.nextGaussian();
									Math.abs(a);
									attack=(int)a*standard_deviation+mean;
									newat=attack;
								}
								
								System.out.println("CHOOSE MOVE:");
								System.out.println("1) ATTACK");
								System.out.println("2) DEFENCE");
								assign+=1;
								if(assign%4==0&&assign!=0&&t0==true){
									System.out.println("3) SPECIAL ATTACK");
									count1=0;
									count2=0;
									count3=0;
									count4=0;
									assign-=1;
								}
								int q2=s.nextInt();
								if(q2==1) {
									if(((i-1)==0)&&count1%4==0&&count1!=0) {
										int hp=n_hero.get(i-1).get_attack()+5;
										n_hero.get(i-1).set_attack(hp);
										int df=n_hero.get(i-1).get_defence()+5;
										n_hero.get(i-1).set_defence(df);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
									}
									else if((i-1)==2&&count3%4==0&&count3!=0) {
										int hp=(int)Math.ceil(n_monster.get(rand1).get_monsterHP()*0.05);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
									}
									else if((i-1)==3&&count4%4==0&&count4!=0) {
										int hp=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.05);
										n_hero.get(i-1).set_heroHP(n_hero.get(i-1).get_heroHP()+hp);
									}
									System.out.println("YOU CHOOSE TO ATTACK");
									System.out.println("YOU ATTACK AND INFLICTED "+n_hero.get(i-1).get_attack()+" DAMAGE TO THE MONSTER");
									int set=n_monster.get(rand1).get_monsterHP()-n_hero.get(i-1).get_attack();
									n_monster.get(rand1).set_monsterHP(set);
									System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
									System.out.println("MONSTER ATTACK");
									if(n_monster.get(rand1).get_monsterlevel()==4) {
										get=rand.nextInt(9);
										if(get==1) {
											attack=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.5);
											}
										else {
											mean=calc_mean(arr,idx);
											standard_deviation=(int)calc_stdeviation(arr,idx);
											a=(int)rand.nextGaussian();
											Math.abs(a);
											attack=(int)a*standard_deviation+mean;
										}}
									else {
										attack=(int)a*standard_deviation+mean;
									}
									
									System.out.println("THE MONSTER ATTACKED AND INFLICTED "+attack+" DAMAGE TO YOU");
									int hp=n_hero.get(i-1).get_heroHP()-(attack);
									n_hero.get(i-1).set_heroHP(hp);
									System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
									if(n_hero.get(i-1).get_heroHP()<1) {
										System.out.println("YOU LOOSE THE GAME...");
										System.out.println("YOUR HP:"+0+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										if(n_hero.get(i-1).get_heroXP()==0) {
											n_hero.get(i-1).set_heroHP(100);
											n_hero.get(i-1).set_houtof(100);
										}
										if(n_hero.get(i-1).get_heroXP()==20) {
											n_hero.get(i-1).set_heroHP(150);
											n_hero.get(i-1).set_houtof(150);
										}
										if(n_hero.get(i-1).get_heroXP()==40) {
											n_hero.get(i-1).set_heroHP(200);
											n_hero.get(i-1).set_houtof(200);
										}
										if(n_hero.get(i-1).get_heroXP()>40) {
											n_hero.get(i-1).set_heroHP(250);
											n_hero.get(i-1).set_houtof(250);
										}
										if(n_monster.get(rand1).get_monsterlevel()==1) {
											n_monster.get(rand1).set_monsterHP(100);
											n_monster.get(rand1).set_outof(100);
										}
										if(n_monster.get(rand1).get_monsterlevel()==2) {
											n_monster.get(rand1).set_monsterHP(100);
											n_monster.get(rand1).set_outof(100);
										}
										if(n_monster.get(rand1).get_monsterlevel()==3) {
											n_monster.get(rand1).set_monsterHP(200);
											n_monster.get(rand1).set_outof(200);
										}
										if(n_monster.get(rand1).get_monsterlevel()==4) {
											n_monster.get(rand1).set_monsterHP(250);
											n_monster.get(rand1).set_outof(250);
										}
										assign=0;
										t4=false;
										t5=false;
										break;
										}
									else if(n_monster.get(rand1).get_monsterHP()<1) {
										if(n_monster.get(rand1).get_monsterlevel()<4) {
										System.out.println("MONSTER KILLED!");
										System.out.println("20XP REWARDED");
										int xp=n_hero.get(i-1).get_heroXP()+20;
										n_hero.get(i-1).set_heroXP(xp);
										int g1=n_hero.get(i-1).get_attack()+1;
										n_hero.get(i-1).set_attack(g1);
										int g2=n_hero.get(i-1).get_defence()+1;
										n_hero.get(i-1).set_defence(g2);
										n_hero.get(i-1).set_heroHP(100+newgain);
										n_hero.get(i-1).set_houtof(100+newgain);
										newgain+=50;
										
										if(n_monster.get(rand1).get_monsterlevel()==1) {
											n_monster.get(rand1).set_monsterHP(100);
											n_monster.get(rand1).set_outof(100);
										}
										if(n_monster.get(rand1).get_monsterlevel()==2) {
											n_monster.get(rand1).set_monsterHP(100);
											n_monster.get(rand1).set_outof(100);
										}
										if(n_monster.get(rand1).get_monsterlevel()==3) {
											n_monster.get(rand1).set_monsterHP(200);
											n_monster.get(rand1).set_outof(200);
										}
										if(n_monster.get(rand1).get_monsterlevel()==4) {
											n_monster.get(rand1).set_monsterHP(250);
											n_monster.get(rand1).set_outof(250);
										}
										assign=0;
										t4=false;
										//t6=false;
										t5=false;
										break;
										}
										if(n_monster.get(rand1).get_monsterlevel()==4&&n_hero.get(i-1).get_heroXP()>40){
											System.out.println("YOU WIN THE GAME ALL MONSTERS ARE KILLED");
											t2=t3=t4=t5=t6=t7=t8=t9=t10=false;
											break;
										}
									}
								}
								if(q2==2) {
									if(((i-1)==0)&&count1%4==0&&count1!=0) {
										int hp=n_hero.get(i-1).get_attack()+5;
										n_hero.get(i-1).set_attack(hp);
										int df=n_hero.get(i-1).get_defence()+5;
										n_hero.get(i-1).set_defence(df);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
									}
									else if((i-1)==2&&count3%4==0&&count3!=0) {
										int hp=(int)Math.ceil(n_monster.get(rand1).get_monsterHP()*0.05);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
									}
									else if((i-1)==3&&count4%4==0&&count4!=0) {
										int hp=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.05);
										n_hero.get(i-1).set_heroHP(n_hero.get(i-1).get_heroHP()+hp);
									}
									System.out.println("YOU CHOOSE TO DEFEND");
									System.out.println("MONSTER ATTACK REDUCED BY "+n_hero.get(i-1).get_defence()+"!");
									System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
									System.out.println("MONSTER ATTACK");
									if(n_monster.get(rand1).get_monsterlevel()==4) {
										get=rand.nextInt(9);
										if(get==1) {
											attack=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.5);
											}
										else {
											mean=calc_mean(arr,idx);
											standard_deviation=(int)calc_stdeviation(arr,idx);
											a=(int)rand.nextGaussian();
											Math.abs(a);
											attack=(int)a*standard_deviation+mean;
										}}
									else {
										attack=(int)a*standard_deviation+mean;
									}
									int def=attack-n_hero.get(i-1).get_defence();
									if(attack<n_hero.get(i-1).get_defence()) {
										def=0;
									}
									System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
									int hp=n_hero.get(i-1).get_heroHP()-def;
									n_hero.get(i-1).set_heroHP(hp);
									System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
									if(n_hero.get(i-1).get_heroHP()<1) {
										System.out.println("YOU LOOSE THE GAME...");
										System.out.println("YOUR HP:"+0+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										if(n_hero.get(i-1).get_heroXP()==0) {
											n_hero.get(i-1).set_heroHP(100);
											n_hero.get(i-1).set_houtof(100);
										}
										if(n_hero.get(i-1).get_heroXP()==20) {
											n_hero.get(i-1).set_heroHP(150);
											n_hero.get(i-1).set_houtof(150);
										}
										if(n_hero.get(i-1).get_heroXP()==40) {
											n_hero.get(i-1).set_heroHP(200);
											n_hero.get(i-1).set_houtof(200);
										}
										if(n_hero.get(i-1).get_heroXP()>40) {
											n_hero.get(i-1).set_heroHP(250);
											n_hero.get(i-1).set_houtof(250);
										}
										if(n_monster.get(rand1).get_monsterlevel()==1) {
											n_monster.get(rand1).set_monsterHP(100);
											n_monster.get(rand1).set_outof(100);
										}
										if(n_monster.get(rand1).get_monsterlevel()==2) {
											n_monster.get(rand1).set_monsterHP(100);
											n_monster.get(rand1).set_outof(100);
										}
										if(n_monster.get(rand1).get_monsterlevel()==3) {
											n_monster.get(rand1).set_monsterHP(200);
											n_monster.get(rand1).set_outof(200);
										}
										if(n_monster.get(rand1).get_monsterlevel()==4) {
											n_monster.get(rand1).set_monsterHP(250);
											n_monster.get(rand1).set_outof(250);
										}
										assign=0;
										t4=false;
										t5=false;
										break;
										}
									else if(n_monster.get(rand1).get_monsterHP()<1) {
										if(n_monster.get(rand1).get_monsterlevel()<4) {
											System.out.println("MONSTER KILLED!");
											System.out.println("20XP REWARDED");
											int xp=n_hero.get(i-1).get_heroXP()+20;
											n_hero.get(i-1).set_heroXP(xp);
											int g1=n_hero.get(i-1).get_attack()+1;
											n_hero.get(i-1).set_attack(g1);
											int g2=n_hero.get(i-1).get_defence()+1;
											n_hero.get(i-1).set_defence(g2);
											n_hero.get(i-1).set_heroHP(100+newgain);
											newgain+=50;
											
											if(n_monster.get(rand1).get_monsterlevel()==1) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==2) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==3) {
												n_monster.get(rand1).set_monsterHP(200);
												n_monster.get(rand1).set_outof(200);
											}
											if(n_monster.get(rand1).get_monsterlevel()==4) {
												n_monster.get(rand1).set_monsterHP(250);
												n_monster.get(rand1).set_outof(250);
											}
											assign=0;
											t4=false;
											//t6=false;
											t5=false;
											break;
											}
											if(n_monster.get(rand1).get_monsterlevel()==4&&n_hero.get(i-1).get_heroXP()>40){
												System.out.println("YOU WIN THE GAME ALL MONSTERS ARE KILLED");
												t2=t3=t4=t5=t6=t7=t8=t9=t10=false;
												break;
											}
									}
								}
								if(q2==3) {
									count1+=4;
									//count2+=4;
									count3+=4;
									count4+=4;
									System.out.println("SPECIAL POWER ACTIVATED");
									System.out.println("PERFORMING SPECIAL ATTACK");
									if((i-1)==0) {
										int hp=n_hero.get(i-1).get_attack()+5;
										n_hero.get(i-1).set_attack(hp);
										int df=n_hero.get(i-1).get_defence()+5;
										n_hero.get(i-1).set_defence(df);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
										System.out.println("YOU HAVE STOLEN "+hp+"HP FROM THE MONSTER!");
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("MONSTER ATTACK");
										int def=attack-n_hero.get(i-1).get_defence();
										if(attack<n_hero.get(i-1).get_defence()) {
											def=0;
										}
										System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
										int h=n_hero.get(i-1).get_heroHP()-def;
										n_hero.get(i-1).set_heroHP(h);
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("SPECIAL POWER DEACTIVATED");
										assign+=1;
										if(n_hero.get(i-1).get_heroHP()<1) {
											System.out.println("YOU LOOSE THE GAME...");
											System.out.println("YOUR HP:"+0+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
											if(n_hero.get(i-1).get_heroXP()==0) {
												n_hero.get(i-1).set_heroHP(100);
												n_hero.get(i-1).set_houtof(100);
											}
											if(n_hero.get(i-1).get_heroXP()==20) {
												n_hero.get(i-1).set_heroHP(150);
												n_hero.get(i-1).set_houtof(150);
											}
											if(n_hero.get(i-1).get_heroXP()==40) {
												n_hero.get(i-1).set_heroHP(200);
												n_hero.get(i-1).set_houtof(200);
											}
											if(n_hero.get(i-1).get_heroXP()>40) {
												n_hero.get(i-1).set_heroHP(250);
												n_hero.get(i-1).set_houtof(250);
											}
											if(n_monster.get(rand1).get_monsterlevel()==1) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==2) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==3) {
												n_monster.get(rand1).set_monsterHP(200);
												n_monster.get(rand1).set_outof(200);
											}
											if(n_monster.get(rand1).get_monsterlevel()==4) {
												n_monster.get(rand1).set_monsterHP(250);
												n_monster.get(rand1).set_outof(250);
											}
											assign=0;
											t4=false;
											//t6=false;
											t5=false;
											break;
											}
										else if(n_monster.get(rand1).get_monsterHP()<1) {
											if(n_monster.get(rand1).get_monsterlevel()<4) {
												System.out.println("MONSTER KILLED!");
												System.out.println("20XP REWARDED");
												int xp=n_hero.get(i-1).get_heroXP()+20;
												n_hero.get(i-1).set_heroXP(xp);
												int g1=n_hero.get(i-1).get_attack()+1;
												n_hero.get(i-1).set_attack(g1);
												int g2=n_hero.get(i-1).get_defence()+1;
												n_hero.get(i-1).set_defence(g2);
												n_hero.get(i-1).set_heroHP(100+newgain);
												n_hero.get(i-1).set_houtof(100+newgain);
												newgain+=50;
												
												if(n_monster.get(rand1).get_monsterlevel()==1) {
													n_monster.get(rand1).set_monsterHP(100);
													n_monster.get(rand1).set_outof(100);
												}
												if(n_monster.get(rand1).get_monsterlevel()==2) {
													n_monster.get(rand1).set_monsterHP(100);
													n_monster.get(rand1).set_outof(100);
												}
												if(n_monster.get(rand1).get_monsterlevel()==3) {
													n_monster.get(rand1).set_monsterHP(200);
													n_monster.get(rand1).set_outof(200);
												}
												if(n_monster.get(rand1).get_monsterlevel()==4) {
													n_monster.get(rand1).set_monsterHP(250);
													n_monster.get(rand1).set_outof(250);
												}
												assign=0;
												t4=false;
												t5=false;
												break;
												}
											if(n_monster.get(rand1).get_monsterlevel()==4&&n_hero.get(i-1).get_heroXP()>40){
												System.out.println("YOU WIN THE GAME ALL MONSTERS ARE KILLED");
												t2=t3=t4=t5=t6=t7=t8=t9=t10=false;
												break;
											}
										}
										t0=false;
									}
									else if((i-1)==1) {
										int hp=(int)Math.ceil(n_monster.get(rand1).get_monsterHP()*0.30);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
										n_hero.get(i-1).set_heroHP(n_hero.get(i-1).get_heroHP()+hp);
										if(n_hero.get(i-1).get_heroHP()>100)
											n_hero.get(i-1).set_heroHP(100);
										System.out.println("YOU HAVE STOLEN "+hp+"HP FROM THE MONSTER!");
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("MONSTER ATTACK");
										int def=attack-n_hero.get(i-1).get_defence();
										if(attack<n_hero.get(i-1).get_defence()) {
											def=0;
										}
										System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
										int h=n_hero.get(i-1).get_heroHP()-def;
										n_hero.get(i-1).set_heroHP(h);
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("SPECIAL POWER DEACTIVATED");
										assign+=1;
										if(n_hero.get(i-1).get_heroHP()<1) {
											System.out.println("YOU LOOSE THE GAME...");
											System.out.println("YOUR HP:"+0+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
											if(n_hero.get(i-1).get_heroXP()==0) {
												n_hero.get(i-1).set_heroHP(100);
												n_hero.get(i-1).set_houtof(100);
											}
											if(n_hero.get(i-1).get_heroXP()==20) {
												n_hero.get(i-1).set_heroHP(150);
												n_hero.get(i-1).set_houtof(150);
											}
											if(n_hero.get(i-1).get_heroXP()==40) {
												n_hero.get(i-1).set_heroHP(200);
												n_hero.get(i-1).set_houtof(200);
											}
											if(n_hero.get(i-1).get_heroXP()>40) {
												n_hero.get(i-1).set_heroHP(250);
												n_hero.get(i-1).set_houtof(250);
											}
											if(n_monster.get(rand1).get_monsterlevel()==1) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==2) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==3) {
												n_monster.get(rand1).set_monsterHP(200);
												n_monster.get(rand1).set_outof(200);
											}
											if(n_monster.get(rand1).get_monsterlevel()==4) {
												n_monster.get(rand1).set_monsterHP(250);
												n_monster.get(rand1).set_outof(250);
											}
											assign=0;
											t4=false;
											t5=false;
											break;
											}
										else if(n_monster.get(rand1).get_monsterHP()<1) {
											if(n_monster.get(rand1).get_monsterlevel()<4) {
												System.out.println("MONSTER KILLED!");
												System.out.println("20XP REWARDED");
												int xp=n_hero.get(i-1).get_heroXP()+20;
												n_hero.get(i-1).set_heroXP(xp);
												int g1=n_hero.get(i-1).get_attack()+1;
												n_hero.get(i-1).set_attack(g1);
												int g2=n_hero.get(i-1).get_defence()+1;
												n_hero.get(i-1).set_defence(g2);
												n_hero.get(i-1).set_heroHP(100+newgain);
												n_hero.get(i-1).set_houtof(100+newgain);
												newgain+=50;
												
												if(n_monster.get(rand1).get_monsterlevel()==1) {
													n_monster.get(rand1).set_monsterHP(100);
													n_monster.get(rand1).set_outof(100);
												}
												if(n_monster.get(rand1).get_monsterlevel()==2) {
													n_monster.get(rand1).set_monsterHP(100);
													n_monster.get(rand1).set_outof(100);
												}
												if(n_monster.get(rand1).get_monsterlevel()==3) {
													n_monster.get(rand1).set_monsterHP(200);
													n_monster.get(rand1).set_outof(200);
												}
												if(n_monster.get(rand1).get_monsterlevel()==4) {
													n_monster.get(rand1).set_monsterHP(250);
													n_monster.get(rand1).set_outof(250);
												}
												assign=0;
												t4=false;
												t5=false;
												break;
												}
												if(n_monster.get(rand1).get_monsterlevel()==4&&n_hero.get(i-1).get_heroXP()>40){
													System.out.println("YOU WIN THE GAME ALL MONSTERS ARE KILLED");
													t2=t3=t4=t5=t6=t7=t8=t9=t10=false;
													break;
											}
										}
										t0=false;
									}
									else if((i-1)==2) {
										int hp=(int)Math.ceil(n_monster.get(rand1).get_monsterHP()*0.05);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
										System.out.println("YOU REDUCES OPPENENT HP BY "+hp+"!");
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("MONSTER ATTACK");
										int def=attack-n_hero.get(i-1).get_defence();
										if(attack<n_hero.get(i-1).get_defence()) {
											def=0;
										}
										System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
										int h=n_hero.get(i-1).get_heroHP()-def;
										n_hero.get(i-1).set_heroHP(h);
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("SPECIAL POWER DEACTIVATED");
										assign+=1;
										count3+=1;
										if(n_hero.get(i-1).get_heroHP()<1) {
											System.out.println("YOU LOOSE THE GAME...");
											System.out.println("YOUR HP:"+0+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
											if(n_hero.get(i-1).get_heroXP()==0) {
												n_hero.get(i-1).set_heroHP(100);
												n_hero.get(i-1).set_houtof(100);
											}
											if(n_hero.get(i-1).get_heroXP()==20) {
												n_hero.get(i-1).set_heroHP(150);
												n_hero.get(i-1).set_houtof(150);
											}
											if(n_hero.get(i-1).get_heroXP()==40) {
												n_hero.get(i-1).set_heroHP(200);
												n_hero.get(i-1).set_houtof(200);
											}
											if(n_hero.get(i-1).get_heroXP()>40) {
												n_hero.get(i-1).set_heroHP(250);
												n_hero.get(i-1).set_houtof(250);
											}
											if(n_monster.get(rand1).get_monsterlevel()==1) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==2) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==3) {
												n_monster.get(rand1).set_monsterHP(200);
												n_monster.get(rand1).set_outof(200);
											}
											if(n_monster.get(rand1).get_monsterlevel()==4) {
												n_monster.get(rand1).set_monsterHP(250);
												n_monster.get(rand1).set_outof(250);
											}
											assign=0;
											t4=false;
											//t6=false;
											t5=false;
											break;
											}
										else if(n_monster.get(rand1).get_monsterHP()<1) {
											if(n_monster.get(rand1).get_monsterlevel()<4) {
												System.out.println("MONSTER KILLED!");
												System.out.println("20XP REWARDED");
												int xp=n_hero.get(i-1).get_heroXP()+20;
												n_hero.get(i-1).set_heroXP(xp);
												int g1=n_hero.get(i-1).get_attack()+1;
												n_hero.get(i-1).set_attack(g1);
												int g2=n_hero.get(i-1).get_defence()+1;
												n_hero.get(i-1).set_defence(g2);
												n_hero.get(i-1).set_heroHP(100+newgain);
												n_hero.get(i-1).set_houtof(100+newgain);
												newgain+=50;
												
												if(n_monster.get(rand1).get_monsterlevel()==1) {
													n_monster.get(rand1).set_monsterHP(100);
													n_monster.get(rand1).set_outof(100);
												}
												if(n_monster.get(rand1).get_monsterlevel()==2) {
													n_monster.get(rand1).set_monsterHP(100);
													n_monster.get(rand1).set_outof(100);
												}
												if(n_monster.get(rand1).get_monsterlevel()==3) {
													n_monster.get(rand1).set_monsterHP(200);
													n_monster.get(rand1).set_outof(200);
												}
												if(n_monster.get(rand1).get_monsterlevel()==4) {
													n_monster.get(rand1).set_monsterHP(250);
													n_monster.get(rand1).set_outof(250);
												}
												assign=0;
												t4=false;
												//t6=false;
												t5=false;
												break;
												}
												if(n_monster.get(rand1).get_monsterlevel()==4&&n_hero.get(i-1).get_heroXP()>40){
													System.out.println("YOU WIN THE GAME ALL MONSTERS ARE KILLED");
													t2=t3=t4=t5=t6=t7=t8=t9=t10=false;
													break;
												}
											
										}
										t0=false;
									}
									else if((i-1)==3) {
										int hp=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.05);
										n_hero.get(i-1).set_heroHP(n_hero.get(i-1).get_heroHP()+hp);
										System.out.println("YOUR HP INCREASE BY "+hp+"!");
										
										
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("MONSTER ATTACK");
										int def=attack-n_hero.get(i-1).get_defence();
										if(attack<n_hero.get(i-1).get_defence()) {
											def=0;
										}
										System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
										int h=n_hero.get(i-1).get_heroHP()-def;
										n_hero.get(i-1).set_heroHP(h);
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("SPECIAL POWER DEACTIVATED");
										assign+=1;
										count4+=1;
										if(n_hero.get(i-1).get_heroHP()<1) {
											System.out.println("YOU LOOSE THE GAME...");
											System.out.println("YOUR HP:"+0+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
											if(n_hero.get(i-1).get_heroXP()==0) {
												n_hero.get(i-1).set_heroHP(100);
												n_hero.get(i-1).set_houtof(100);
											}
											if(n_hero.get(i-1).get_heroXP()==20) {
												n_hero.get(i-1).set_heroHP(150);
												n_hero.get(i-1).set_houtof(150);
											}
											if(n_hero.get(i-1).get_heroXP()==40) {
												n_hero.get(i-1).set_heroHP(200);
												n_hero.get(i-1).set_houtof(200);
											}
											if(n_hero.get(i-1).get_heroXP()>40) {
												n_hero.get(i-1).set_heroHP(250);
												n_hero.get(i-1).set_houtof(250);
											}
											if(n_monster.get(rand1).get_monsterlevel()==1) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==2) {
												n_monster.get(rand1).set_monsterHP(100);
												n_monster.get(rand1).set_outof(100);
											}
											if(n_monster.get(rand1).get_monsterlevel()==3) {
												n_monster.get(rand1).set_monsterHP(200);
												n_monster.get(rand1).set_outof(200);
											}
											if(n_monster.get(rand1).get_monsterlevel()==4) {
												n_monster.get(rand1).set_monsterHP(250);
												n_monster.get(rand1).set_outof(250);
											}
											assign=0;
											t4=false;
											t5=false;
											break;
											}
										else if(n_monster.get(rand1).get_monsterHP()<1) {
											if(n_monster.get(rand1).get_monsterlevel()<4) {
												System.out.println("MONSTER KILLED!");
												System.out.println("20XP REWARDED");
												int xp=n_hero.get(i-1).get_heroXP()+20;
												n_hero.get(i-1).set_heroXP(xp);
												int g1=n_hero.get(i-1).get_attack()+1;
												n_hero.get(i-1).set_attack(g1);
												int g2=n_hero.get(i-1).get_defence()+1;
												n_hero.get(i-1).set_defence(g2);
												n_hero.get(i-1).set_heroHP(100+newgain);
												newgain+=50;
												
												if(n_monster.get(rand1).get_monsterlevel()==1) {
													n_monster.get(rand1).set_monsterHP(100);
													n_monster.get(rand1).set_outof(100);
												}
												if(n_monster.get(rand1).get_monsterlevel()==2) {
													n_monster.get(rand1).set_monsterHP(100);
													n_monster.get(rand1).set_outof(100);
												}
												if(n_monster.get(rand1).get_monsterlevel()==3) {
													n_monster.get(rand1).set_monsterHP(200);
													n_monster.get(rand1).set_outof(200);
												}
												if(n_monster.get(rand1).get_monsterlevel()==4) {
													n_monster.get(rand1).set_monsterHP(250);
													n_monster.get(rand1).set_outof(250);
												}
												assign=0;
												t4=false;
												t5=false;
												break;
												}
												else if(n_monster.get(rand1).get_monsterlevel()==4&&n_hero.get(i-1).get_heroXP()>40){
													System.out.println("YOU WIN THE GAME ALL MONSTERS ARE KILLED");
													t2=t3=t4=t5=t6=t7=t8=t9=t10=false;
													break;
												}	
										}
										t0=false;
									}
								
								}
								
							}
							
						}
							t4=false;
						}
						
						}
						
					}
				}
			if(q1==3)
				t1=false;
			}
		}
	}
///////////////////////////////////////////////////////////////////////////