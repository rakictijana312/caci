package MyREVIEW.CACI;

public class ForLoopsSecondWay {
    public static void main(String[] args) {
         /*Alex Lee
           https://www.youtube.com/watch?v=3jMaKlNBjug

           Before writing for loops you must provide:
           1) How may times you want to repet the code
           2) Which code you want to repet
           i++ -means increment by 1 - by doing increment we are stoping loop until reach those condition, otherwise will be infinite
 */
        //Ovo su tri najkoriscenija nacina za upotrebu for loop

        //1
        for (int i = 0; i < 4; i++) { //1)      will print 4 times because of <4
            System.out.println("Mihailo volim te"); //2)
        }
        //2
        for (int i = 0; i <= 4; i++) { // will print 5 times because of <=4
            System.out.println("i");
        }
        //3- by using arrays
        int[] grades = {98, 100, 83, 90, 93};
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

    }
}
