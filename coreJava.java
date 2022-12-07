* static = Class level (eg. interest, calculateInterest())
Non static = Object level (eg. accBalance, withdrawl(), checkBalance())

* there is one block which is loaded before the main method, which is static block, it is used to initialise the variables,
 save any data into the db etc

public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World");
	}
	static {
		System.out.println("Static Block");
	}
}

output:
Static Block
Hello World

We can have multiple static blocks in a single class

*static method doesn't need object to get called, ClassName.staticMethod() will work

* similarly non static block gets called before the constructor, when object of a class is created

* static block gets executed only once when class gets loaded whereas non-static block gets executed whenever object of 
that class gets created

* constructor doesn't have any return type but they implicitly returns the address of an memory location which is assigned
 to a particular object.staticMethod

* Primitive Type: byte, short, int, long, char, float, double, boolean
Reference Types: class, Array, String, etc.

* to initialise a float variable, we should add f after the float number; float f = 1.23f;

* We generally make anything static which is common for all the objects of that class. (eg. bankName for a bank class)

* local variable should be initialised at the time of declaration itself.

* we can't use modifiers(public, private etc) for a local variable.

* Boxing: Conversion of Primitive type to Object
Unboxing: Conversion of Object type to Primitive type

int a = 10;
Integer b = Integer.valueOf(a); //primitive to Wrapper class(Object Type)
int c = b.intValue(); //Wrapper class to primitive

byte x = 100;
String s = Byte.toString(x); //Primitive type to String
byte y = Byte.parseByte(s); //String to Primitive type

long x = 1000;
Long y = Long.valueOf(x); 
//another way
Long y = new Long(y);
String s = y.toString(); //Object Type to String
Long z = Long.valueOf(s); //String to Object Type
//another way
Long z1 = new Long(s);

* to pass command line arguments from eclipse
down arrow at run 
then run configurations
plus icon on top left(new launch configurations)
click on arguments tab
in program arguments pass arguments
then run

* Relational operators can't be applied to boolean types (this is wrong true>false)

* bitwise operator
	^ XOR returns true if both the arguments are different (eg. true^true = false, true^false = true, false^false = false) 
	& AND checks both the arguments even if first one is false, can be applied to integers as well as boolean
	| OR 
	~ Bitwise unary complement converts the bits and can only be applied to integers (eg. ~10011 = 01100 )

* short circuit operator
	&& can only be applied to boolean arguments, it doesn't check the second argument if first argument is false
	|| same as above but doesn't check the second argument if first argument is true

* switch statement
we can use constants in the case check
int b = 20;
switch(a){
	case 10:
		sysout('10');
		break;
	case b://error; but if we make 'b' as final then its ok (eg. final int b = 20)
		sysout('20');
		break;
}
expressions are also allowed but it should return a constant

* default access modifier is the <package> level modifier. which means that something whose access modifier is not mentioned,
can be accessed anywhere within that package not in any other package.

* access modifiers can't be used to specify a block only variable, method, constructor can be given an access modifier

* protected: entity can be accessed inside that package and inside the class which has inherited the parent class where that,
entity is created. That too with the child class's object not with the parent class's object.

* private: can only be accessed inside that class where that entity is declared.

* public: can be accessed anywhere inside or outside that package.

* java.lang.* package is implicitly included into every java program at the time of compilation. That is why we can use its
classes without explicitly importing the java.lang package.

* Static Import: we use System.out, Integer.parseInt because out, parseInt are the static methods therefore we use ClassName.methodName,
but we can skip that by static import like eg. import static java.lang.Integer.* so after that we can directly use parseInt
method without again and again specifying Integer.parseInt.


* Every java class extends java.lang.Object class implicitly. Therefore we can say that every class implicitly implements
Single level inheritance.

* Java doesn't implements multiple inheritance, so one can say that a class can extends another class and it has already
extended Object class so that's multiple inheritance, but no, we a class starts extending another class then it doesn't
extend Object class, Object class comes from Parent class (as parent class will be extending Object class).

* we can create object of a class in another class of same package, we do not need to extend that class in order to create
its object. But if A is inherited inside B and we have created B's object inside C of same package then B's object can access
A's members as well bcz B has inherited A.

* Memory Allocation: If A is inherited inside B and we have created B's object inside C then we will see that both B and
A will be sharing same memory location (we can see that by creating constructors inside A and B and printing this inside them).

* Practical application of method overriding & super keyword
Parent class Oneplus 9
Child class Oneplus 10
so inside test class we will instantiate Oneplus 10 class and oneplus 10 will override few methods of Oneplus 9 (eg. processor)
as processor would be different and the latest one. So that's method overriding
and in few of the cases oneplus 10 will add some more features in its class and will also include the basic features of
Oneplus 9 (its parent) so to add Oneplus 9's features like camera old features, Oneplus 10 will add super.camera(); call 
inside its (oneplus 10) camera method. So when test will use Oneplus 10's camera then it will get the basic camera features
of Oneplus 9 as well as advanced features of Oneplus 10.

* super keyword: One cannot print super keyword as one can print this, it will be a error, it just points to the parent class
nothing else.

* super method: it is used to invoke the parent class's constructor (mainly parameterised) bcz if we create constructor of
child class and if parent class doesn't have default constructor then parameterised won't get invoked automatically.

* constructor chaining, this method: if we want to invoke another constructor of same class from one constructor then we
can do that by using this(); , if that another constructor is parameterized then this(19);

* super() or this() should be the first statement in the constructor.

* if a parent class has parameterized constructor and doesn't have default constructor then we need to call that parameterized
constructor from child constructor extending parent class.

* overriding: method signature(name and parameters) should match in case of method overriding

* Abstract Class: cannot be instantiated (mnz we cannot make object of an abstract class).

* Abstract class: can contain main method.

* Partial Abstraction: is done by extending the abstract class and complete abstraction is achieved by implementing(extending) an interface.
which contains only abstract methods.

* abstraction: class extending an abstract class have to implement all the abstract methods of the abstract class or will
have to declare itself abstract as well.

* abstraction: abstract method cannot be made static. Abstract class connot be made final. 

* Usecase of static method: if a company BMW wants its modals to definitely keep some functionalities to implement according
to their models that it should be there then BMW abstract class will make those functionality methods as abstract. So any
class extending the BMW abstract class will have to implement those functionlities to be able to extend BMW. Its like a
contract that one needs to stick to.

* Interface: compiler implicitly marks every method of an Interface as public and abstract. Variables are public, static &
final in an interface which mnz we will have to initialise a variable at the time of declaration in an interface. It cannot
define blocks and constructors.

* final: if a class is made final then that class cannot be extended. If a method is made final then we cannot override
that method in the child class. So if we want our class should not be inherited then we can make that class as final.

* final variable: we can skip assigning value to a final variable at the time of declaration but we will have to initialise 
it inside the constructor of that class.

* real time application: in real time applications we make constants as final static so that their value should not get
changed and static so that we don't have to create object of that class to use them. But we have to initialise a static
final variable at the time of its declaration.

* Marker Interface: is the one which doesnt contain any methods. There are some inbuilt marker interfaces (like Serializable, 
	Cloneable, RandomeAccess) implementing which will add some capabilites to our class's object.

* We cannot implement two interfaces in a single class if those two interfaces contain a method with same name but different
return types. 

* abstract method: do not contain a body.

* class containing abstract method should be abstract itself.

* Complile time polymorphism: is also known as Static binding and is achieved by method overloading.
Runtime time polymorphism: is also known as dynamic binding and is achieved by method overriding.

* method overloading: in this either type of parameters should be different or the number of parameters should be different.

* method overriding: Macbook m1 = new MacbookPro();
Macbook m2 = new MacbookAir(); 
//this is also known as upcasting
in this child class reference is assigned to parent class's object (or can be assinged to interface/abstract class which
parent class has implemented/extended), and that decision of which child class reference is to be assigned can be decided
at runtime.

* Interface: advantages of using interfaces are to achieve multiple inheritance and complete abstraction.
Eg. List is an interface containing method declaration of add and get, ArrayList & LinkedList are the classes which implements
List interface.

* Inheritance: Visibility cannot be downgraded in inheritance. eg. if a parent class contains a public method then child class
overriding that public method cannot make it default.

* Downcasting: if we want to call any method which is specific to the child class (which mnz the parent class doesn't contain
	that method) in the case of runtime polymorphism then we will first have to downcast the object to another object and
	then invoke that method.

	MacbookPro m3 = (MacbookPro) m1;
	m3.specificMethodToMacbookPro();

* Auto Promotion: this comes into play in method overloading. If integer is passed and no integer parameter is there then
compiler will promote the int type to next upper version which is long, if long is also not present then float then double.
If none is present then it will throw an error.
In the case of object then compiler will first check for the child version of the method if available then will invoke that
method overwise will invoke its parent class parameter(if present).

* Inheritance: static method of parent class should be static in child class as well(if overriden) and if a method is not
static in parent class then it can't be static in child class (if overriden)

* overriding in case of variables: if both parent and child class contains same variable
Parent p = new Child();
and then that variable is used/printed with p.variableName then Parent's variable will be used (unlike method overriding).

* main method: can also be overriden and overloaded. If a child class doesn't contain a main method and if we run that child
class then Parent class's main method will be invoked.

* Exception class hierarchy: parent class is Throwable which is in java.lang package, child classes are Exception, Error.
Exceptions(NoClassDefFoundError, OutOfMemoryError, NoSuchMethodError) falling under Error class can't be handelled.

* Checked Exception: classes inheriting directly from parent class Exception are called checked exception. These exceptions
are mandatory to be handled by try catch block before running the code.

* Unchecked Exception: classes inheriting from class RuntimeException are known as Unchecked Exception. 

* throws: if some part of code can throw an exception and doesn't even keep that in try catch block then the method containing
that code can throw that exception by throws keyword and the method calling that method will have to handle that exception,
if at last even main method doesn't catches that exception then JVM auto exception handler will handle that exception.
eg. void methodName() throws exceptionName{
//code which might throw an error
}

* Exception Handling: catch block can keep the name of parent class to catch its child class exception. 
eg. catch(Exception e){
	//this will catch all the exceptions
	//but this catch block should be the last catch block
}

* Assertion: this was introduced in Java 1.4 and they are mainly used for testing and debuging the code in place of
system.out.println statements

* thread: main method is the first thread that JVM makes

* multi-threading: can be achieved by two ways, one by extending Thread class and another is to implement the Runnable
interface. When we invoke the start method on the object of the class then JVM runs/calls the run method on another thread
which we must have implemented.

* sleep: is the static method on the Thread class. It sends the thread into the sleep mode for the time which we must have
specified.

*Collections:

There are 3 subinterfaces of Collection interface: List, Set, Queue

The classes which implements List interface: ArrayList, LinkedList, Stack, Vector(rarely used)
Classes which implements Set interface: HashSet, LinkedHashSet, TreeSet, EnumSet(rarely used)
Classes which implements Queue interface: ArrayDeque, LinkedList, PriorityQueue
Map is bit different as compared to other Collection interfaces as others store values but Map stores key-value pairs. 
There is one more interface, Map
Classes which implements Map interface are: HashMap, TreeMap, EnumMap(rarely used), LinkedHashMap, WeakHashMap

ListIterator implements Iterator interface.

*Array has fixed size, to enter more elements we have to increase its size manually, here comes ArrayList which increases
the size of the array internally automatically.
ArrayList<String> names = new ArrayList<>();
OR
List<String> names = new ArrayList<>();

*Arrays are fixed in size, are homogeneous in nature mnz it can only contain elements of single type and they don't have any
underlying DS so we can't use any predefined methods.

*Collections comes into picture to overcome above array's limitations. Still array is recommended if we know the number of
elements in advance as Collections are growable in nature and storage comes with cost also with more storage performance will
decrease. 
Collections can only hold Objects (like Integer, String, Character, etc) not Primitive datatypes (like int, char, etc).

*Collection Framework provides various classes and interfaces which can be used to represent collection (group of individual
objects as a single entity).

*Default size of ArrayList is 10 and it increases the size of array by (n/2) + 1.
eg. if there are 10 elements entered in an array and then we have to enter 11th element then it will internally increase,
length of array to 16 which is 10 + (10/2) + 1 = 10 + 5 + 1 = 16
Basically it will create a new array with the required size and then will copy elements of the old array to a new one and
then will dump the previous array.

names.add("aman"); //this adds the element at the end
names.add(1, "raj"); //this adds the element at index 1, other elements are shifted towards right of that array
names.addAll(names2); //this adds another list (names2 here) to the list on which addAll method is called, it appends in
the last. 

names.get(1); //to get the element at passed index (1 here) //O(n)
names.remove(1); //it removes the element from passed index and will move all the other element to left. //O(n)
listy.remove(Integer.valueOf(30)); //it removes the specific element whih we have passed
names.clear();
names.set(0, "raman"); //it changes the value of the index passed, this will remove "aman" and will store "raman" after this
call //O(1)
names.contains("raj"); //this will return true or false. O(n)
names.size(); //returns number of elements in the arrayList
System.out.println(names); //to print all the elements of that arrayList

*for each loop
for(String ele: names){
	System.out.println(ele);
}

*Iterator
Iterator<String> it = names.iterator();

while(it.hasNext()){
	System.out.println(it.next());
}

*Stack 
Stack<String> animals = new Stack<>();
animals.push("Lion");
System.out.println(animals); //to print all the elements of the stack
animals.peek(); //to get the element which is on top
animals.pop(); //to remove the top element of the stack
animals.isEmpty();

*Queue
Queue<String> animals = new LinkedList<>();
animals.offer("tiger"); //it inserts the element into the Queue, animals.add("tiger") will also work
animals.poll(); //it removes the first element of the Queue as well as returns that removed element
animals.peek(); //it returns the first element of the Queue
animals.size(); //it checks the size/length of the Queue

*PriorityQueue
Queue<Integer> pq = new PriorityQueue<>(); //internally it implements min heap by default
pq.offer(24); //it inserts the element into the queue
pq.offer(10);
pq.offer(50);
pq.poll(); //it removes and returns the element whose priority is maximum, by default element whose value is minimum has
		   //the highest priority (will return 10 in this case)
pq.peek(); //returns the element with highest priority

//to change the priority according to our need, we need to pass a comparitor in its constructor
Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //here we have used predefined comparator; in this case
																    //it will implement max heap internally

*ArrayDeque //this is same as queue but in this we can remove/add element from/in both the direction
Queue<Integer> deq = new ArrayDeque<>();
deq.offer(22); //inserts the element into the last, same as normal queue
deq.offerFirst(34); //inserts the element in the front
deq.offerLast(87); //inserts the element in the last
deq.peek(); //returns the element from the last
deq.peekFirst(); //returns the element from the front
deq.peekLast(); //returns the element from the last
deq.poll(); //removes and returns the element from the last
deq.pollFirst(); //removes and returns the element from the front
deq.pollLast(); //removes and returns the element from the last

*Set doesn't allow duplicate entries.

*HashSet
It stores the unique elements in the random order.
Set<Integer> set = new HashSet<>();
set.add(23); //for adding element into the HashSet
set.add(23); //it won't add another 23
set.remove(23); //for removing element from the HashSet
set.contains(23); //to check whether element is present or not (returns boolean)
set.isEmpty(); //returns boolean, to check whether HashSet is empty or not
set.size(); //to check number of elements in the HashSet
set.clear(); //to delete all the elements from the HashSet

*LinkedHashSet
It stores unique elements in the same order as elements are inserted into it. Rest all the methods are same as that of HashSet. 

*TreeSet
It stores unique elements in the sorted order (ascending order in the case of Integer elements). It is internally 
implemented using BST. 

*Map
It stores key-value pairs where keys will be unique.

*HashMap 
It stores key-value pairs randomly in the map 
Map<String, Integer> num = new HashMap<>();
num.put("One", 1);
num.put("Two", 2);
num.put("One", 5); //this will override value of key "One"
num.get("One"); //returns 5
num.containsKey("Two"); //returns boolean and tells whether that key is present in the HashMap or not
num.containsValue(3);
num.putIfAbsent("Two", 3); //enters key value pairs only if that key is not present from before
num.isEmpty();
num.clear();
num.remove("Two");

//for iterating the map
for(Map.Entry<String, Integer> e: num.entrySet()){
	System.out.println(e);
	System.out.println(e.getKey());
	System.out.println(e.getValue());
}

//for getting all the keys of a map
for(String key: num.keySet()){
	System.out.println(key);
}

//for getting all the values of a map
for(Integer value: num.values()){
	System.out.println(value);
}


*TreeMap
It stores key-value pairs in order in the map (if keys are String then it will store in alphabetical order, if Integer then
ascending order). All the methods are same as HashMap. 

*Arrays class 
int index = Arrays.binarySearch(nums, 4); //it will search in the nums array which is already sorted in ascending order and
										  //will return that element's index 

Arrays.sort(nums); //this will sort your nums array, it uses quick sort internally
Arrays.fill(nums, 12); //this will fill your array with a value passed by you at every index

*Collections class 
Collections.min(list); //returns the minimum element in the collection used
Collections.max(list);
Collections.frequency(list, 9); //returns the number of times 9 is present in the collection used
Collections.sort(list);
Collections.sort(list, Comparator.reverseOrder());
Collections.reverse(mylist); //returns void; converts mylist to its reverse order, does not return anything 
Collections.swap(ArrList, 1, 2); //will swap index 1 and 2 with each other of ArrayList "ArrList"

*merge two lists
l1.addAll(l2); //l1=l1+l2

*to get the absolute (-4 to 4, 4 to 4)
Math.abs(num); //will return the absolute of num


*int to String | Integer to String
int i = 10;
String str = String.valueOf(i); //"10"


*String functions
String a = "abc";
String b = "xyz";
String c = a.concat(b); //abcxyz

String d = a.replace("a", "A"); //Abc


*If you want to copy part of one array into another array
int b[] = Arrays.copyOfRange(a, 0, pos); //this will copy array "a" from position 0 to pos-1 to "b"


*Custom Comparator
//add following class
class Sortbyroll implements Comparator<Student> {
 
    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {
 
        return a.rollno - b.rollno;
    }
}

Collections.sort(ar, new Sortbyroll()); //this will sort ArrayList<Student> "ar" wrt rollno