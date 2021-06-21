package templatemethodpattern;

public abstract class Life {
	 
    private void getUp(){
        System.out.println("ÔçÉÏÆð´²£¡");
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
