/**
 * Created by DNS PC on 03.11.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Barsik");
        animals[1] = new Dog("Bobic");
        animals[2] = new Duck("Donald");
        animals[3] = new Horse("Mary");
       Obstacle[] obs = new Obstacle[3];
        obs[0] = new OWater(30);
        obs[1] = new OCross(500);
        obs[2] = new OJump(0.8f);

        for(Animal a : animals){
            for(Obstacle o : obs){
                o.doIt(a);
                if(!a.isOnDistance()) break;
            }
        }

        for (int i = 0; i < animals.length; i++) {
            if(animals[i].isOnDistance()){
                System.out.println(animals[i].getName()+" WIN");
            }
        }







    }
}
