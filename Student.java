class Student{
    private String name;
    private int age;
    private char grade;
    
    public String getName(){
     return name;
    }
    public void setName(String newName){
    name = newName;
    }
    public int getAge(){
     return age;
    }
    public void setAge(int newAge){
        if(newAge >=1 && newAge <=100){
    age = newAge;}
    else{
      System.out.println("invalid number");
    }
    }
    public char getGrade(){
     return grade;
    }
    public void setGrade(char newGrade){
        if(newGrade >='A' && newGrade <='F'){
    grade = newGrade;
    }
    else {
        System.out.println("invalid grade");
    }
}
    public void displayInfo(){
     System.out.println(name +" "+ age+" "+ grade);
    }
}