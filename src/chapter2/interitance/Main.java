package chapter2.interitance;

public class Main {
    static void main() {
        Child child = new Child();
        System.out.println("가문이름: " + child.familyName);
        System.out.println("명예: " +child.honor);
        child.introduceFamily();
        child.superTest();
        child.showSocialMedia();

    }
}
