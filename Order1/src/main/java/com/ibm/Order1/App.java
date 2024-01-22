package com.ibm.Order1;
import static java.lang.System.in;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.ibm.model.Customer;
import com.ibm.model.Order;
import com.ibm.service.CustomerService;
import com.ibm.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static CustomerService cusOrService;
    static {
    	cusOrService = new CustomerServiceImpl();
    }
    private static BufferedReader br =new BufferedReader(new InputStreamReader(in));
	
	public static void main( String[] args )
    {
    	Customer cus = new Customer();
    	Order ord = new Order();
    	
    	
    	//Update Customer By Id
    	try {
			System.out.println("Enter Customer Id");
			cus=cusOrService.findByCustomerId(br.readLine());
			if(cus==null) {
				System.out.println("Invalid id");
			}else{
				System.out.println("Enter Customer Name");
	        	cus.setCustomerName(br.readLine());
	        	ord.setOrderId(cus.getOrder().getOrderId());
	        	System.out.println("Enter Order Type");
	        	ord.setOrderType(br.readLine());
	        	System.out.println("Enter Order Price");
	        	ord.setOrderPrice(Double.parseDouble(br.readLine()));
	        	System.out.println("Enter is the order confirmed?(true/false)");
	        	ord.setIsConfirmed(Boolean.parseBoolean(br.readLine()));
	        	cus.setOrder(ord);
	        	cusOrService.updateByCustomerId(cus);
	        	System.out.println(cus);
			};
		} catch (Exception e){
			e.printStackTrace();
		}
    	
    	//Delete a Record By  Customer Id
    	try {
    		System.out.println("Enter Customer Id");
    		cus=cusOrService.findByCustomerId(br.readLine());
    		if(cus==null) {
    			System.out.println("Invalid id");
    		}else{
            	cusOrService.deleteByCustomerId(cus);
            	System.out.println("deletion is successful");
    		};
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}