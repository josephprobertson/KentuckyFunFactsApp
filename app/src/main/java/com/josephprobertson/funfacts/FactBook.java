package com.josephprobertson.funfacts;

import java.util.Random;

/**
 * Created by joerobertson on 9/8/15.
 */
public class FactBook {

    // Member variables (properties about the object)
    public String[] mFacts = {
    "The Boy Scouts of America Museum is located on the campus of Murray State University.",
            "The Kentucky Derby is the oldest continuously held horse race in the country.",
            "Bluegrass Country around Lexington is home to some of the world's finest racehorses.",
            "Kentucky was a popular hunting ground for the Shawnee and Cherokee Indian nations.",
            "In 1774 Harrodsburg was established as the first permanent settlement in Kentucky.",
            "The tulip tree is the official state tree of Kentucky.",
            "Cheeseburgers were first served in 1934 at Kaolin's restaurant in Louisville.",
            "Chevrolet Corvettes are manufactured in Bowling Green.",
            "Kentucky's Mammoth Cave is the world's longest cave.",
            "Kentucky's Mammoth Cave is America's second oldest tourist attraction.",
            "In 1819 the first commercial oil well was on the Cumberland River in McCreary County.",
            "The first Miss America from Kentucky is Heather Renee French.",
            "The first Kentucky Fried Chicken restaurant is located in Corbin.",
            "Both Abraham Lincoln and Jefferson Davis were born in Kentucky.",
            "Cumberland Falls in Corbin is the only waterfall in the world to regularly display a Moonbow.",
            "Fleming County is recognized as the Covered Bridge Capital of Kentucky.",
            "Shelby County is recognized as the Saddlebred Capital of Kentucky.",
            "Actor Arthur Lake of “Blondie” fame was born in Corbin.",
            "Christian County is wet. Bourbon County is dry.",
            "Barren County has the most fertile land in the state.",
            "Thunder Over Louisville is the world's largest fireworks display.",
            "More than 100 native Kentuckians have been elected governors of other states.",
            "In 1888, State Treasurer Honest Dick Tate embezzled $247,000 and fled the state.",
            "The song Happy Birthday to You was the creation of two Louisville sisters in 1893.",
            "Teacher Mary S. Wilson held the first observance of Mother's Day in Henderson in 1887.",
            "Man o' War won all of his races except one. He lost to a horse named Upset.",
            "Pikeville annually leads the nation in per capita consumption of Pepsi-Cola.",
            "The first American performance of a Beethoven symphony was in Lexington in 1817.",
            "Post-It Notes are manufactured exclusively in Cynthiana.",
            "Kentucky was the 15th state to join the Union and the first on the western frontier.",
            "Bluegrass is not really blue.",
            "Stephen Foster's My Old Kentucky Home was written in 1852 after a trip to Kentucky.",
            "Daniel Boone and his wife Rebecca are buried in the Frankfort Cemetery.",
            "The public saw an electric light for the first time in Louisville.",
            "The radio was invented by a Kentuckian named Nathan B. Stubblefield of Murray in 1892.",
            "The first enamel bathtub was made in Louisville in 1856.",
            "In the War of 1812 more than half of all Americans killed in action were Kentuckians.",
            "Middlesboro is the only city in the United States built within a meteor crater.",
            "At 3,008 miles, Kentucky's Joe Bowen holds the world record for stilt walking endurance.",
            "The world's largest free-swinging bell is on permanent display in Newport.",
            "High Bridge located near Nicholasville is the highest railroad bridge over navigable water in the US.",
            "Famous teetotaler Carrie Nation was born in Lancaster in Garrard County.",
            "There is a memorial in Lexington to “Smiley Pete”, the town dog.  Pete died in 1957.",
            "At 71, Kentuckian Alben W. Barkley was the oldest United States Vice President.",
            "More than $6 billion worth of gold is held in the underground vaults of Fort Knox.",
            "The Cathedral Basilica of the Assumption in Covington has the world's largest hand-blown stained glass window.",
            "The Lost River Cave includes the shortest and deepest underground river in the world.",
            "The swimsuit Mark Spitz wore in the 1972 Olympic games was manufactured in Paris, Kentucky.",
            "Kentucky's Frederick Vinson is the only Chief Justice of the US Supreme Court to be born in jail.",
            "Pike County is famous for the Hatfield-McCoy feud, which lasted from the Civil War to the 1890s" };

    // Method (abilities: things the object can do)
    public String getFact() {

        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();  //Construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;

    }

}
