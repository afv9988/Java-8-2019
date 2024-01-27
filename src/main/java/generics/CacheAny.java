package generics;

/**
 *
 * @author AF
 */
public class CacheAny <T> {
    private T t;
    
    public void add(T t){
        this.t = t;
    }
    
    public int otherMethod(){
        if(this.t instanceof Integer){
            return ((Integer) this.t).intValue() + 100;
        }
        return 0;
    }
    
    public T get(){
        return this.t;
    }
}
