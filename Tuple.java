//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public class Tuple<E>{

  private int size;
  private E[] element;

  public Tuple(int n){
    size = 0;
    element = (E[]) new Object[n];
  }
  public boolean add(E elem){
    boolean something = true;

    if(size<element.length){
      element[size] = elem;
      size++;
      something = true;
    }
    else{
      something = false;
    }

    return something;
  }

  public int count(Predicate<E> p){
    int n = 0;
    for(int i = 0;i<size;i++){
      if(p.eval(element[i])){
        n++;
      }
    }

    return n;
  }

}
