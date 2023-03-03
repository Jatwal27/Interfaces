public class Main{
    public static void main(String[] args){
        pig animal1 = new pig();

        animal1.sleep();
    }
}

interface animal{
    public void animalSound();
    public void run();
}

class pig implements animal{
    public void animalSound(){
        System.out.println("Oink!");
    }
    public void sleep(){
        System.out.println("zzz");
    }
    public void run(){
        System.out.println("The pig is running.");
    }
}