/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19perevjortysh;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("---Перевертыш---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку символов: ");
        String str = scanner.nextLine();
        System.out.println("В этой строке символов: "+str.length());
        char[]chStr = str.toCharArray();
        char[] reversStr = new char[chStr.length];
        for (int i = 0; i<reversStr.length; i++) {
            reversStr[i] = chStr[reversStr.length - i - 1];
        }
        String rStr = reversStr.toString();
        System.out.println("Обратная строка"+ new String(reversStr));
        System.out.println("Второе слово в строке");
        int firstSpace = str.indexOf(" ");
        int nextSpace = str.indexOf(" ", firstSpace+1);
        String str2 = str.substring(firstSpace + 1);
        String secondWord;
        if(nextSpace>0) {
            secondWord = str.substring(firstSpace+1, nextSpace);
        }else {
            secondWord = str2;
        }
        System.out.println("Второе слово в этой строке является "+ secondWord);
    }
}
