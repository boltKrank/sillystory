import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

class Sillystory {


    /**
     * Story examples placed here, tags for NOUNS, VERBS, ADJECTIVES, ADVERBS, etc.
     * 
     * As <NAME1> came riding into town on their horse, they knew something was <ADJ9>. He could smell something he hadn't smelt in a long time.
     * It was <NOUN3>. This could only mean one thing, Captain <NOUN3> was in town.
     * 
     * <NAME1> knew they had to do something. He looked through his bag. In it, he found a picture of his true love <NAME2>, as well as some letters sent from <NAME3>.
     * But most important of all he found his <NOUN1>, hiding behind a <NOUN2>.
     * 
     * He picked up his <NOUN1> which was a little <ADJ1> and <ADJ2>, but that was OK, because he could always put it in his <NOUN2>. 
     * 
     * So, with his <NOUN1> in his <NOUN2> he went off to find Captain <NOUN3>.
     * 
     * <NAME1> found Captain <NOUN3> very soon, becaue the smell of <NOUN3> reminded him of <NOUN4>s.
     * 
     * <NAME1> was surprised when he first saw Captain <NOUN3> because Captain <NOUN3> was actually very <ADJ3>. <NAME1> thought that Captain <NOUN3> would be more <ADJ4>.
     * 
     * But there was no time to lose, <NAME1> had to move fast, in order to save <NAME2> from Captain <NOUN3>'s boss, Master <NOUN4> the most <ADJ5> in the world.
     * 
     * <NAME1> grabbed his secret weapon, his <NOUN5> and used it to <VERB1> Captain <NOUN3> in the <NOUN6>. Captain <NOUN3> was feeling very <FEEL1>.
     * 
     * Next <NAME1> went on to see Master <NOUN4> at the <PLACE1>. It was a very <ADJ6> place, with a lot of <NOUN7>s. <NAME1> felt very <FEEL2>, but felt better when he saw 
     * picture of <NAME4>.... Wait ?! who was he looking for ?
     * 
     * He got a tap on the shoulder, it was <NAME5> coming all the way from <PLACE1> with a very <ADJ7> <NOUN8>, saying "<NAME1>!!! You forgot your <NOUN9>, it's a really <ADJ8> <NOUN9>
     * 
     * So <NAME1> took his <ADJ8> <NOUN9> to <PLACE2> where Master <NOUN4> was waiting...
     * 
     * What happens next ?
     * 
     * To be <VERB2>....
     * 
     * I mean, to be continued....
     * 
     *
     * Variables:
     * 
     * <NAME1>
     * <NAME2>
     * <NAME3>
     * 
     * 
     */

     public void story(){
        /**(
         * scANNER
         * ) */

         Scanner myScanner = new Scanner(System.in);

         System.out.println("Enter 3 names: ");

         String name1 = myScanner.nextLine();
         String name2 = myScanner.nextLine();
         String name3 = myScanner.nextLine();
         String name4 = myScanner.nextLine();


         System.out.println("Enter 3 nouns: ");
         String noun1 = myScanner.nextLine();
         String noun2 = myScanner.nextLine();
         String noun3 = myScanner.nextLine();
         String noun4 = myScanner.nextLine();
         String noun5 = myScanner.nextLine();
         String noun6 = myScanner.nextLine();

         System.out.println("Enter 3 adjectives: ");
         String adj1 = myScanner.nextLine();
         String adj2 = myScanner.nextLine();
         String adj3 = myScanner.nextLine();
         String adj4 = myScanner.nextLine();
         String adj5 = myScanner.nextLine();
         String adj6 = myScanner.nextLine();
         String adj7 = myScanner.nextLine();
         String adj8 = myScanner.nextLine();
         String adj9 = myScanner.nextLine();

         System.out.println("Enter 3 feelings: ");
         
         String feel1 = myScanner.nextLine();
         String feel2 = myScanner.nextLine();
         String feel3 = myScanner.nextLine();
         String feel4 = myScanner.nextLine();

         System.out.println("Enter 2 places: ");
         String place1 = myScanner.nextLine();
         String place2 = myScanner.nextLine();

         System.out.println("Enter 2 verbs: ");
         String verb1 = myScanner.nextLine();
         String verb2 = myScanner.nextLine();

         System.out.println("And here's the story....");
         String wait = myScanner.nextLine();

        System.out.println("As " + name1 + "came riding into town on their horse, they knew something was " + adj9 + ". They could smell something he hadn't smelt in a long time.\n\n");
        myScanner.nextLine();
        System.out.println("It was "+ noun3 +". This could only mean one thing, Captain "+ noun3 + "was in town.");
        myScanner.nextLine();
        System.out.println(name1 +" knew they had to do something. He looked through his bag. In it, he found a picture of his true love " + name2 + ", as well as some letters sent from "+name3+".");
        myScanner.nextLine();
        System.out.println("But most important of all he found his" + noun1 + ", hiding behind a " + noun2 + ".");
        myScanner.nextLine();
        System.out.println("He picked up his " + noun1 + "which was a little " + adj1 + "and " + adj2 + "but that was OK, because he could always put it in his " + noun2 + ".");
        System.out.println("So, with his "+ noun1+"in his "+noun2+" he went off to find Captain "+noun3+".");
        myScanner.nextLine();
        System.out.println("<NAME1> found Captain "+ noun3+" very soon, becaue the smell of "+ noun3+" reminded him of "+ noun4+"s.");
        myScanner.nextLine();


        //TODO:

        System.out.println("<NAME1> was surprised when he first saw Captain "+ noun3+" because Captain "+ noun3+" was actually very <ADJ3>. <NAME1> thought that Captain <NOUN3> would be more <ADJ4>.");
        myScanner.nextLine();
        System.out.println("But there was no time to lose, <NAME1> had to move fast, in order to save <NAME2> from Captain <NOUN3>'s boss, Master <NOUN4> the most <ADJ5> in the world.");
        myScanner.nextLine();
        System.out.println(name1 + " grabbed his secret weapon, his <NOUN5> and used it to <VERB1> Captain <NOUN3> in the <NOUN6>. Captain <NOUN3> was feeling very <FEEL1>.");
        myScanner.nextLine();
        System.out.println("Next <NAME1> went on to see Master <NOUN4> at the <PLACE1>. It was a very <ADJ6> place, with a lot of <NOUN7>s. <NAME1> felt very <FEEL2>, but felt better when he saw ");
        myScanner.nextLine();
        System.out.println("picture of <NAME4>.... Wait ?! who was he looking for ?");
        myScanner.nextLine();
        System.out.println("He got a tap on the shoulder, it was <NAME5> coming all the way from <PLACE1> with a very <ADJ7> <NOUN8>, saying \"<NAME1>!!! You forgot your <NOUN9>, it's a really <ADJ8> <NOUN9>");
        myScanner.nextLine();
        System.out.println("So <NAME1> took his <ADJ8> <NOUN9> to <PLACE2> where Master <NOUN4> was waiting...");
        myScanner.nextLine();
        System.out.println("What happens next ?");
        myScanner.nextLine();
        System.out.println("To be "+ verb2+"....");
        myScanner.nextLine();
        System.out.println("I mean, to be continued....");
        myScanner.nextLine();



    }


     public static void main(String args[]){

        Sillystory ss = new Sillystory();
        ss.story();
        

     }
}