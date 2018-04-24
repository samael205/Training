package com.rahulmadbhavi.training;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MenuDemo extends Application
{

	MenuBar menuBar;
	EventHandler<ActionEvent> handler;
	ContextMenu editMenu;
	ToolBar debugToolBar;
	
	Label response;
	
	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch() method.
		launch(args);
	}
	
	// Override the start() method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Demonstrate Menus");
		
		// Use a BorderPane for the root node.
		final BorderPane borderPane = new BorderPane();
		
		// Create a scene.
		Scene scene = new Scene(borderPane, 300, 300);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create a label that will report the selection.
		response = new Label();
		
		// Create one event handler for all menu action events.
		handler = (action) ->
		{
			String name = ((MenuItem) action.getTarget()).getText();
			
			if(name.equals("Exit"))
			{
				Platform.exit();
			}
			
			response.setText(name + " selected");
		};
		
		// Create the menu bar.
		menuBar = new MenuBar();
		
		// Create the file menu.
		makeFileMenu();
		
		// Create the options menu.
		makeOptionsMenu();
		
		// Create the Help Menu.
		makeHelpMenu();
		
		// Create the Context menu.
		makeContextMenu();
		
		// Create a text field and set its column width to 20.
		TextField textField = new TextField();
		textField.setPrefColumnCount(20);
		
		// Add the context menu to the text field.
		textField.setContextMenu(editMenu);
		
		// Create the toolbar.
		makeToolBar();
		
		// Add the context menu to the entire scene graph.
		borderPane.setOnContextMenuRequested(action ->
		{
			
			// Pop up menu at the location of the right click.
			editMenu.show(borderPane, action.getScreenX(), action.getScreenY());
			
		});
		
		// Add the menu bar to the top of the border pane.
		borderPane.setTop(menuBar);
		
		// Create a flow pane that will hold both the response label
		// and the TextField.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Use a separator to better organize the layout.
		Separator separator = new Separator();		
		separator.setPrefWidth(260);
		
		// Add the label, separator and the text field to the flow pane.
		flowPane.getChildren().addAll(response, separator, textField);
		
		// Add the toolbar to the bottom of the border pane.
		borderPane.setBottom(debugToolBar);
		
		// Add the flow pane to the center of the border layout.
		borderPane.setCenter(flowPane);
		
		// Show the stage and its scene.
		primaryStage.show();
				
	}
	
	// Create the file menu.
	void makeFileMenu()
	{
		 // Create the file menu, including a mnemonic.
		Menu fileMenu = new Menu("_File");
		
		// Create the file menu items.
		MenuItem open = new MenuItem("Open");
		MenuItem close = new MenuItem("Close");
		MenuItem save = new MenuItem("Save");
		MenuItem exit = new MenuItem("Exit");
		
		// Add items to File menu.
		fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);
		
		// Add keyboard accelerators for the File menu.
		open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
		close.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
		save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
		exit.setAccelerator(KeyCombination.keyCombination("shortcut+E"));
		
		// Set Action Event Handlers.
		open.setOnAction(handler);
		close.setOnAction(handler);
		save.setOnAction(handler);
		exit.setOnAction(handler);
		
		// Add file menu to the menu bar.
		menuBar.getMenus().add(fileMenu);
				
	}
	
	// Create the options menu.
	void makeOptionsMenu()
	{
		Menu optionsMenu = new Menu("Options");
		
		// Create the Colors menu.
		Menu colorsMenu = new Menu("Colors");
		
		// Use check menu items for colors. This allows
		// the user to select more than one color.
		CheckMenuItem red = new CheckMenuItem("Red");
		CheckMenuItem green = new CheckMenuItem("Green");
		CheckMenuItem blue = new CheckMenuItem("Blue");
		
		// Add the check menu items for the colors 
		colorsMenu.getItems().addAll(red, green, blue);
		optionsMenu.getItems().add(colorsMenu);
		
		// Select green for the default color selection.
		green.setSelected(true);
		
		// Create the priority submenu.
		Menu priorityMenu = new Menu("Priority");
		
		// Use radio menu items for the priority setting.
		// This lets the menu show which priority is used
		// and also ensures that one and only one priority
		// can be selected at one time.
		RadioMenuItem high = new RadioMenuItem("High");
		RadioMenuItem low = new RadioMenuItem("Low");
		
		// Create a toggle group and use it for the radio menu items.
		ToggleGroup toggleGroup = new ToggleGroup();
		high.setToggleGroup(toggleGroup);
		low.setToggleGroup(toggleGroup);
		
		// Select High priority for the default selection.
		high.setSelected(true);
		
		// Add the radio menu items to the priority menu and
		// add the priority menu to the options menu.
		priorityMenu.getItems().addAll(high, low);
		optionsMenu.getItems().add(priorityMenu);
		
		// Add a separator.
		optionsMenu.getItems().add(new SeparatorMenuItem());
		
		// Create the reset menu item and add it to the options menu.
		MenuItem reset = new MenuItem("Reset");
		optionsMenu.getItems().add(reset);
		
		// Set action event handler
		red.setOnAction(handler);
		green.setOnAction(handler);
		blue.setOnAction(handler);
		
		high.setOnAction(handler);
		low.setOnAction(handler);
		reset.setOnAction(handler);
		
		// Use a change listener to respond to changes in the radio.
		// menu item setting.
		toggleGroup.selectedToggleProperty().addListener((changed, oldValue, newValue) ->
		{
			
			if(newValue == null)
			{
				return;
			}

			// Cast new Val to RadioButton.
			RadioMenuItem radioMenuItem = (RadioMenuItem) newValue;
			
			// Display the selection.
			response.setText("Priority selected is " + radioMenuItem.getText());
			
		});
		
		// Add options menu to menu bar.
		menuBar.getMenus().add(optionsMenu);
	}
	
	// Create the help menu.
	void makeHelpMenu()
	{
		
		// Create an ImageView for the image.
		ImageView aboutImageView = new ImageView("file:images/icons/icons8-about-24.png");
		
		// Create the Help menu.
		Menu helpMenu = new Menu("Help");
		
		// Create the About menu and add it to the help menu.
		MenuItem about = new MenuItem("About", aboutImageView);
		helpMenu.getItems().add(about);
		
		// Set action event handler.
		about.setOnAction(handler);
		
		// Add help menu to the menu bar.
		menuBar.getMenus().add(helpMenu);
				
	}

	// Create the context menu items.
	void makeContextMenu()
	{
		// Create the edit context menu items.
		MenuItem cut = new MenuItem("Cut");
		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem("Paste");
		
		// Create a context (i.e., popup) menu that shows edit options.
		editMenu = new ContextMenu(cut, copy, paste);
		
		// Set the action event handlers.
		cut.setOnAction(handler);
		copy.setOnAction(handler);
		paste.setOnAction(handler);
		
	}
	
	// Copy the toolbar.
	void makeToolBar()
	{
		// Create toolbar items.
		Button buttonSet = new Button("Set Breakpoint", new ImageView(new Image("file:images/icons/icons8-set-40.png", 24, 24, true, true)));
		Button buttonClear = new Button("Clear Breakpoint", new ImageView(new Image("file:images/icons/icons8-empty-trash-40.png", 24, 24, true, true)));
		Button buttonResume = new Button("Resume Execution", new ImageView(new Image("file:images/icons/icons8-resume-button-40.png", 24, 24, true, true)));
		
		// Turn off text in the buttons.
		buttonSet.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
		buttonClear.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
		buttonResume.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
		
		// Set tooltips.
		buttonSet.setTooltip(new Tooltip("Set a breakpoint."));
		buttonClear.setTooltip(new Tooltip("Clear a breakpoint."));
		buttonResume.setTooltip(new Tooltip("Resume execution."));
		
		// Create the toolbar.
		debugToolBar = new ToolBar(buttonSet, buttonClear, buttonResume);
		
		// Create a handler for the toolbar buttons.
		EventHandler<ActionEvent> buttonHandler = (action) ->
		{
			response.setText(((Button) action.getTarget()).getText()); 
		};
		
		// Set the toolbar button action event handlers.
		buttonSet.setOnAction(buttonHandler);
		buttonClear.setOnAction(buttonHandler);
		buttonResume.setOnAction(buttonHandler);
		
	}
}
