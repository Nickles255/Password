/**
* @author(s) Chien Lin, Lena Zheng, Qd Li
* @version 1.0
* @since 2017-09-15
* input: name and date
* output: password consisting of first two letters of name followed by a period
*         followed by a two digit random number followed by last for digit of date
* Example: 
*           input: name:Chris, date: 091717 
*           output: Ch.521717
*/


/**
* Algorithm:
* 1) Read user's name
* 2) Read user's birthday
* 3) Generate a password using user's inputs
* 4) Output password
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PassWordCreator extends Application {
    /**
    * PassWordCreator --- create and display window for password program 
    * This program depends on PassWordPane class to receive input, process,
    * then return output.
    **/	
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new PassWordPane(), 500, 300);
        
        primaryStage.setTitle("Password Creator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
    public static void main(String[] args) {
        launch(args);
    }
}
