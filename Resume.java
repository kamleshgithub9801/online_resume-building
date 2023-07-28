package org.jsp.resumedemo;
public class Resume 
{
    public static void main(String[] args) 
    {
       // Personal Information
       String name = "Kamlesh Prasad Yadav";
       String email = "kamleshprasad9801@email.com";
       String phone = "+91 9801313131";
       
       // Education
       String[] education = {"Bachelor's in Computer Applications,  Kolhan University, 2017-2021"};
       
       // Skills
       String[] skills = {"Java", "SQL", "C++", "HTML/CSS", "JavaScript"};
       
       // Work Experience
       String[] workExperience = {"Software Developer, XYZ Company, 2021-2022",
                                  "Senior Software Developer, ABC Company, 2022",
                                  "Software Architect, DEF Company, 2023-Present"};
           
       // Display Resume
       System.out.println("Name: " + name);
       System.out.println("Email: " + email);
       System.out.println("Phone: " + phone);
       System.out.println("\nEducation:");
       for (String edu : education) {
          System.out.println("- " + edu);
       }
       System.out.println("\nSkills:");
       for (String skill : skills) {
          System.out.println("- " + skill);
       }
       System.out.println("\nWork Experience:");
       for (String workExp : workExperience) {
          System.out.println("- " + workExp);
       }
    }
 }
