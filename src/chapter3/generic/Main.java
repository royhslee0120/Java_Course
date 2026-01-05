package chapter3.generic;

public class Main {

    static void main(String[] args) {
        // 1. 재사용 불가
        Box box1 = new Box(100);
//        new Box("ABC");
//        new Box(0.1);

        // 2. 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(100);

        // item을 활용하기 위해서는 down casting 필요
        String item = (String) strBox.getItem();
        System.out.println("item = " + item);

//        String item2 = (String) intBox.getItem(); 에러

        // 제네릭 활용
        // 1. 재사용성 보장(타입소거: T -> Object)
        GenericBox<String> strGBOx = new GenericBox<String>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<Integer>(100);
        GenericBox<Double> douGBox = new GenericBox<Double>(0.1);

        // 2. 타입 안정성 보장(타입소거: 자동으로 down casting 삽입)
        String strGBoxItem = (String) strGBOx.getItem();
        System.out.println("strGBoxItem = " + strGBoxItem);

        Integer intGBoxItem = (Integer) intGBox.getItem();
        System.out.println("intGBoxItem = " + intGBoxItem);

        Double douGBoxItem = (Double) douGBox.getItem();
        System.out.println("douGBoxItem = " + douGBoxItem);

        // 일반 메서드(String 기준으로 타입 소거 발생)
        strGBOx.printItem("ABC");
//        strGBOx.printItem(100);
//        strGBOx.printItem(0.1);

        // 제네릭 메서드(String과 상관 없음)
        strGBOx.printBoxItem("ABC");
        strGBOx.printBoxItem(100);
        strGBOx.printBoxItem(0.1);


    }

}
