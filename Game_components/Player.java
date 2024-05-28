package Game_components;

import javax.swing.ImageIcon;

public class Player {

    private int level;
    private int health;
    private int maxhealth;
    private int damage;
    private int attack;
    private int weak;
    public ImageIcon icon;

    public Player(int level, int health, int damage, int attack) {
        this.level = level;
        this.health = health;
        this.damage = damage;
        this.attack = attack;
        this.maxhealth = health;
    }

    public boolean isDebuffed() {
        return weak > 0;
    }

    public void loseDebuffTurn() {
        if (weak > 0) {
            weak--;
        }
    }

    public void setDebuffTurns(int i) {
        weak = i;
    }

    public int getDebuffTurns() {
        return weak;
    }

    public void setPhoto(String path) {
        icon = new ImageIcon(path);
    }

    public ImageIcon getPhoto() {
        return icon;
    }
    public void setLevel(int i) {
        this.level = i;
    }
    public void addLevel() {
        this.level++;
    }

    public void addHealth(int h) {
        this.health += h;
    }

    public void setHealth(int h) {
        this.health = h;
    }
    public void setDamage(int d) {
        this.damage = d;
    }

    public void resetDamage() {
        this.damage = 0;
    }

    public void addDamage(int d) {
        this.damage += d;
    }

    public void setMaxHealth(int h) {
        this.maxhealth = h;
    }

    public void setAttack(int a) {
        this.attack = a;
    }

    public void addMaxHealth(int h) {
        this.maxhealth += h;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getMaxHealth() {
        return this.maxhealth;
    }

    public String getName() {
        return "";
    }

}
