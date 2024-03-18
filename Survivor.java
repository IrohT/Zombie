public class Survivor implements Attack{
    private String name;
    private WeaponType weapon;
    private int tier;
    private float health;


    public String getName() {
        return name;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public int getTier() {
        return tier;
    }

    public float getHealth() {
        return health;
    }


    public void setHealth(float health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "A nevem: " +name +
                ", A tulelo szintem:" + tier +
                ", Az okleimmel harcolok" +
                ", a maradek eletpontom=" + health;
    }




    public Survivor(String name, WeaponType weapon, int tier) {
        this.name = name;
        this.weapon = weapon;
        this.tier = tier;
    }



    @Override
    public float attack() {
        return 0;
    }

    public float repair(){
        return 10 * this.tier;
    }


}
