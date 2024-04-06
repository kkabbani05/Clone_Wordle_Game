module wordle_game_project {
    requires javafx.controls;
    requires javafx.fxml;

    opens wordle_game_project to javafx.fxml;
    exports wordle_game_project;
}
