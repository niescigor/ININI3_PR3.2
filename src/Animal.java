public class Animal {
        String species;
        String name;
        Double weight;
        Boolean alive;

    public Animal(String species, String name, Double weight, Boolean alive) {
        this.species = species;
        this.name = name;
        this.weight = 3.0;
        this.alive = true;

        }

        public void feed () {
            this.weight += 0.5;
            System.out.println("halo policja");
        }

        public void takeForAWalk () {
            this.weight -= 0.5;
            System.out.println("dzięki za spacer");

            if (this.weight <= 0) {
                this.alive = false;
                System.out.println("nie no świetny spacer, kolejnego nie będzie");
            }
        }



    }


