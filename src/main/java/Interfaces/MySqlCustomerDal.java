package Interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
    public void Add(){
        System.out.println("My Sql eklendi");
    }
}
