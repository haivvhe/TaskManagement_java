/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Validation check = new Validation();
        TaskManagement cc = new TaskManagement();
        while (true) {
            System.out.println("1.Add Task");
            System.out.println("2.Delete Task");
            System.out.println("3.Display Task");
            System.out.println("4.Exit");
            int luachon = check.inputInt("Your choice: ", 1, 4);
            switch (luachon) {
                case 1:
                    cc.add();
                    break;
                case 2:
                    cc.removeTask();
                     break;
                case 3:
                    cc.display();
                     break;
                case 4:
                    System.exit(0);
            }
        }
    }
    
}
