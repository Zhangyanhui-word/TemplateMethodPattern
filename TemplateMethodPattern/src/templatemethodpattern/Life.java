package templatemethodpattern;

public abstract class Life {
	 
    private void getUp(){
        System.out.println("�����𴲣�");
    }
 
    public void oneDay(){
        getUp();
        goToWork();
        work();
        goToHome();
    }
 
    public void goToHome() {
    }
 
    public abstract void work();
 
    public void goToWork() {
    }
}
