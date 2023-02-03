public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(800);
        boss.setBossAttack(50);
        boss.setBossProtection("Conventional");

        System.out.println("Boss HP: " + boss.getBossHealth());
        System.out.println("Boss attack: " + boss.getBossAttack());
        System.out.println("Boss protection: " + boss.getBossProtection());
    }
}