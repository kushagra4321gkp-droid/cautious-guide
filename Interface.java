public class Interface {
    public static void main(String[] args) {
        //Interface is a Blueprint of Class
        //2 uses of Interface are -> (1)Multiple Inheritance -> (2)Total Abstraction
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left, right, top, bottom, diagonal - (in all four directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - (one step)");
    }
}