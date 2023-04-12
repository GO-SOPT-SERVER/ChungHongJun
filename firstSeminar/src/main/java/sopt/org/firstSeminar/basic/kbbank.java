package sopt.org.firstSeminar.basic;
//kbbank라는 클래스는 bank라는 인터페이스를 상속 받음
//클래스가 인터페이스를 상속받기 때문에 implements 사용
//추상클래스를 상속받기 떄문에 kbbank는 해당 함수의 구현을 강제 받는다.
public class kbbank implements bank{
    @Override
    public void withDraw(int price) {
        System.out.print("KB은행만의 인출 로직...");
        if(price < bank.MAX_INTEGER){
            System.out.println(price+" 원을 인출한다.");
        }else{
            System.out.println(price+" 원을 인출실패.");
        }
    }

    @Override
    public void deposit(int price) {
        System.out.println("KB은행만의 입금 로직..."+price+" 원을 입금한다.");
    }
}
