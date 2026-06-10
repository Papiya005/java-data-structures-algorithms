// public class OOPS {
//    public static void main(String args[]){
//     Pen p=new Pen();
//     p.color="red";
//     p.tip=6;
//     p.password="abcd@abd";
//     p.marks[0]=100;
//     p.marks[1]=98;
//     p.marks[2]=89;
//     Pen s2=new Pen(p);
//      p.marks[2]=90;
//     System.out.println(s2.color);
//     System.out.println(s2.tip);
//     System.out.println(s2.marks[0]);
//     System.out.println(s2.marks[1]);
//     System.out.println(s2.marks[2]);
    
//    }
    
// }
// class Pen{
//    String color;
//      int tip;
//      String password;
//      int marks[]=new int[3];
//      Pen(Pen p){
//       this.color=p.color;
//       this.tip=p.tip;
//        System.out.println(p.marks[0]);
//     System.out.println(p.marks[1]);
//     System.out.println(p.marks[2]);

//      }
//      Pen(){

//      }

//   //  String getColor(){// getter
//   //    return this.color;
//   //  }
//   //  int getTip(){// getter
//   //   return this.tip;
//   //  }
//   //   void changeColor(String newColor){// setter
//   //     this.color=newColor;
//   //   }
//   //   void setTip(int newTip){// setter
//   //     this.tip=newTip;
//   //   }
// }


// inheritance

// public class OOPS{
//   public static void main(String args[]){
//   peacock f=new peacock();
//   f.eat();
//   f.breath();
//   f.fly();
//   f.fins=4;
//   System.out.println(f.fins);
//   }

// }
// class Animals{
//   String color;
//   String name;
//   void eat(){
//     System.out.println("eats");
//   }
//   void breath(){
//     System.out.println("breaths");
//   }
// }
// class fish extends Animals{
//  void fins(){
// System.out.println("fins");
//   }

// }
// class tune extends fish{

// }
// class shark extends fish{

// }
// class birds extends Animals{
//   void fly(){
//     System.out.println("flies");
//   }
 
// } 
// class peacock extends birds{
// int fins;
// }
// class mammals extends Animals{
//  void walk(){
//   System.out.println("walks");
//  }
// }
// class dog extends mammals{
// }
// class cat extends mammals{
// }
// class human extends mammals{
// }
// polumorphism 

//method overloadig
// public class OOPS{
//   public static void main(String args[]){
// Calculator calc=new Calculator();

// System.out.println(calc.sum(3, 30));
// System.out.println(calc.sum((float)3.0, (float)30.78));
// System.out.println(calc.sum(3, 30,56));
//   }
// }
// class Calculator{
//    int sum(int a,int b){
//     return a+b;
//   }
//   float sum(float a,float b){
//    return a+b;
//   }
//  int sum(int a,int b,int c){
//  return a+b+c;
//   }
// }
// method overrididng=>super class and subclass both contains the same function and same parameters but dofferent their definition

// public class OOPS{
//   public static void main(String args[]){
//   Overriding over=new Overriding();//eat it
//   over.eat();
//    override over1=new override();
//   over1.eat();// eat over it
//   }
// }
// class Overriding{
//   void eat(){
//     System.out.println("eat it");
//   }

// }
// class override extends Overriding{
//   void eat(){
// System.out.println("eat over it");
//   }
// } 


// interface
// public class OOPS{
//   public static void main(String args[]){
//   chicken ch=new chicken();
//   ch.walk();
//   ch.eat();
//   ch.color="brown";
//    System.out.println(ch.color);
//   peacock p=new peacock();
//  p.eat();
//  p.walk();
//   }
// }
//    abstract class Animals{ 
//    String color;
//    Animals(){
// System.out.println("dark green");

//    }
//    void eat(){
//     System.out.println("eat anything");
   
//    }
//      abstract void walk();// abstract method
//  }
//  class chicken extends Animals{
//   chicken(){// have constructor
//   System.out.println("dark brown");// it refers first the parent class or super class=>Animals inside constructor
//   }
//   void walk(){
//     System.out.println("eats in");
//   }
//  }
//  class peacock extends chicken{
//   peacock(){
//  System.out.println("light brown");
//   }
//   void walk(){
//     System.out.println("eat that");
//   }
//  }

//interface

// public class OOPS{
//   public static void main(String args[]){

//     Queen q=new Queen();
//     q.method();
//   }
// }

// interface chessLeader{
//   void method();
// }
// class Queen implements chessLeader{
//   public void method(){
//     System.out.println("top,down,left,right(4 direction)");
//   }
  
//   }
//   class Rook implements chessLeader{
// public void method()
// {
//   System.out.println("top,down,left,right");
// }
//   }
  
// super keyword=>refer the immediate parent class obj

public class OOPS{
  public static void main(String args[]){
 Chicken ch=new Chicken();
 ch.walk();
 System.out.println(ch.color);

  }
}

class Animals{
  String color;
 void walk(){
    System.out.println("eats anything");
  }
}
class Chicken extends Animals{
  Chicken(){
super.color="brown";
super.walk();
  }


  @Override
 
  void walk(){
   System.out.println("walk with 2 legs");
  }
}