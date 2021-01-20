package Week10.savingsclub;

import java.util.ArrayList;

public class SavingsClub {
    //class attributes
    private ArrayList<ClubMember> members = new ArrayList<>();
    private int totalContrib = 0;
    private int numberOfVouchers;

    //constructors
    public SavingsClub() {
    }

    //methods
    //This method add members to the list of club members
    public void addMember(ClubMember s) {
        members.add(s);
    }

    //This method print out list of club members
    public void printMembers() {
        System.out.println("--------------------------------");
        System.out.println("Members of the Savings Club: ");
        for (ClubMember s : members) {
            System.out.println(s);
        }
    }

    //This method calculate and display total contributions
    //made by all club members
    public void calculateTotalContrib() {
        System.out.println("--------------------------------");
        for (ClubMember s : members) {
            totalContrib += s.getContribution();
        }
        System.out.println("Total contributions made by " +
                "members is: £" + totalContrib);

    }

    //This method calculate how many vouchers can be bought by
    // club
    public void getNumberOfVouchers() {
        System.out.println("--------------------------------");
        numberOfVouchers = totalContrib / 20;
        if(numberOfVouchers > 1){
            System.out.println(numberOfVouchers +
                    " vouchers can be bought by " +
                    "Savings Club");
        } else if(numberOfVouchers == 1){
            System.out.println(numberOfVouchers +
                    " voucher can be bought by " +
                    "Savings Club");
        }else {
            System.out.println("Club can't afford to " +
                    "buy vouchers");
        }
    }

    //main method
    public static void main(String[] args) {

        SavingsClub mem = new SavingsClub();

        //Creating new members
        ClubMember steve = new ClubMember("Steve", 21);
        if(steve.addContribution(-10)){
            System.out.println("Error in deposit");
        }else{
            System.out.println("Contribution made by " +
                    steve.getName() + " accepted");
        }
        ClubMember ilias = new ClubMember("Ilias", 27);
        if(ilias.addContribution(-10)){
            System.out.println("Error in deposit");
        }else{
            System.out.println("Contribution made by " +
                    ilias.getName() + " accepted");
        }
        ClubMember rubiya = new ClubMember("Rubiya", 20);
        if(rubiya.addContribution(-10)){
            System.out.println("Error in deposit");
        }else{
            System.out.println("Contribution made by " +
                    rubiya.getName() + " accepted");
        }
        ClubMember kevin = new ClubMember("Kevin", 28);
        if(kevin.addContribution(-10)){
            System.out.println("Error in deposit");
        }else{
            System.out.println("Contribution made by " +
                    kevin.getName() + " accepted");
        }

        //Add members to the ArrayList
        mem.addMember(steve);
        mem.addMember(ilias);
        mem.addMember(rubiya);
        mem.addMember(kevin);

        //Displaying data
        mem.printMembers();
        mem.calculateTotalContrib();
        mem.getNumberOfVouchers();


    }
}