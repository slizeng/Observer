package TemplateMethod;

public class ConcreteWingkDog1 extends AbstractWingkDog {
    @Override
    public void getPeople() {
        System.out.print("强哥");
    }

    @Override
    public void getDog() {
        System.out.print("曾超伟");
    }
}


