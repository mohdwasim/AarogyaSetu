/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aarogya;

import java.util.Scanner;

/**
 *
 * @author SUPER
 */


public class AarogyaSetuAssessFun {

    public AarogyaSetuAssessFun() {
    }

    // access specifier return type function name(para)
    public static void main(String args[])
    {
        /*
Are you experiencing any of the following symptons?
cough
fever
difficulty in breathing
None of the above
*/

        
        System.out.println("Are you experiencing any of the following symptons?\n"
                + "1- cough\n2- fever\n3- difficulty in breathing\n4- None of the above\n");
        System.out.print("your answer(enter the choice no):");
        Scanner sc=new Scanner(System.in);
        int question1= sc.nextInt();
        
    
/*
Have you ever had any of the following:

Diabetes
Hypertension
Lung disease
Heart Disease
None of the above
*/



    
        System.out.println("Have you ever had any of the following:\n"
                + "1- Diabetes\n2- Hypertension\n3- Lung disease\n4- None of the above\n");
        System.out.print("your answer(enter the choice no):");
        int question2= sc.nextInt();
    /*
Have you traveled anywhere internationally in the last 28-45 days?
yes
No
*/


        System.out.println("Have you traveled anywhere internationally in the last 28-45 days?\n"
                + "1- Yes\n2- No\n");
        System.out.print("your answer(enter the choice no):");
        int question3= sc.nextInt();
        
        
        /*
Which of the following apply to you?

I have recently interacted or lived with someone who has tested positive for COVID  19

I am a heathcare worker and I examined a COVID-19 confirmed case without protective gear

None of above
*/


        System.out.println("Which of the following apply to you?\n"
                + "1- I have recently interacted or lived with someone who has tested positive for COVID  19\n2- I am a heathcare worker and I examined a COVID-19 confirmed case without protective gear\n3- None of the above\n");
        System.out.print("your answer(enter the choice no):");
        int question4= sc.nextInt();
        
        
        String result="";
        
        if(question1==4 && question2==4 && question3==2 && question4==3 )
        {
            result= "your infection risk is low. we recommend that you stay at home to avoid nay chance of exposure to the novel coronavirus.";
        }
        else
        {
            
            
            //3- risk high 1,3- risk high 1-risk high 1-risk high
            
       if(question1==3 || question2==3||question2==1 || question3==1|| question4==1)
       {
                     result= "your infection risk is High. we recommend that you quarantine yourself and call on toll free number 111111000 or email at covid19@gov.in";
  
       }
       else
       {     
                       result= "your infection risk is High. we recommend that you stay at home and quarantine yourself";

       }

        }
        
        System.out.println(result);
        
        //result
// your infection risk is low. we recommend that you stay at home to avoid nay chance of exposure to the novel coronavirus.
    
    }
            
    
}
