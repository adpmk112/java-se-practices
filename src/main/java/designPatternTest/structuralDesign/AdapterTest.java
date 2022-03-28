package designPatternTest.structuralDesign;

public class AdapterTest {
    public static void main(String[] args) {
        /* PlayerNewModel newModel = new ObjectModelAdapter();
        newModel.showNewGraphic("New Model is using VectorArt"); */

        PlayerNewModel newModel = new ModelClassAdapter();
        newModel.showNewGraphic("New Model is using VectorArt");

        PlayerModel playerModel = new PlayerOldModel();
        playerModel.showGraphic("Old Model is using PixelArt");
    }
}

interface PlayerModel{
    void showGraphic(String art);
}

class PlayerOldModel implements PlayerModel{
    public void showGraphic(String art){
        System.out.println(art);
    }
}

interface PlayerNewModel{
    void showNewGraphic(String art);
}

class ObjectModelAdapter extends PlayerOldModel implements PlayerNewModel{

    @Override
    public void showNewGraphic(String art) {
       showGraphic(art);
    }
}

class ModelClassAdapter implements PlayerNewModel {
    PlayerOldModel oldModel = new PlayerOldModel();

    @Override
    public void showNewGraphic(String art) {
        oldModel.showGraphic(art);
    }
}


