public class Warrior extends Hero{
    public Warrior(int heroHealth, int heroAttack, String heroSuperAbility) {
        super(heroHealth, heroAttack, heroSuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил супер способность CRITICAL DAMAGE");
    }
}
