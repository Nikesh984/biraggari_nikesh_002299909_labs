/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Employee.Employee;
import business.Organization.AdminOrganization;
import business.Organization.DoctorOrganization;
import business.Role.AdminRole;
import business.Role.DoctorRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author neeraj
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        DoctorOrganization doctorOrganization = new DoctorOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);
        
        
        Employee employee = new Employee();
        employee.setName("Akeem of Zamunda");
        
        Employee employee1 = new Employee();
        employee1.setName("Nikesh");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        
        UserAccount account1 = new UserAccount();
        account1.setUsername("nikesh");
        account1.setPassword("nikesh");
        account1.setRole(new DoctorRole());
        account1.setEmployee(employee1);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        doctorOrganization.getEmployeeDirectory().getEmployeeList().add(employee1);
        doctorOrganization.getUserAccountDirectory().getUserAccountList().add(account1);
        
        return business;
    }
    
}
