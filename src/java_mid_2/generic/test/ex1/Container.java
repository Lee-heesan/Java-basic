package java_mid_2.generic.test.ex1;

public class Container <T>{

    private T value;

    public Container() {
    }

    public boolean isEmpty(){
        if(value==null){
            return true;
        }else{
            return false;
        }
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
