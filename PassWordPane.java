import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class PassWordPane extends GridPane { 
		/**
			* PassWordPane --- program to generate password based on users input 
			* This class is dependent on PassWordCreate program to display.
			* @author(s) Chien Lin, Lena Zheng, Qd Li
			* @version 1.0
			* @since 2017-09-15
			* input: name and date
			* output: password consisting of first two letters of name followed by a period
			*         followed by a two digit random number followed by last for digit of date
			* Example: 
			*           input: name:Chris, date: 091717 
			*           output: Ch.521717
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
	     inputName.setPrefWidth(200);
	     inputName.setAlignment(Pos.CENTER);
	     inputName.setOnAction(this::processResult);
		 
	     //Accept Date input			
	     Label inputDateLabel = new Label("Please enter a date: ");
             inputDateLabel.setFont(font);
	     GridPane.setHalignment(inputDateLabel, HPos.RIGHT);
			
	     inputDate = new TextField();
	     inputDate.setFont(font);
	     inputDate.setPrefWidth(200);
	     inputDate.setAlignment(Pos.CENTER);
	     inputDate.setPromptText("mmddyy");
	     inputDate.setOnAction(this::processResult);
			
	      //Label to store Result 
	      result = new Label();
	      result.setFont(font);
	      GridPane.setHalignment(result, HPos.CENTER);
			
}
	
	public void processResult(ActionEvent event){
         Random ran = new Random();// random number generator
       
         String log = inputName.getText();
       int pass =Integer.parseInt( inputDate.getText());
       
       //Gets the last 4 digit 
       int fourdigit = pass%10000; 
       
       int num = ran.nextInt(90)+10;//random number 10-99
       
       /*displays the first two letter, 1-2 digit random number, 
       and last 4 digit of the date*/
       result.setText(log.substring(0,2) +"."+num+ fourdigit+ "");
     }
	
	
