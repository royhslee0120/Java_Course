package chapter2.capsulation;

public class Main {

    static void main() {

        // 생성자 호출
        Person person = new Person("gygim");

        // 인스턴스 변수 접근
//        person.name = "gygim";
//        person.secret = "??";

        // 인스턴스 메서드 접근
//        person.methodA();
//        person.methodB();

        // 게터
        String name = person.getName();
        System.out.println("이름: " + name);

        // 세터
        person.setName("steve");
        String name2 = person.getName();
        System.out.println("이름: " + name2);


    }
}
