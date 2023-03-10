package GB_metodichka_11_3;

public class TwoGen<T, V> {

    private T obj1;
    private V obj2;

    public TwoGen(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void showTypes(){
        System.out.println("Тип Т:  " + obj1.getClass().getName());
        System.out.println("Тип V:  " + obj2.getClass().getName());
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }
}
