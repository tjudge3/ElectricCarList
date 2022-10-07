//22-09-17 tjudge Lab3a
import java.util.*;

public class ElectricCarList {

    ArrayList<String> carModels = new ArrayList<String>();
    ArrayList<ElectricCar> carList = new ArrayList<>();

    class ElectricCar {
        String modelName;
        double mfgPrice;
        int maxRange;
        double usNewsRating; // 1.0-10.0
        int rank;

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public double getMfgPrice() {
            return mfgPrice;
        }

        public void setMfgPrice(double mfgPrice) {
            this.mfgPrice = mfgPrice;
        }

        public int getMaxRange() {
            return maxRange;
        }

        public void setMaxRange(int maxRange) {
            this.maxRange = maxRange;
        }

        public double getUsNewsRating() {
            return usNewsRating;
        }

        public void setUsNewsRating(double usNewsRating) {
            this.usNewsRating = usNewsRating;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public ElectricCar(String modelName, double mfgPrice, int maxRange, double usNewsRating, int rank) {
            this.modelName = modelName;
            this.mfgPrice = mfgPrice;
            this.maxRange = maxRange;
            this.usNewsRating = usNewsRating;
            this.rank = rank;

        }


        @Override
        public String toString() {
            return "Model:" + modelName +
                    " MfgPrice: " + String.format("$%.2f", mfgPrice) +
                    " MaxRange: " + maxRange +
                    " Rating: " + usNewsRating +
                    " Rank: " + rank +
                    '}';
        }

 //       public int compareTo(ElectricCar o) {
 //           return 0;
//        }

    }

    public void addCars() {
        carList.add(new ElectricCar("2022 Chevrolet Bolt", 31500, 259, 8.4,1));
        carList.add(new ElectricCar("2023 Nissan Leaf", 27800, 212, 7.4,2));
        carList.add(new ElectricCar("2023 MINI Electric Hardtop", 33900, 114, 7.2,3));
    }



    public void printCars() {
        for (ElectricCar car:carList ){
            System.out.println(car);
        }

    }
/*
Do comparator if time permits
    public static Comparator<ElectricCar> rangeComparator = new Comparator<ElectricCar>() {

        @Override
        public int compare(ElectricCar e1, ElectricCar e2) {
            return 0;
        }

        public int compare(ElectricCar e1, ElectricCarList e2) {
            return (int) (e1.getMaxRange() - e2.getMaxRange());
        }
    };

    private int getMaxRange() {
        return 0;
    }
*/

    public static void main(String[] args){
        ElectricCarList carTest = new ElectricCarList();
        carTest.addCars();
        carTest.printCars();
    }

}


