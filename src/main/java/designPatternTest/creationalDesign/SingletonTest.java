package designPatternTest.creationalDesign;

public class SingletonTest {
    public static void main(String[] args) {
        Player player1 = Player.getPlayer();
        Player player2 = Player.getPlayer();
        System.out.println(player1 == player2);
    }
}

class Player{
    private static Player player;

    private Player(){

    }

    public static Player getPlayer(){
        if(player == null){
            player = new Player();
        }
        return player;
    }
}
