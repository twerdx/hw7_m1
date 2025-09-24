//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Warrior(300, 50, "Critical Damage"),
                new Magic(250, 70, "Fireball"),
                new Medic(200, 20, "Healing", 50)
        };
        for (Hero hero : heroes){
            hero.applySuperAbility();
            if (hero instanceof Medic){
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}