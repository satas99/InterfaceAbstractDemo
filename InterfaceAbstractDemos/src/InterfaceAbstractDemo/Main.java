package InterfaceAbstractDemo;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args)  {
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Serhat","Ataþ",LocalDate.of(2000,2,11),"11111111111"));
		
	}

}
