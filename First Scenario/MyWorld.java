import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,0,10*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,0,9*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,0,8*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,1*50,8*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,2*50,8*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,3*50,8*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,4*50,8*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,2*50,10*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,2*50,11*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,4*50,10*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,6*50,11*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,6*50,10*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,6*50,9*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,6*50,8*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,6*50,7*50);
        mazeBlock15.setLocation(6*50,7*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,6*50,7*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,6*50,6*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,5*50,6*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,7*50,6*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,5*50,5*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,5*50,4*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,5*50,3*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,6*50,2*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,7*50,2*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,6*50,1*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,5*50,1*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,4*50,1*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,3*50,2*50);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,3*50,3*50);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,2*50,1*50);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,1*50,2*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,2*50,2*50);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,1*50,3*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,1*50,4*50);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,1*50,5*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,1*50,6*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,3*50,5*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,3*50,6*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,0,0);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,8*50,0);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,9*50,1*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,10*50,1*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,9*50,2*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,10*50,2*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,9*50,3*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,10*50,4*50);
        mazeBlock46.setLocation(10*50,4*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,10*50,4*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,10*50,5*50);
        mazeBlock48.setLocation(10*50,5*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,10*50,5*50);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,10*50,6*50);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,10*50,7*50);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,9*50,6*50);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,7*50,4*50);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,8*50,4*50);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,9*50,8*50);
        mazeBlock55.setLocation(9*50,8*50);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,9*50,8*50);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,9*50,9*50);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,8*50,8*50);
        MazeBlock mazeBlock59 = new MazeBlock();
        addObject(mazeBlock59,8*50,9*50);
        removeObject(mazeBlock57);
        MazeBlock mazeBlock60 = new MazeBlock();
        addObject(mazeBlock60,10*50,10*50);
        MazeBlock mazeBlock61 = new MazeBlock();
        addObject(mazeBlock61,10*50,11*50);
        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,8*50,10*50);
        MazeRunner mazeRunner = new MazeRunner();
        addObject(mazeRunner,183,478);
        mazeRunner.setLocation(-53,654);
        mazeBlock10.setLocation(28,568);
        mazeBlock10.setLocation(94,603);
        mazeBlock10.setLocation(46,570);
        removeObject(mazeBlock10);
        MazeBlock mazeBlock63 = new MazeBlock();
        addObject(mazeBlock63,298,599);
        MazeBlock mazeBlock64 = new MazeBlock();
        addObject(mazeBlock64,501,599);
        mazeRunner.setLocation(37,557);
        mazeBlock.setLocation(34,499);
        mazeBlock9.setLocation(221,503);
        mazeBlock5.setLocation(145,450);
        mazeBlock.setLocation(13,498);
        mazeBlock2.setLocation(29,442);
        mazeBlock4.setLocation(87,395);
        mazeBlock3.setLocation(41,395);
        mazeBlock4.setLocation(72,405);
        mazeBlock6.setLocation(127,403);
        mazeBlock5.setLocation(134,433);
        mazeBlock8.setLocation(131,492);
        mazeBlock9.setLocation(181,498);
        mazeBlock7.setLocation(163,404);
        mazeBlock31.setLocation(29,101);
        mazeBlock39.setLocation(58,64);
        mazeBlock31.setLocation(65,99);
    }
}
