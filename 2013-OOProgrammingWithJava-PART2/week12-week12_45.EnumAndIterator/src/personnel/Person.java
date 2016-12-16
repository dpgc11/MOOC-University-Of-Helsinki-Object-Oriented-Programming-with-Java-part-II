/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Yogesh
 */
public class Person {
    
    private String name;
    private Education education;

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    @Override
    public String toString() {
        return getName() + ", " + getEducation();//To change body of generated methods, choose Tools | Templates.
    }

    public Education getEducation() {
        return education;
    }

    public String getName() {
        return name;
    }
    
    
    
    
    
}
