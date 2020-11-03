
public class TextNote extends Note {
	String text = "";

	//Getter
	public String getText() {
		return text;

	}

	//Setter
	public void setText(String newText) {
		this.text = newText;
	}
	
	public static void main(String args[]) {
		System.out.println("This is Text Note:" );
	}
}
