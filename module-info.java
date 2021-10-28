module Galaxy {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	requires javafx.fxml;
	requires java.desktop;
	requires java.prefs;
	
	opens application to javafx.graphics, javafx.fxml;
}
