class AGame extends Thread 
{
    public void run()
    {
        int i,max=6,min=1,Point1=0,Point2=0;
        int rang = max-min + 1;
        System.out.println("Enter 1 Player Name:");
        String p1 = System.console().readLine();
        
        System.out.println("Enter 2 Player Name:");
        String p2 = System.console().readLine();
        
        System.out.println("------Game Started-------");
        System.out.println("---Winning Point Is 20---");
        int wn = 20;
        try
        {

            for(i=1;i<=wn;i++)
            {
                if(Point1 <= wn && Point2 <= wn)
                {
                    if(i %2 == 0)
                    {
                        System.out.println("Now "+p1+" Turn"); 
                        System.out.println("--Dice Throw---");
                        
                        int rd = (int)(Math.random()*rang + 1);
                        Thread.sleep(3000);
                        System.out.println("You got:" +rd);
                        Thread.sleep(2000);
                        
                        Point1 = Point1 + rd;
                        System.out.println( p1 + "Point is:" + Point1);
                        System.out.println("---------------------");
                    }
                    if(i %2 != 0)
                    {
                        System.out.println("Now "+p2+" Turn");
                        System.out.println("--Dice Throw---");
                        
                        
                        int rd = (int)(Math.random()*rang + 1);
                        Thread.sleep(3000);
                        System.out.println("You got:" +rd);
                        Thread.sleep(2000);
                        
                        Point2 = Point2 + rd;
                        System.out.println( p2 + "Point is:" + Point2);
                        System.out.println("---------------------");       
                    }
                }
                else
                {
                    System.out.println("----Game Is over----");
                    System.out.println(p1 +" Point is: "+Point1);
                    System.out.println(p2 +" Point is: "+Point2);         
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        if(Point1 >= wn)
        {
            System.out.println("-----^^^^^^^^^^^^^^^^--------");
            System.out.println(p1 +" Point is: "+Point1);
            System.out.println("-----You Won The Match-----");
        }
        if(Point2 >= wn)
        {
            System.out.println("-----^^^^^^^^^^^^^^^^--------");
            System.out.println(p2 +" Point is: "+Point2);
            System.out.println("-----You Won The Match-----");
        }
    }
}
    public class Game2
    {
    public static void main(String args[])
    {
        AGame a1 = new AGame();
        a1.start();
    }   
}

// int rd = (int)(Math.random()*rang + 1);
// System.out.println("Dise throw:" +rd);