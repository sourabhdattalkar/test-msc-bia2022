interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class Abc implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
Abc obj = new Abc();  
obj.print();  
obj.show();  
 }  
}  