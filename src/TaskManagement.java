
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TaskManagement {
     private List<TaskManager> list;
    private Validation check;

    public TaskManagement() {
    list = new ArrayList<>();
    check = new Validation();
    }
    public void add(){
        int ID;
        if(list.size()==0){
            ID=1;
            
        }else{
            ID= list.get(list.size()-1).getId()+1;
        }
        String name= check .inputString("Requirment Name: ");
        int typeID= check.inputInt("Task type: ", 1, 4);
        String date = check.inputDate("Date: ");
        double from = check.getFromTo("From (Start 8.0): ");
        double to= check.getFromTo("To (End 17.5): ");
        String assign = check.inputString("Assignee: ");
        String Reviewer= check.inputString("Reviewer:");
        TaskManager cc = new TaskManager(ID, typeID, name, assign, Reviewer, date, from, to);
        list.add(cc);
        System.out.println("Add succesfully");
    
}
    public void removeTask(){
        int ID = check.inputInt("Enter ID:", Integer.MIN_VALUE,Integer.MAX_VALUE);
        int size= list.size();
            for (int i = 0; i < size; i++) {
            TaskManager e = list.get(i); // get truy cap cac ptu cua list
            //check id of expense equals input id or not
            if (e.getId()== ID) {
                list.remove(i);
                resetID(i);
                System.out.println("Remove successfully");
                return;
            }
        }
                  System.out.println("ID not found! failed");
    }   

// khi xóa xong thi cần reset lại id 
    public void resetID(int n) {
        int size = list.size();
        for (int i = n; i < size; i++) {
            TaskManager e = list.get(i);
            e.setId(i + 1); // vì index ơ vị tri so 0, id bat dau tu 1

        }
    }
  

    public void display(){
        System.out.println(String.format("%-4s%-15s%-15s%-20s%-20s%-20s%-20s",
                "ID","Name","Task Type","Date","Time","Assignee","Reviewer"));
        for(TaskManager e : list){
            System.out.println(e);
        }       
    }
    
}
