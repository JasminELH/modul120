package jasmin;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class RechnerController implements Initializable {
	
	/*Dieser Rechner kann nur 2 Zahlen gleichzeitig zusammen rechnen!*/

	String text = "";
	double number1 = 0;
	double number2 = 0;
	char operation;
	
	@FXML TextField textField;
	
	@FXML private void keyPressed(KeyEvent ke){
		//Ein Switch Case für das Drücken auf der Tastatur
		switch (ke.getCode()){
		//Lösch-Funktion
		case BACK_SPACE:
		text = "";
		textField.setText(text);
		break;
		//Gleich-Funkton
		case ENTER:
			try{
				switch (operation){
				case '+':
					//Falls add verwendet wurde, sollen die zwei Zahlen addiert werden
					number2 = Float.parseFloat(text);
					text = "" + (number1 + number2);
					break;
				case '-':
					//Falls sub verwendet wurde, sollen die zwei Zahlen subtrahiert werden
					number2 = Float.parseFloat(text);
					text = ""+(number1 - number2);
					break;
				case '*':
					//Falls mult verwendet wurde, sollen die zwei Zahlen multipliziert werden
					number2 = Float.parseFloat(text);
					text = "" + (number1 * number2);
					break;
				case '/':
					//Falls div verwendet wurde, sollen die zwei Zahlen dividiert werden
					number2 = Float.parseFloat(text);
					text = "" + (number1 / number2);
					break;
				default:
					//Falls was anderes verwendet wurde, gibt es einen Fehler aus
					text = "Syntax ERROR";
					break;
				}
				}catch(java.lang.NumberFormatException error){
					text = "Syntax ERROR";
					
				}
			textField.setText(text);
			break;
		default:
			break;
			}
		}
	
	@FXML private void keyTyped(KeyEvent ke){
		//Ein Switch Case für das Drücken der Buttons in der Anwendung
		switch(ke.getCharacter()){
		case ",":
			text += ",";
			textField.setText(text);
			break;
		case "1":
			text += "1";
			textField.setText(text);
			break;
		case "2":
			text += "2";
			textField.setText(text);
			break;
		case "3":
			text += "3";
			textField.setText(text);
			break;
		case "4":
			text += "4";
			textField.setText(text);
			break;
		case "5":
			text += "5";
			textField.setText(text);
			break;
		case "6":
			text += "6";
			textField.setText(text);
			break;
		case "7":
			text += "7";
			textField.setText(text);
			break;
		case "8":
			text += "8";
			textField.setText(text);
			break;
		case "9":
			text += "9";
			textField.setText(text);
			break;
		case "0":
			text += "0";
			textField.setText(text);
			break;
		case "/":
			if(text.length() > 0) number1 = Float.parseFloat(text);
			operation = '/';
			text = "";
			textField.setText("/");
			break;
		case "*":
			if(text.length() > 0) number1 = Float.parseFloat(text);
			operation = '*';
			text = "";
			textField.setText("*");
			break;
		case "-":
			if(text.length() > 0) number1 = Float.parseFloat(text);
			operation = '-';
			text = "";
			textField.setText("-");
			break;
		case "+":
			if(text.length() > 0) number1 = Float.parseFloat(text);
			operation = '+';
			text = "";
			textField.setText("+");
			break;
		}
	}
	
	
	//Die Knöpfe werden dem Wert zugeortnet
	@FXML private void c(ActionEvent event){
		text = "";
		textField.setText(text);
	}
	
	@FXML private void div(ActionEvent event){
		if (text.length() > 0) number1 = Float.parseFloat(text);
		operation = '/';
		text = "";
		textField.setText("/");
	}
	
	@FXML private void mult(ActionEvent event){
		if (text.length() > 0) number1 = Float.parseFloat(text);
		operation = '*';
		text = "";
		textField.setText("*");
	}
	
	@FXML private void sub(ActionEvent event){
		if (text.length() > 0) number1 = Float.parseFloat(text);
		operation = '-';
		text = "";
		textField.setText("-");
	}
	
	@FXML private void add(ActionEvent event){
		if (text.length() > 0) number1 = Float.parseFloat(text);
		operation = '+';
		text = "";
		textField.setText("+");
	}
	
	@FXML private void button1(ActionEvent event){
		text += "1";
		textField.setText(text);
	}

	@FXML private void button2(ActionEvent event){
		text += "2";
		textField.setText(text);
	}
	
	@FXML private void button3(ActionEvent event){
		text += "3";
		textField.setText(text);
	}
	
	@FXML private void button4(ActionEvent event){
		text += "4";
		textField.setText(text);
	}
	
	@FXML private void button5(ActionEvent event){
		text += "5";
		textField.setText(text);
	}

	@FXML private void button6(ActionEvent event){
		text += "6";
		textField.setText(text);
	}
	
	@FXML private void button7(ActionEvent event){
		text += "7";
		textField.setText(text);
	}
	
	@FXML private void button8(ActionEvent event){
		text += "8";
		textField.setText(text);
	}
	
	@FXML private void button9(ActionEvent event){
		text += "9";
		textField.setText(text);
	}
	
	@FXML private void button0(ActionEvent event){
		text += "0";
		textField.setText(text);
	}
	
	@FXML private void comma(ActionEvent event){
		text += ",";
		textField.setText(text);
	}
	
	@FXML private void equal(ActionEvent event){
		
		try{
			switch (operation){
			case '+':
				number2 = Float.parseFloat(text);
				text = "" + (number1 + number2);
				break;
			case '-':
				number2 = Float.parseFloat(text);
				text = ""+(number1 - number2);
				break;
			case '*':
				number2 = Float.parseFloat(text);
				text = "" + (number1 * number2);
				break;
			case '/':
				number2 = Float.parseFloat(text);
				text = "" + (number1 / number2);
				break;
			default:
				text = "Syntax ERROR";
				break;
			}
			}catch(java.lang.NumberFormatException error){
				text = "Syntax ERROR";
				
			}
		textField.setText(text);
		}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	


}
