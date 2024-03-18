public class Zombie extends Infected{


    public Zombie() {
        super(10, 1, 100);
    }

    @Override
    public float attack() {
        if (this.isAngry()){
            return 2*(getDamage() * getSpeed());
        }
        else{
            return getDamage()*getSpeed();
        }
    }

    public void chargeAnger(){

    }

    public void recalculateSpeed(){

    }


}

