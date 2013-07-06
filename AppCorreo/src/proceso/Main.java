/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proceso;

public class Main {

    public static void main(String[] args) {
        Pop3 pop3 = new Pop3("pop.javier@javiertecno.com.bo.com", "javier@javiertecno.com.bo", "java12xx");
        Thread t = new Thread(pop3);
        t.start();
    }

}
