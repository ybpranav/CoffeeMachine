

public class Espresso extends Coffee{
    int numberOfShots;
    public Espresso(String name,String roast,double price,int numberOfShots){
        super(name, roast, price);
        this.numberOfShots=numberOfShots;

    }
    public void printEspressoDetails(){
        System.out.println("You asked for "+numberOfShots+" servings! Every servings of "+name+ " costs " +
                price+" your total bill is "+numberOfShots*price);
    }
}

