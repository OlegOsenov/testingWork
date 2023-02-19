package GB_metodichka_11_2;

public class TestGeneric<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public TestGeneric(T obj) {
        this.obj = obj;
    }

    private void showType(){
        System.out.println("Тип Т: " + obj.getClass().getName());
    }
}
