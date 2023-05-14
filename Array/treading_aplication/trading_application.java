//package trading_application;

import java.util.*;

public class trading_application {
    static double balance=50000.00;
    static int bitcoin_stock=500;
    static int Etherium_stock=800;
    static int cubercoin_stock=200;

    static Scanner sc=new Scanner(System.in);
     static HashMap<String, Double>balanceHistory   = new HashMap<>();
  // static List< Double> balanceHistory = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("Welcome to my treading application");

        while(true){
            System.out.println("\nwhat would you like to do");
            System.out.println("press 1 : check balance");
            System.out.println("press 2 : buy crypto");
            System.out.println("press 3 : sell crypto");
            System.out.println("press 4 :deposit");
            System.out.println("press 5 :withdraw");
            System.out.println("press 6 :balance History");
            System.out.println("press 7 : Exit");

            System.out.println("\nEnter your choice");

            int choice=sc.nextInt();

            switch(choice){
                case 1 :
                    checkbalance();
                    break;
                case 2 :
                    buycrypto();
                    break;
                case 3 :
                    sellcrypto();
                    break;
                case 4 :
                    deposite();
                    break;
                case 5 :
                    withdraw();
                    break;
                case 6 :
                    balance_history();
                    break;
                case 7 :
                    System.out.println("\nthank you for using the trading application");
                    System.exit(0);
                    break;
                default :
                    System.out.println("invalid choice !\n please try again");
                    break;
            }
        }

    }
       static void checkbalance(){

                  System.out.println("balance :"+balance);
    }


       static void buycrypto(){
        System.out.println("\n which crypto would you like to buy");
        System.out.println("press 1 : bitcoin");
        System.out.println("press 2 : ethereum");
        System.out.println("press 3 : cubercoin");

        int choice=sc.nextInt();

        switch(choice){
            case 1 :  System.out.println("\n bitcoin price : 800 per unite");
                System.out.println("how many stock of bitcoin whould  you like  to buy");
                int bitcoinUnit=sc.nextInt();
                double bitcoinCost=bitcoinUnit*800;

                if(bitcoinCost > balance){
                    System.out.println("you don't have enough balance to by "+ bitcoinUnit +"stock of bitcoin");
                }else{
                    if(bitcoinUnit > bitcoin_stock){
                        System.out.println("bitcoin stock is out of stock");
                    }else{
                        bitcoin_stock -= bitcoinUnit;
                        balance -= bitcoinCost;
                        System.out.println("\nyou have bought "+bitcoinUnit+" stock of bitcoin");
                    }
                }
                break;
            case 2 : System.out.println("\n ethereum price : 650 per unit");
                System.out.println("how many stock of ethereum would you like to buy");
                int ethriumUnit=sc.nextInt();
                double etheriumCost=ethriumUnit * 650;

                if(etheriumCost > balance){
                    System.out.println("you don't have enough balaance to by "+ ethriumUnit +"stock of ethereum");
                }else{
                    if(ethriumUnit > Etherium_stock){
                        System.out.println("ethereum stock is out of stock");
                    }else{
                        Etherium_stock -= ethriumUnit;
                        balance -= etheriumCost;
                        System.out.println("\nyou have bought"+ethriumUnit+"stock of ethereum");
                    }
                }
                break;
            case 3 : System.out.println("\n cubercoin price : 1000 per unit");
                System.out.println("how many stock of cubercoin would you like to buy");
                int cubercoinUnit=sc.nextInt();
                double cubercoinCost=cubercoinUnit * 1000;

                if(cubercoinCost > balance){
                    System.out.println("you don't have enough balance to by "+ cubercoinUnit +"stock of cubercoin");
                }else{
                    if(cubercoinUnit > cubercoin_stock){
                        System.out.println("cubercoin stock is out of stock");
                    }else{
                        cubercoin_stock -= cubercoinUnit;
                        balance -= cubercoinCost;
                        System.out.println("\nyou have bought"+cubercoinUnit+"stock of cubercoin");
                    }
                }
                break;
            default :
                System.out.println("\nInvalid choice!\nplease try again");
                break;

        }
        balanceHistory.put("buycrypto :",balance);
    }

    static void sellcrypto() {
        System.out.println("\nWhich crypto would you like to sell?");
        System.out.println("Press 1: Bitcoin");
        System.out.println("Press 2: Ethereum");
        System.out.println("Press 3: Cubercoin");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nBitcoin price: $800 per unit");
                System.out.println("How many units of Bitcoin would you like to sell?");
                int bitcoinUnits = sc.nextInt();
                double bitcoinCost = bitcoinUnits * 800.00;
                if (bitcoinUnits > bitcoin_stock) {
                    System.out.println("\nYou don't have enough Bitcoin units to sell");
                } else {
                    bitcoin_stock -= bitcoinUnits;
                    balance += bitcoinCost;
                    System.out.println("\nYou have sold " + bitcoinUnits + " units of Bitcoin for $" + bitcoinCost);
                }
                break;
            case 2:
                System.out.println("\nEthereum price: $650 per unit");
                System.out.println("How many units of Ethereum would you like to sell?");
                int etheriumUnits = sc.nextInt();
                double etheriumCost = etheriumUnits * 650.00;
                if (etheriumUnits >  Etherium_stock) {
                    System.out.println("\nYou don't have enough Ethereum units to sell");
                } else {
                    Etherium_stock -= etheriumUnits;
                    balance += etheriumCost;
                    System.out.println("\nYou have sold " + etheriumUnits + " units of Ethereum for $" + etheriumCost);
                }
                break;
            case 3:
                System.out.println("\nCubercoin price: $1000 per unit");
                System.out.println("How many units of Cubercoin would you like to sell?");
                int cubercoinUnits = sc.nextInt();
                double cubercoinCost = cubercoinUnits * 1000.00;
                if (cubercoinUnits > cubercoin_stock) {
                    System.out.println("\nYou don't have enough Cubercoin units to sell");
                } else {
                    cubercoin_stock -= cubercoinUnits;
                    balance += cubercoinCost;
                    System.out.println("\nYou have sold " + cubercoinUnits + " units of Cubercoin for $" + cubercoinCost);
                }
                break;
            default:
                System.out.println("Invalid choice!\nPlease try again");
                break;
        }
        balanceHistory.put("sellcrypto",balance);
    }

    static void deposite(){
        System.out.println("\n how much would you like to deposit");
        double amount=sc.nextDouble();

        if(amount<=0){
            System.out.println("\nplease enter the positive value");
        }else{
            balance+=amount;
            System.out.println("\n $"+amount+"deposit in your account");
            balanceHistory.put("deposit",amount);
        }
    }

    static void withdraw(){
        System.out.println("\n how much would you like to withdraw");
        double amount =sc.nextDouble();

        if(amount > balance){
            System.out.println("\ninsufficient balance");
        }else{
            balance-=amount;
            System.out.println("\n $"+amount+"withdraw from your account");
            balanceHistory.put("withdraw",amount);
        }

    }

    static void balance_history() {
        if (balanceHistory.isEmpty()) {
            System.out.println("\nYou have no balance history.");
        } else {
            System.out.println("\nBalance history:");
            for (int i = 0; i < balanceHistory.size(); i++) {
                System.out.println(Arrays.asList(balanceHistory));
            }
        }
    }
}


