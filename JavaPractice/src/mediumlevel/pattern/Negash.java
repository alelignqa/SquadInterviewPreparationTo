package mediumlevel.pattern;

public class Negash {
    /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
     *
     *100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,37,34,31,28,25,22,19,16,13,10,7,4,1,-2,-5,-8,-11,-14,-17,-20,-23,
     */

    public static void main(String[] args) {
//    Negash.pattern1();
//        Negash.pattern2();
       Negash.pattern3();
    }

    public static void pattern1() {
        int count = 100;
        while (count >= 0) {

            if (count > 90) {
                for (int i = 100; i > 90; i--) {
                    System.out.print(count + ",");
                    count--;
                }
            } else if (count > 70) {
                for (int i = 90; i > 70; i -= 2) {
                    System.out.print(count + ",");
                    count -= 2;
                }
            } else if (count > 40) {
                for (int i = 70; i > 40; i -= 3) {
                    System.out.print(count + ",");
                    count -= 3;
                }
            } else if (count >= 0) {
                for (int i = 40; i >= 0; i -= 4) {
                    System.out.print(count + ",");
                    count -= 4;
                }
            }
        }
    }

    public static void pattern2() {
        int count = 100;
        while (count >= 0) {
            for (int i = 100; i > 0; i--) {
                if (count > 90) {
                    System.out.print(count + ",");
                    count--;
                } else if (count > 70) {
                    System.out.print(count + ",");
                    count -= 2;
                } else if (count > 40) {
                    System.out.print(count + ",");
                    count -= 3;
                } else if (count >= 0) {
                    System.out.print(count + ",");
                    count -= 4;
                }
            }
        }
    }

    public static void pattern3() {
        int count = 100;
        System.out.print(count+",");
        while (count >= 0) {
            for (int i = 100; i > 0; i--) {
                if (count > 90) {
                    count--;
                } else if (count > 70) {
                    count -= 2;
                } else if (count > 40) {
                    count -= 3;
                } else if (count >= 0) {
                    count -= 4;
                }
                if(count>=0){
                System.out.print(count+",");}
            }
        }
    }


}
// 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32,28,24,20,16,12,8,4,0,
// 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
// 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32,28,24,20,16,12,8,4,0,
// 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32,28,24,20,16,12,8,4,0,
