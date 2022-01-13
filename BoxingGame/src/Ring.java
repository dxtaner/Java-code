public class Ring {
    Fighter figther1;
    Fighter figther2;
    int maxWeight;
    int minWeight;

    public Ring(Fighter figther1, Fighter figther2, int maxWeight, int minWeight) {
        this.figther1 = figther1;
        this.figther2 = figther2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (figther1.health > 0 && figther2.health > 0) {
                System.out.println("************** NEW ROUND *************");
                figther2.health = figther1.hit(figther2);
                if (isWin()){
                    break;
                }
                figther1.health = figther2.hit(figther1);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları eşit olmalıdır.");
        }


    }

    private boolean isWin() {
        if (figther1.health == 0) {
            System.out.println("Winner : " + figther2.name);
            return true;
        } else if (figther2.health == 0){
            System.out.println("Winner : " + figther1.name);
            return true;
        }

        return false;
    }

    private boolean checkWeight() {
        return (figther1.weight >= minWeight && figther1.weight <= maxWeight) && (figther2.weight >= minWeight && figther2.weight <= maxWeight);
    }

    public void printScore() {
        System.out.println("-***********-");
        System.out.println(figther1.name + " Health \t:" + figther1.health);
        System.out.println(figther2.name + " Health \t:" + figther2.health);
    }

}
