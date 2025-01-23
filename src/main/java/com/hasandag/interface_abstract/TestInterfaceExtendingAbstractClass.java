package com.hasandag.interface_abstract;

abstract class MyAbstractClass
{
    public abstract void myAbstractMethod();
}
//interface coudn't extends an abstract class!!!
//interface InterfaceExtendingAbstractClass extends MyAbstractClass
interface InterfaceExtendingAbstractClass
{
}
public class  TestInterfaceExtendingAbstractClass
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }

}