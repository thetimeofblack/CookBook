package ViewPackage;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainView extends GridPane{
	Button searchbutton = new Button("Seach");
	TextField search = new TextField();
	Button listbutton = new Button("View all recipes");
	Button favouritebutton = new Button("Favourite Recipes");
	Button createbutton = new Button("Create a Recipe");
	Button logoutbutton = new Button("Log out");
		
	MainView(){
		this.setHgap(20);
		this.setVgap(20);
		this.add(searchbutton,1,1,1,1);
		this.add(search,2,1,1,1);
		this.add(listbutton,1,3,2,2);
		this.add(favouritebutton, 1, 5,2,2);
		this.add(createbutton, 1, 7,2,2);
		this.add(logoutbutton, 1, 9,2,2);
		
	}
	
}

