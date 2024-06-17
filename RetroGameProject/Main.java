import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    // Schedules a task to be executed in the event queue. Creates an instance of Pacman and makes it visible
      EventQueue.invokeLater(() -> {
        Pacman ex = new Pacman();
        ex.setVisible(true);
      });
  }
}
