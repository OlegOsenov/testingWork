package GB_metodichka_11_HomeTest_1;

public class Test {

    public static void main(String[] args) {

        FruitBox<Apple> appleFruitBox = new FruitBox<>(new Apple(),new Apple(),new Apple());

        FruitBox<Orange> orangeFruitBox = new FruitBox<>(new Orange(),new Orange());

        System.out.println(appleFruitBox.equalsByWeight(orangeFruitBox));

        FruitBox<Orange> orangeFruitBox1 = new FruitBox<>(new Orange());

        System.out.println(orangeFruitBox.getWeight());
        orangeFruitBox.tranceferAll(orangeFruitBox1);
        System.out.println(orangeFruitBox1.getWeight());
        System.out.println(orangeFruitBox.getWeight());


    }


}
