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
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import java.util.Random;
import java.text.DecimalFormat;

public class PassWordPane extends GridPane { 
    /**
    * PassWordPane --- program to generate password based on users input 
    * This class is dependent on PassWordCreate program to display.
    **/	
    private Label result;
    private TextField inputName;
    private TextField inputDate;
	
    public PassWordPane() {
        Font font = new Font(18);
		 
        //Team Label creation.
        Label teamLabel = new Label("Chien Lin, Lena Zheng, Qd Li");
        teamLabel.setFont(font);
        GridPane.setHalignment(teamLabel, HPos.LEFT);
			
        //Accept Name input.
        Label inputNameLabel = new Label("Please enter name: ");
        inputNameLabel.setFont(font);
        GridPane.setHalignment(inputNameLabel, HPos.RIGHT);
			
        inputName = new TextField();
        inputName.setFont(font);
        // inputName.setPrefWidth(200);
        inputName.setPrefColumnCount(5); //replace with correct method
        inputName.setAlignment(Pos.CENTER);
        inputName.setOnAction(this::processResult);
		 
        //Accept Date input			
        Label inputDateLabel = new Label("Please enter a date: ");
        inputDateLabel.setFont(font);
        GridPane.setHalignment(inputDateLabel, HPos.RIGHT);
			
        inputDate = new TextField();
        inputDate.setFont(font);
        // inputDate.setPrefWidth(200);
        inputDate.setPrefColumnCount(5); //replace with correct method
        inputDate.setAlignment(Pos.CENTER);
        inputDate.setPromptText("mmddyy");
        inputDate.setOnAction(this::processResult);
			
        //Label to store Result 
        result = new Label();
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);

        setStyle("-fx-background-color: yellow");

        //set Positions of labels, textfields, and output field
        add(teamLabel, 0, 0);
        add(inputNameLabel,0,1);
        add(inputName,1,1);
        add(inputDateLabel,0,2);
        add(inputDate,1,2);
        add(result,0,3);
    }
	
    //Capture User's name and birthday and outputs generated password
    public void processResult(ActionEvent event){
        Random ran = new Random();// random number generator
        DecimalFormat fourDigitFormat = new DecimalFormat("0000"); //format in case fourdigit starts with a 0
       
        String name = inputName.getText();
        int birthday =Integer.parseInt( inputDate.getText());
        
        int num = ran.nextInt(100); //random 1-2 digit number
       
        //Gets the last 4 digit 
        int fourdigit = birthday%10000; //need to format this to 0000
       
        /*displays the first two letter, 1-2 digit random number, 
        and last 4 digit of the date*/
        result.setText(name.substring(0,2) +"."+num+ fourDigitFormat.format(fourdigit)+ "");
        
    }
}	
	
