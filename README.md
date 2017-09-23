# Password
Assignment3 Password Project
------ ASSIGNMENT SPECS ----------------------------------------
   Purpose:
   1)  Write a GUI application that displays a password based on user input into 2 TextFields. 
    A) A class called PassWordCreator inside a file named PassWordCreator.java
    This class contains the main() method that creates and displays the 'window' for the program.This is the driver program.

    B) A class called PassWordPane that instantiates 4 Labels and 2 TextFields.  
    It also contains the 'handlers' that 'listen' and respond when a user types into the TextFields and presses <enter>. 
    In Swing these are inner classes, in Java FX they are method references. The file is named PassWordPane.java

    The password is displayed by the 4th Label and uses this algorithm:
    I   first 2 letters of name
    II   plus a period
    III  plus a 1-2 digit positive random number
    IV  plus last 4 digits of date 
Note: The first label must display your own name(s).
------ Project Specifications as defined on 2017-09-15 by clin --------------------
	* PassWordPane --- program to generate password based on users input 
	* This class is dependent on PassWordCreate program to display.
	* PassWordCreator --- create and display window for password program 
	* This program depends on PassWordPane class to receive input, process,
	* then return output.
	* @author(s) Chien Lin, Lena Zheng, Qd Li
	* @version 1.0
	* @since 2017-09-15
	* input: name and date
	* output: password consisting of first two letters of name followed by a period
	*         followed by a two digit random number followed by last for digit of date
	* Example: 
	*           input: name:Chris, date: 091717 
	*           output: Ch.521717

	* PassWordCreator --- create and display window for password program 
	* This program depends on PassWordPane class to receive input, process,
	* then return output.
	* @author(s) Chien Lin, Lena Zheng, Qd Li
	* @version 1.0
	* @since 2017-09-15
	* input: name and date
	* output: password consisting of first two letters of name followed by a period
	*         followed by a two digit random number followed by last for digit of date
	* Example: 
	*           input: name:Chris, date: 091717 
	*           output: Ch.521717

----- Due dates and project assignments --------------------------------
Tasks:
                1. Create initial Java files PassWordCreateor and PassWordPane - CL completed 9/15/2017.
                2. Work on PassWordPane.java
                                a. create method handler which listens for input and composes result. (complete by 9/23/2017) -- QD
                                b. Create Labels and text fields (complete by 9/25/2017) -- CL
                                   i.   label for group name 
                                   ii.  label and textfield to enter name of user (require name of method handler from a.)
                                   iii. label and textfield to enter a date (require name of method handler from a.)
                                   iv.  label for return value 
                                c. set positioning of labels (require label names from person doing b.) (complete by 9/27/2017)- LZ
                                d. test program (complete by 10/1/2017) - CL
                                e. submit program (due 10/3/2017) - CL

