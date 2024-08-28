package org.lld;

public class InterviewQues {
    public static void main(String[] args) throws InterruptedException {
        Color color = new Red();
        HouseType houseType = new Villa(color);

        System.out.println(houseType.getColor());
    }
}

class Red implements Color{
    public String getColor(){
        return "red";
    };
}

class White implements Color{
    public String getColor(){
        return "white";
    };
}

class Blue implements Color{
    public String getColor(){
        return "blue";
    };
}

class Simplex implements HouseType{
    Color color;

    public Simplex(Color color){
        this.color = color;
    }

    public String getColor(){
        return color.getColor();
    };
}

class Duplex implements HouseType{
    Color color;

    public Duplex(Color color){
        this.color = color;
    }

    public String getColor(){
        return color.getColor();
    };
}

class Villa implements HouseType{
    Color color;

    public Villa(Color color){
        this.color = color;
    }

    public String getColor(){
        return color.getColor();
    };
}
