class Flower{

String name;
String color;
int noOfpetals;

void bloom(){
  System.out.println( color +" " + name + " " +  "is blooming...!");

}
 public static void main(String args[]){  

 Flower rose = new Flower(); 

rose.name = "Rose";
rose.color = "Red";
rose.noOfpetals = 5;

rose.bloom();

}


 }