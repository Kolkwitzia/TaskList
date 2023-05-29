/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to.pkgdo.list;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kolkwitzia
 */
public class Task {
    private int id;
    private String name;
    private Date dueDate;

    public Task(int id, String name, Date dueDate) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
      }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    
    
    
    public static ArrayList<Task> tasks = new ArrayList<>();
    
    public static Task CheckId(int id)
    {
        Task found = null;
        for(Task tk: tasks)
        {
            if(tk.getId() != id && tk.getId()>0)
            {
                found = tk;
                break;
            }
        }
        return found;
    } 

    @Override
    public String toString() {
        return name;
    }
    
    
}
