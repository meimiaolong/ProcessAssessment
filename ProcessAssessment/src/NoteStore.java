import java.util.ArrayList;

public class NoteStore {

	public static void main(String[] args) {
		ArrayList<String> noteList = new ArrayList<String>();
		noteList.add(
				"Text Note 1: Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		noteList.add("Text Note 2: Few books to read - lkigai, How to win friends and influence people");
		for (int i = 0; i < noteList.size(); i++) {
			System.out.println(noteList.get(i));}
			
		ArrayList<String> noteImageList = new ArrayList<String>();
			noteImageList.add("Text and Image Note 1: The shopping list on my fridge");
			noteImageList.add("Text and Image Note 2: The size label of Jack's shirt");
			for (int j = 0; j < noteImageList.size(); j++) {
				System.out.println(noteImageList.get(j));
			}


		}

	}

