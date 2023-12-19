package homework10;

//можно наследовать несколько интерфейсов
public abstract class TestClass implements TestInterface, TestInterface1{
    int c;
    //можно реализовать метод
    public void Hello() {
        System.out.println("Hellow");
    }
    @Override
    public void HelloWorld() {
        TestInterface.super.HelloWorld();
    }



    abstract void HelloMyWorld();
}
