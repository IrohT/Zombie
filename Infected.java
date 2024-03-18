public abstract class Infected implements Attack {
    private float damage;
    private float speed;
    private float health;
    private int angerCountDown;
    private boolean angry;

    public float getDamage() {
        return damage;
    }

    public float getSpeed() {
        return speed;
    }

    public float getHealth() {
        return health;
    }

    public int getAngerCountDown() {
        return angerCountDown;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setAngerCountDown(int angerCountDown) {
        this.angerCountDown = angerCountDown;
    }

    public void setAngry(boolean angry) {
        this.angry = angry;
    }


    @Override
    public String toString() {
        return "Fertőzött tipusa:" + this.getClass() +
                "Alap sebzese: " + damage +
                ", Sebessege: " + speed +
                ", Meglevo eletpontja: " + health;
    }

    public Infected(float damage, float speed, float health) {
        this.damage = damage;
        this.speed = speed;
        this.health = health;
    }

    public abstract void chargeAnger();

    public abstract void recalculateSpeed();

    public void updateTimer(){
        if(angerCountDown == 0){
            this.angry = isAngry();
        }
        else {
            angerCountDown--;
        }
    }

    public boolean isAngry(){
        return true;

    }
}

