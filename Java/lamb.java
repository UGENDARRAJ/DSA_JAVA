interface in {
    void walk();
}

/**
 * Innerlamb
 */
class inner implements in{
    @Override
    public void walk(){
        System.out.println("walking");
    }
}


public class lamb {
    public static void main(String[] args){
        in obj = ()-> {
            System.out.print("Walking");
        };
        obj.walk();

    }
}
