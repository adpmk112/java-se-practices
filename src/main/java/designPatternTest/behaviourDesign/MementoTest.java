package designPatternTest.behaviourDesign;

import java.util.ArrayList;
import java.util.List;

public class MementoTest {
    public static void main(String[] args) {
        List<Memory> memoryList = new ArrayList<>();
        Organizer organizer = new Organizer();

        organizer.setNotation("Pawn moved to c4");
        memoryList.add(organizer.saveToMemory());

        organizer.setNotation("Pawn moved to c5");
        memoryList.add(organizer.saveToMemory());

        organizer.setNotation("Pawn moved to c6");
        organizer.restoreFromMemory(memoryList.get(0));
    }
}

class Organizer{

    String notation;

    public void setNotation(String notation){
        this.notation = notation;
    }

    public String showNotation(){
        return notation;
    }

    public Memory saveToMemory(){
        return new Memory(this.notation);
    }

    public void restoreFromMemory(Memory memory){
        this.notation = memory.getLastMove();
        System.out.println("Notation is restored from Memory. Now --> "+notation);
    }
}

class Memory{
    String notation;

    public Memory(String notation){
        this.notation = notation;
    }

    public String getLastMove(){
        return this.notation;
    }
}
