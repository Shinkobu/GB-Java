public class Seminar2 {


    public static void main(String[] args) {


//         checkPalindrome("tenet");     // проверка на палиндром
         compress("aabbbccccdddddf"); // сокращение строки


            }

            public static void checkPalindrome (String arg) {

                String reversArg = new StringBuilder(arg).reverse().toString();
                if ( reversArg.equals(arg) ){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }


            public static void compress(String inputString) {

            String outputString = "";
            int count = 0;
            char tempChar = inputString.charAt(0);

            for (int i = 0; i<inputString.length(); i++){

                char actualChar = inputString.charAt(i);

                if (actualChar != tempChar) {
                    outputString += tempChar +""+ count + " "; // как вариант + Integer.toString(count)
                    tempChar = inputString.charAt(i);
                    count = 0;
                }
                count +=1;
                // обработка последнего символа в строке
                if (i == inputString.length()-1){
                    outputString += tempChar + "" + count;
                }
            }
            System.out.print(outputString);
    }
    }





