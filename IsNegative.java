//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public class IsNegative implements Predicate<Integer>{

  public boolean eval(Integer n){
    boolean something = n.intValue()<0;
    return something;
  }
}
