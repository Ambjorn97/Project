import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        boolean oneMoreTry = true;
        while (oneMoreTry){System.out.println("Введите выражение без пробелов (например: 2*2)");
                Scanner problemInput = new Scanner(System.in);
                String s1 = problemInput.nextLine();
                char [] char1 = s1.toCharArray();
                int num1 = Character.getNumericValue(char1[0]);
                int num2 = Character.getNumericValue(char1[2]);
                int solution = 0;
                switch(char1[1]){
                    case '*':
                        solution = num1  * num2;
                        System.out.println( "Ответ: "+solution);
                        break;
                    case '/':
                        solution = num1  / num2;
                        System.out.println( "Ответ: "+solution);
                        break;
                    case '-':
                        solution = num1 - num2 ;
                        System.out.println( "Ответ: "+solution);
                        break;
                    case '+':
                        solution = num1 + num2;
                        System.out.println( "Ответ: "+solution);
                        break;

                    default:
                        System.out.println("Знак арифметического действия введен неверно");
                         break;
                }
            System.out.println("Хотите решить еще один пример? (Да/Нет с большой буквы)");
            Scanner yesOrNo = new Scanner(System.in);
            String answer = yesOrNo.nextLine();
            switch (answer) {
                case "Да":
                    break;
                case "Нет":
                    oneMoreTry = false;
                    break;

            }
        }
    }
}
