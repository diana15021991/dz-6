public class Operator

{ public static void main(String[] args) {

    //
    int globalVal = 356;
    int globalVal1 = 23;

    int systemVal = 56;
    int systemVal1 = 98;

    // додаємо попарно
    int plusGlobal = globalVal+ 23;
    System.out.println( globalVal + " + 23 = " + plusGlobal);

    int plusSystem = systemVal + 98;
    System.out.println(systemVal + " + 98 = " + plusSystem);

     // виводимо результат порівняння
    boolean plusGlobalSystem = plusGlobal == 154;
    System.out.println( plusGlobal + " == 154 : " + plusGlobalSystem);

    // збільшуємо 1 суму на один
    int incrementValGlobal = plusGlobal ++;
    System.out.println( " incrementValGlobal = " + plusGlobal);

    // зменшуємо на два

    int incrementValSystem = plusSystem --;
    System.out.println( " incrementValSystem = " + plusSystem);
    //

    int incrementValSystem1 = plusSystem --;
    System.out.println( " incrementValSystem1 = " + plusSystem);

    //виводимо порівняння сум
    boolean valGlobalSystem = incrementValGlobal == incrementValSystem1;
    System.out.println(incrementValGlobal + " == incrementValSystem1 : " + valGlobalSystem);

    //
    




























}
}

