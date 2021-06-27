
interface Birds{

   public void eat();
    public void sleep();
    public void walk();
}
interface flyer extends Birds{
    public void fly();
}
class Penguin implements Birds{

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Penguin is sleeping");
    }
    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }

}
class Parrot implements flyer{
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");
    } 
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
    public static void main(String args[]){
        Penguin pg=new Penguin();
        pg.walk();
        Parrot p=new Parrot();
        p.fly();
    }
}

