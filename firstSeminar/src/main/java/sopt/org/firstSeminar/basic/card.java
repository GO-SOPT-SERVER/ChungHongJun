package sopt.org.firstSeminar.basic;
//추상클래스
public abstract class card {
    String bankCompany;
    int cardNumber;
    String name;

    public card(String bankCompany,int cardNumber, String name){
        this.bankCompany = bankCompany;
        this.cardNumber = cardNumber;
        this.name = name;
    }

    public void isVip() {
        System.out.println("welcome,VIP");
    }

    public abstract void sayThank();
}

class Kakaocard extends card{
    //이 부분에서 밑의 코드가 생겨야만 하는 이유가 뭘까요....?
    public Kakaocard(String bankCompany, int cardNumber, String name) {
        super(bankCompany, cardNumber, name);
    }

    @Override
    public void isVip() {
        super.isVip();
    }
    @Override
    public void sayThank() {
        System.out.println("Thank you!");
    }

    public void checkNumber(){
        System.out.println(cardNumber);
    }
}