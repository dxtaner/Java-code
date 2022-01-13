public class Fighter {
    String name;
    int damage;
    int weight;
    int health;
    double dodge;

    public Fighter(String name, int damage, int weight, int health, double dodge) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        if(dodge>10 && dodge<=50){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }
    }

    public int hit(Fighter foe){
        System.out.println("**********************");
        System.out.println(this.name+"=>" + foe.name + " " + this.damage + " hasar ile vurdu");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasari savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;

    }

    private boolean dodge() {
        double randomValue = Math.random() * 50;
        return randomValue <= this.dodge;
    }
}
