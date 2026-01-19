
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class ScreenPanel extends JPanel implements Runnable {
    
    // Ustawienia ekranu

    int originalTileSize = Config.getInt("originalTileSize"); // 16x16 - Wielkosc pola
    int scale = Config.getInt("scale"); // 3 - Skala w jakiej tworze postac
    int tileSize = originalTileSize * scale; // 48x48 - Pole po skalowaniu
    int screenColumns = Config.getInt("maxColumns"); // 16 - Dlugosc
    int screenRows = Config.getInt("maxRows"); // 12 - Wysokosc
    int screenWidth = tileSize * screenColumns; // 768 pixeli
    int screenHeight = tileSize * screenRows; // 576 pixeli

    Thread gameThread;

    public ScreenPanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }


    public void startGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while(gameThread != null) {
            System.out.println("Game is running");

            // TODO: Dodać aktualizacje informacji na bieżąco
            // Narysować mape i postać
        }
    }
}
