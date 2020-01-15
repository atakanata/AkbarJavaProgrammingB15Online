package office_hour.offer_hour_01_15;

public class TeacherTest {


    public static void main(String[] args) {

        Teacher t1 = new Teacher();
//        t1.setName("Sventlana");
//        t1.setAge(19);
        t1.initializeFields("Nuran", 18);

        System.out.println("t1.getAge() = " + t1.getAge());
        System.out.println("t1.getName() = " + t1.getName());


    }

}
/*


----------------------

Class and Object

Class is a template for Object
it can define what kind of attribute and behaviour an object should have

attrinute : -->> instance variables | fields
behaviour : -->> instance methods

Object is the actual thing created out of this template
and any object created out of same template will have the attribute and behaviours defined in the template


Protecting the data|attribute of the object
we can encapsulate the instance field by making it private and provide public getters and setters

we have 4 access modifier : public , protected , default , private
(IGNORE protected for now until inheritance topic comes in )

public -->> accessible anywhere
default -->> no access modifer
		--> only within the package , also known as package private
private -->> only accessible within the same class


outside of the class when we create object we can give a object any name we want , like p1, p2  or any other name

if we want to refer the object in the template itself , we can use the keyword -->> this --> the current object we are working on

so outside the template it would look like  :
	Person p1 = new Person() ;
	p1.age = 18 ;
	p1.eat() ;

inside your template it would look like  :
	this.age -->> to point to the instance field age
	this.name -->> to point to the instance field name
	this.eat();  // optional , usually it will just work without



public class Person{

	private int age ;
	private String name;

	public int getAge(){
		return age ; // return this.age;
	}
	public void setAge(int age){
		this.age = age ;
	}
	public String getName(){
		return name; // return this.name;
	}
	public void setName(String name){
		// BUNCH OF VALIADITON I CAN USE HERE ....
		this.name = name ;
	}


	public void eat(){
		print(name + "eating") ;
	}


}


* */
