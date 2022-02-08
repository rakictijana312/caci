package MyREVIEW.CACI.LoopsIfConditonsandRepls;

public class NestedForLoops {
    public static void main(String[] args) {

        /*
           ALex Lea
           https://www.youtube.com/watch?v=sk9xYje9XAQ&list=PL59LTecnGM1Mg6I4i_KbS0w5bPcDjl7oz&index=1
         */

        //First way
        for (int i = 0; i < 5; i++) {
            System.out.println("It's so freaking cold outside!");
        }

        System.out.println("-------------------------------------------------------------------");

        String[] colors = {"Red", "Blue", "Green"};

        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("--------------------------------------------------------------------");

        //Second way
        String[][] fancyColors = {{"Red", "Blue", "Green"}, {"Cyan", "Magenta", "Turqiouse"}};

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(fancyColors[row][column]);
            }
        }

        System.out.println("----------");

        //Third way
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }


    }
}
