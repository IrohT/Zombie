public enum WeaponType{

    FIST("Okol", 5),
    KNIFE("Kes", 5),
    CROWBAR("Okol", 5),
    PISTOL("Okol", 5),

    SUBMACHINE_GUN("Gepfegyver", 60),
    ASSAULT_RIFLE("Gepkarabely",75),
    SHOTGUN("Soretes puska", 100);



    final String name;
    final float damage;

    public String getName() {
        return name;
    }

    public float getDamage() {
        return damage;
    }

    WeaponType(String name, float damage) {
        this.name = name;
        this.damage = damage;
    }
}
