/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 61050151
 */
public class StudentDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student std1 = new Student(1,"John",4.00);
        StudentTable.insertStudent(std1);
        
        
    }

   
    
}
