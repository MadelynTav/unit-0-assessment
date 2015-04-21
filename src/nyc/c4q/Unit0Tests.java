package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests
{

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main(String args[])
    {
        // Use main to test your methods
        //printHelloWorld();
        bonusPrintOutSumOfFirstTenFibonacciNumbers();
        //System.out.println(returnStringUntilQ("Hello, chq"));
        //printSumOf1Upto10000UsingForLoop();
        //changeTuringsCityToPrinceton(declareAndReturnHashmapOfAlanTuringAndGraceHopper());
    }

    public static void printHelloWorld()
    {
        System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue()
    {
        boolean primBoolean = true;
        return primBoolean;
    }

    public static int returnPrimitiveInt1729()
    {
        int primInt = 1729;
        return primInt;
    }

    public static double returnPrimitiveDoubleThreePointOneFour()
    {
        double primDouble = 3.14;
        return primDouble;
    }

    public static char returnPrimitiveCharZ()
    {
        char z = 'Z';
        return z;
    }

    public static void printSumOf1Upto10UsingForLoop()
    {
        int sum = 0;
        for(int i = 0; i < 10; i++)
        {
            sum += i;

        }
        System.out.println(sum);
    }

    public static void printSumOf1Upto10000UsingForLoop()
    {
        int sum = 0;
        for(int i = 0; i < 10000; i++)
        {
            sum += i;

        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n)
    {
        boolean isOdd = false;
        if(n % 2 == 0)
        {
            return isOdd;
        }
        else return true;
    }

    public static boolean isMultipleOfThree(int n)
    {
        if(n % 3 == 0)
        {
            return true;
        }
        else return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n)
    {
        if(n % 3 == 0 && n % 2 != 0)
        {
            return true;
        }
        else return false;
    }

    public static String repeatStringXTimes(String input, int times)
    {

        String updated = "";
        if(times == 0)
        {
            updated += "";
        }
        for(int i = 0; i < times; i++)
        {
            updated += input;
        }

        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return updated;
    }

    public static String returnStringUntilQ(String input)
    {
        String updated = "";
        for(int i = 0; i < input.length(); i++)
        {
            if(input.contains("q"))
            {
                if(input.charAt(i) == 'q' || input.charAt(i) == 'Q')
                {
                    break;
                }
                else updated += input.charAt(i);
            }
            else updated = "";
            // Given string "input", return a string that stops at the first occurrence of the character 'q'.
            // For example, given the string "ubiquitous", return "ubi".
            // If the string does not contain a q, then return the empty string "".

        }
        return updated;
    }



    public static Person declareAndReturnPersonNamedAda()
    {
        Person ada=new Person("Ada");
      return ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon()
    {
        Person alanTuring=new Person();
        alanTuring.setName("Alan Turing");
        alanTuring.setCity("London");
      return alanTuring;
    }

    public static boolean isFromLondon(Person person)
    {
        if(person.getCity()==null){
            return false;
        }
        if(person==null){
            return false;
        }

        if (person.getCity().equalsIgnoreCase("london")){
     return true;
        }

        else
        return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces()
    {
        ArrayList<Place> threePlaces= new ArrayList<Place>();
        Place london=new Place();
        Place newYork=new Place();
        Place miami=new Place();

        threePlaces.add(london);
        threePlaces.add(newYork);
        threePlaces.add(miami);

        return threePlaces;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
     HashMap<String, Person> alanTuringAndGraceHopper=new HashMap<String, Person>();
        Person alanTuring=new Person();
        alanTuring.setName("Alan Turing");
        Person graceHopper=new Person();
        graceHopper.setName("Grace Hopper");
        alanTuring.setCity("London");
        graceHopper.setCity("Arlington");
        alanTuringAndGraceHopper.put(alanTuring.getName(),alanTuring);
        alanTuringAndGraceHopper.put(graceHopper.getName(),graceHopper);


      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
      return alanTuringAndGraceHopper;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people)
    {

        if (people.containsKey("Alan Turing")){
              people.get("Alan Turing").setCity("Princeton");
        }
    }




    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers()
    {
        int fiboNum1 = 0;
        int fiboNum2=1;
        int fiboLoop=0;

       // System.out.println(fiboNum1);
        //System.out.println(fiboNum2);

        for(int i = 0; i <= 10; i++)
                {
                    if(i==0){
                        fiboLoop=fiboNum1;
                    }
                    if(i==1){
                        fiboLoop=fiboNum2;
                    }
                    else
                    {
                        fiboLoop = fiboNum1 + fiboNum2;

                        fiboNum1 = fiboNum2;

                        fiboNum2 = fiboLoop;
                    }

            }
        System.out.println(fiboLoop);

        }


    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {
        int num1=0;
        int num2=1;
        int fibonacci=0;

        for (int i=0;i<=40;i++)
        {
            if(i == 0)
            {
                fibonacci = num1;
            }
            if(i == 1)
            {

                fibonacci = num2;
            }
            else
            {
                fibonacci = num1 + num2;
                num1 = num2;
                num2 = fibonacci;
            }
        }
        System.out.println(fibonacci);


    }
}
