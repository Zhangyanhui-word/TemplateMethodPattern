package templatemethodpattern;

public class Worker extends Life {
    @Override
    public void work() {
        System.out.println("�ɻ�");
    }
 
    @Override
    public void goToWork() {
        System.out.println("������ȥ");
    }
 
    @Override
    public void goToHome() {
        System.out.println("��������");
    }
}
