package evento;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Evento1 implements EventHandler <MouseEvent> {

	@Override
	public void handle(MouseEvent event) {
		System.out.print("Hello Wolrd! " + event.getEventType());
        System.out.println();
    } 
}
		
