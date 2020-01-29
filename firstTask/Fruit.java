package firstTask;

public abstract class Fruit   {
     public abstract float getWeight();
}

class Apple extends Fruit {
    @Override
    public float getWeight(){
        return 1.0f;
    }
}

class Orange extends Fruit {
    @Override
    public float getWeight(){
        return 1.5f;
    }
}
