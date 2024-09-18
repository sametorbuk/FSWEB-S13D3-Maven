package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    double heightLength;
    String hairColor;

    public Person(String firstName , String lastName , int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age =age;
    }


    public Person (String firstName , String lastName , int age, String gender , double heightLength , String hairColor){
        this(firstName,lastName,age);
        this.gender=gender;
        this.hairColor=hairColor;
        this.heightLength=heightLength;
    }


    public String getFirstName(){
        return firstName;
    }




    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }


    public boolean isTeen(){
        if(age >= 13 && age <= 19){
            return true;
        }else{
            return false;
        }
    }

}

