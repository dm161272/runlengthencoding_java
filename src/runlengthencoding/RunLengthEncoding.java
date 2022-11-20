/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runlengthencoding;

/**
 *
 * @author tim
 */
public class RunLengthEncoding {

    /**
     * @return 
     */
    
   public static String encodeStr(String str) {
 
    char[] charArr = str.toCharArray();

    int  counter =1;
    //compare each element with its next element and 
    //if same increment the counter
    String sb = "";
    String sb1 = "";
    for (int i = 0; i < charArr.length; i++) {
        
        if(i+1 < charArr.length && charArr[i] == charArr[i+1]){
            counter ++;
        }
        else {
            sb1 = Integer.toString(counter) + Character.toString(charArr[i]);
            sb = sb + sb1;
            counter = 1;
        }
        
    }
    return sb;
}
        
}

