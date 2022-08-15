package javamon;

public class JavamonTest {
  
  public static boolean testDefaultGets(){
    Javamon j = new Javamon("Test1");
    if (j.getHealth() != 100)
      return false;
    if (j.getStrength() != 20)
      return false;
    if (j.getAccuracy() != .8)
      return false;
    if (!j.toString().equals("Test1 [100]"))
      return false;
    return true;
    
  }
  
  public static boolean testValidSetsAndGets(){
    Javamon j = new Javamon("Test2pre");
    j.setName("Test2");
    if(!j.getName().equals("Test2"))
      return false;
    j.setHealth(200);
    if (j.getHealth() != 200)
      return false;
    j.setStrength(1);
    if (j.getStrength() != 1)
      return false;
    j.setAccuracy(.5);
    if (j.getAccuracy() != .5)
      return false;
    if (!j.toString().equals("Test2 [200]"))
      return false;
    
    return true;
    
  }
  
  
  public static boolean testInvalidSetsAndGets(){
    Javamon j = new Javamon("Test3");
    j.setHealth(-1);
    if (j.getHealth() != 0)
      return false;
    j.setStrength(0);
    if (j.getStrength() != 1)
      return false;
    j.setAccuracy(.009);
    if (j.getAccuracy() != .01)
      return false;
    j.setAccuracy(1.1);
    if (j.getAccuracy() != 1.0)
      return false;
    if (!j.toString().equals("Test3 [0]"))
      return false;

    return true;
  }
  
  public static boolean testTakeDamageDefeated(){
    Javamon j = new Javamon("Test4");
    
    j.setHealth(10);
    j.takeDamage(9);
    if (j.isDefeated() || (j.getHealth() != 1))
      return false;
    j.setHealth(10);
    j.takeDamage(10);
    if (!j.isDefeated() || (j.getHealth() != 0))
      return false;
    j.setHealth(10);
    j.takeDamage(11);
    if (!j.isDefeated() || (j.getHealth() != 0))
      return false;
    
    return true;
  }
    
  public static void main(String[] args){
    if (testDefaultGets())
      System.out.println("PASSING: Constructor # 1/ Default data fields / Getters / toString.");
    else
      System.out.println("FAILING: Constructor #1 / Default data fields / Getters / toString.");
    
    if (testValidSetsAndGets())
      System.out.println("PASSING: Setters (valid inputs).");
    else
      System.out.println("FAILING: Setters (valid inputs).");
    
    if (testInvalidSetsAndGets())
      System.out.println("PASSING: Setters (handling invalid inputs).");
    else
      System.out.println("FAILING: Setters (handling invalid inputs).");
    
    if (testTakeDamageDefeated())
      System.out.println("PASSING: takeDamage / isDefeated.");
    else
      System.out.println("FAILING: takeDamage / isDefeated.");
    
  }
  
}