package easylevel.oddoreven;

public class Reto {

    public static void main(String[] args) {
        Reto.oddOrEven(91);
//        Reto.oddOrEven1(90, 77);
    }

    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");

        }
    }

//    public static void oddOrEven1(int num1, int num2) {
//        if (num1 % 2 == 0) {
//            if(num2 % 2 == 0){
//                System.out.println(num1 + " is even");
//                System.out.println(num2 + " is even");
//            }
//        } else if (num1 % 2 == 1) {
//            if(num2 % 2 == 1){
//                System.out.println(num1 + " is odd");
//                System.out.println(num2 + " is odd");
//            }
//        } else {
//            System.out.println("There is no even or odd, everyone is equal");
//        }
//
//
////
////        public static void oddOrEven(int num1, int num2){
////        if(num1 % num2 == 1){
////            System.out.println(num1+ " is odd");
////        }else if(num1% num2 == 0){
////            System.out.println(num1+ " is even");
////        }else if(num2%num1 == 1){
////            System.out.println(num2+ " is odd");
////        } else if (num2 % num1 == 0) {
////            System.out.println(num2 + " is even");
////        }else {
////            System.out.println("There is no even or odd, everyone is equal");
////        }
//
//
//    }
}
