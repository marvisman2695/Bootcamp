
import java.util.ArrayList;
import java.util.LinkedList;

public class MSWord {
  //Curent
  
  private ArrayList<Character> characters;

  //Deque


  public MSWord() {
     this. characters = new LinkedList<>();
  }

  public void write(char c) {
    this.characters.add(c);
  }
  
  public void undo() {

  }
  public void redo() {

  }

  }

