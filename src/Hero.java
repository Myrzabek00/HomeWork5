public class Hero {
    private int heroHealth;
    private int heroAttack;
    private String heroSuperSkill;

    public Hero(int heroHealth, int heroAttack, String heroSuperSkill) {
        this.heroHealth = heroHealth;
        this.heroAttack = heroAttack;
        this.heroSuperSkill = heroSuperSkill;
    }

    public Hero(int heroHealth, int heroAttack) {
        this.heroHealth = heroHealth;
        this.heroAttack = heroAttack;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroAttack() {
        return heroAttack;
    }

    public String getHeroSuperSkill() {
        return heroSuperSkill;
    }
}
