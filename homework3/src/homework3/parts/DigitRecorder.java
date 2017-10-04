package homework3.parts;



import javax.annotation.PostConstruct;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
/**
 * You can type '1','2' and '3' using "1" Button, "2" Button, "3" Button.
 * If you click Button 1, '1' is displayed in text viewer.
 * The label of text viewer is "Buffer: ".
 * You can write up to 20 digits.
 * If you click "Clear" button, text viewer will be empty.
 * There is no warning even if the "Clear" button is pressed while the text viewer is empty.
 * If you type more than 20 digits, Warning window should be popped up.(See image 4 in hw3.pdf).
 * If you click "Backspace" button when text viewer is empty. Warning window should be popped up.(See image 5 in hw3.pdf).
 * Use jface.dialogs.MessageDialog library when you pop up the Warning window.
 * You can delete one digit using Backspace.
 *
 */
public class DigitRecorder {
    private static int limit = 20;
    
    /**
     * Create Button(1, 2, 3, Backspace, Clear).
     * Implement functionality of Button.
     * Pop up warning window when edge cases are occurred.
     * @param parent Current screen area
     * @return Update screen area after click button
     */
    private static Composite clickButton(Composite parent) {
    		//TODO
    		return null;
    }
    
    /**
     * The background of the display should be "White"
     * 
     * @param parent Current screen area
     */
	@PostConstruct
	public void createPartControl(Composite parent) {
		//TODO
        
	}

}
