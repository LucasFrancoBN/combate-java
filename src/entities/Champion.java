package entities;

public class Champion {
  private String name;
  private int life;
  private int attack;
  private int armor;

  public Champion(String name, int life, int attack, int armor) {
    this.name = name;
    this.life = life;
    this.attack = attack;
    this.armor = armor;
  }

  public void takeDamage(Champion other) {
    int damage = other.attack - this.armor > 0 ? other.attack - this.armor : 1;
    int remainingLife = life - damage > 0 ? life - damage : 0;
    setLife(remainingLife);
  }

  public String status() {
    return life > 0 ? String.format("%s: %d de vida", name, life) : String.format("%s: %d de vida (morreu)", name, life);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLife() {
    return life;
  }

  public void setLife(int life) {
    this.life = life;
  }

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  public int getArmor() {
    return armor;
  }

  public void setArmor(int armor) {
    this.armor = armor;
  }
}
