/*
Listing 11.6 DynamicBindingDemo.java
 */

public class DynamicBindingDemo
{
    public static void main(String[] args)
    {
        m(new GraduateStudent());
        m(new Students());
        m(new Persons());
        m(new Object());
    }

    public static void m(Object x)
    {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Students
{

}

class Students extends Persons
{
    @Override
    public String toString()
    {
        return "Student";
    }
}

class Persons extends Object
{
    @Override
    public String toString()
    {
        return "Person";
    }
}
