public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        // p1.setColor("yellow");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);

        System.out.println(p1.getColor()); //null
        System.out.println(p1.getTip()); //0

        p1.setColor("yellow");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        p1.setColor("red");
        p1.setTip(7);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());



    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return color;
    }

    int getTip(){
        return tip;
    }

    void setTip(int newTip){
        tip = newTip;
    }

    void setColor(String newColor){
        color = newColor;
    }
}