/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pan;

/**
 *
 * @author Student
 */
public class Pan {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
        // TODO code application logic here
            int i = 0;
    int num = 0;
    boolean isNeg = false;

    
    if (str.charAt(0) == '-') {
        isNeg = true;
        i = 1;
    }

   
    while( i < str.length()) {
        num *= 10;
        num += str.charAt(i++) - '0'; 
    }

    if (isNeg)
        num = -num;
    return num;
}
}
    

