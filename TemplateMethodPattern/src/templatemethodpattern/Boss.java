package templatemethodpattern;

public class Boss extends Life {
    @Override
    public void work() {
        System.out.println("��Ա�����乤��");
    }
 
    @Override
    public void goToWork() {
        System.out.println("����ȥ");
    }
 
    @Override
    public void goToHome() {
        System.out.println("������");
    }
}
