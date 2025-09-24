public class Medic extends Hero{
    private int healPoints;
    public Medic(int heroHealth, int heroAttack, String heroSuperAbility, int healPoints) {
        super(heroHealth, heroAttack, heroSuperAbility);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }
    public void increaseExperience(){
        healPoints+=healPoints*0.1;

    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HEALING");

    }

}
