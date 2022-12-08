
Exercise 1: 
Visit the  Website.Links to an external site.

Create a new IntelliJ project called ElectricCarsList and add an empty public static void main method. 

a.  Create an ArrayList<String> and create a method to populate your String array by adding the  Model Names to an ArrayList<String> (ArrayList of type String in order of ratings.  Create a method to print your results.  Call your methods from main to populate and print your results.  

b.  Now let's add more information to make your list more interesting by following the instructions below to  print out your revised list:     

Step 1:  Add an internal class to your ElectricalCars class something like the following;  
public class ElectricCarList {

ArrayList<String> carModels = new ArrayList<>();
ArrayList<ElectricCar> carList = new ArrayList<>();

class ElectricCar {
String modelName;
double mfgPrice;
int maxRange;
double usNewsRating; // 1.0-10.0
int rank;
}}

 Step 2:  From inside your Electric Car class code in the IntelliJ editor,  right-mouse-click in the IntelliJ editor and select the Generate menu item (or press Alt-Insert).  Generate getters for all attributes.  Right-mouse-click and select Generate again and create a Constructor.  Call Generate again and create a toString method.   Your ElectricCar class should now have getters for all attributes, a toString()  method that you can call to list the names and values of all the attributes, and a Constructor for populating the class object. 

Step 3:  Add a method to  ElectricCarList to populate your ArrayList<ElectricCar>. The first line of your method should look something like this:  

public void addCars() {
    carList.add(new ElectricCar("2020 Tesla Model S", 74990, 402, 9.0,1));
    //  You add code to add the other cars to your list
 }
Step 4:   Add a printList() method to your ElectricCarList,  then add something like the following to your main method;  
 public static void main(String[] args) {
        //  Create a car list, populate, and print it out
        ElectricCarList cars = new ElectricCarList();
         cars.addCars();
        cars.printList();

    }
}
Congratulations! You are well on your way to a lucrative new career writing top 10 websites! 
