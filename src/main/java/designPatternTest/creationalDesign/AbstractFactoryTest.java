package designPatternTest.creationalDesign;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        GameCompany bandai = new BandaiGameCompany();
        bandai.artistRole().createGameArt();
        bandai.developerRole().codeTheGame();
    }
}

interface Artist{
    void createGameArt();
}

interface Developer{
    void codeTheGame();
}

class CgArtist implements Artist{

    @Override
    public void createGameArt() {
        System.out.println("Create 3D objects.");
    }
}

class UnityDeveloper implements Developer{

    @Override
    public void codeTheGame() {
        System.out.println("Code for gameplay");
    }
}

abstract class GameCompany{
    abstract Artist artistRole();
    abstract Developer developerRole();
}

class BandaiGameCompany extends GameCompany{

    @Override
    Artist artistRole() {
        return new CgArtist();
    }

    @Override
    Developer developerRole() {
        return new UnityDeveloper();
    }
}
