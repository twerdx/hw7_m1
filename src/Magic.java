public class Magic extends Hero{
    public Magic(int heroHealth, int heroAttack, String heroSuperAbility) {
        super(heroHealth, heroAttack, heroSuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил супер способность MAGICAL DAMAGE");
    }
}
