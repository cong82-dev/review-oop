# OOP

### 1. class & object
- class: a blueprint (thiet ke) for creating objects (a particular data structure), containing methods (functions) and attributes (data)
- object: an instance of a class ( thuc the lop nao do)

### 2. Iterface & abstract class
- Interface : 
    + just define method's signature (khong co phan than) no body
    + a class can implement multiple interfaces
    + cannot define attributes
    + cannot define method's body
    + cannot have constructor
    + cannot have access modifier for methods (all methods are public by default)
    + use to define a contract that other classes must follow
    
- Abstract class:
    + can define method's signature and method's body
    + a class can inherit only one abstract class
    + can define attributes
    + can have constructor
    + can have access modifier for methods (public, protected, private)
    + used to provide a common base class for other classes to inherit from
### 3 Inheritance (ke thua)
- define: Child class inherits properties and behaviors (attributes and methods) from Parent class
- Practical use:
    + payment system: base class Payment with subclasses CreditCardPayment, PayPalPayment, BankTransferPayment
    + employee management: base class Employee with subclasses FullTimeEmployee, PartTimeEmployee, Contractor
    + vehicle management: base class Vehicle with subclasses Car, Truck, Motorcycle
### 4. Polymorphism (da hinh)
- define: the ability of different classes to be treated as instances of the same class through a common interface
- Practical use:
    + method overloading (nap chong phuong thuc)
    + method overriding (ghi de)
    + interface implementation (thuc thi giao dien)