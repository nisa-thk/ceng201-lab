package sengLab8;

public class TestBuilding {
	public static void main(String[] args) {​
        Room room = new Room("Guest Room", 3, 40);​
        Building building = new Building("Blue Hotel", room, 50);​
        System.out.println("Total area of Blue Hotel: " + building.getTotalArea());​
​
        Owner [] owner_list= new Owner[2];​
        owner_list[0]=new Owner("Ali", 123);​
        owner_list[1]=new Owner("Zeynep", 456);​
        Building b2=new Building(" Hotel XYZ", room, 25, owner_list);​
        b2.DisplayAllOwners();​
​
        System.out.println("Owner name: " + b2.getOwners()[0].getName() + " Date: " + b2.getOwners()[0].getDate());​
​
        Owner [] owners2=b2.getOwners();​
        System.out.println("Owner name: " + owners2[1].getName() + " Date: " + owners2[1].getDate());​
​
    }​
}​


