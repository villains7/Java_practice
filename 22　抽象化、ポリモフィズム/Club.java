public abstract class Club {
    private String name;

    public Club(String name){
        this.name = name;
    }

    public void display() {
        System.out.println("������ :" + name);
    }

    public abstract void practice();
}