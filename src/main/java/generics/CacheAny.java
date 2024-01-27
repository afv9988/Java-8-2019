package generics;

import java.util.ArrayList;
import java.util.List;

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
    
    public List<?> otherListMethod(){
        if(this.t instanceof Integer){
            return new ArrayList<Integer>();
        }
        else if(this.t instanceof Float){
            return new ArrayList<Float>();
        }
        return new ArrayList<Double>();
    }
    
    public T get(){
        return this.t;
    }
}
