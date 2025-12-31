package chapter2.wrapper;

public class CustomInteger {
    // 1. 속성
    int value;

    // 2. 생성자
    CustomInteger(int value) {
        this.value = value;
    }

    // 3. 기능 - 자동으로 문자열으로 변환시켜 주는
    // toString() 오버라이딩 (값을 출력할 수 있도록)
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
