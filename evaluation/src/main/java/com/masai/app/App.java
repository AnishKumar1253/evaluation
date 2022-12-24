package com.masai.app;

import com.masai.app.entity.Device;
import com.masai.app.service.impl.DeviceServiceImpl;
import com.masai.app.utils.EmUtils;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;

public class App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		//this crud app has been made with normal entity manager ops (find,persist,remove,merge)
		DeviceServiceImpl deviceServiceImpl=new DeviceServiceImpl();
		//adding a device
		
//		Device device=new Device(30,"model_no_4","MI","Mobile",2000,"48px","dimensity","64GB",
//				"oxygenos","6inch");
//		Device device=new Device(40,"model_no_29","MacBook Pro","Laptop",20000,"20px","M1","64GB",
//				"macintosh","15inch");
//		Device device=new Device(70,"model_no_34","Samsung","Tablet",5000,"30px","snapdragon","128GB",
//				"oxygenos","8inch");
		
//		deviceServiceImpl.DeviceAdd(device);
		
		//getting a device
//		Device device=deviceServiceImpl.DeviceGet(40);
//		System.out.println(device);
		
		//update a device
//		EntityManager em=EmUtils.getEntityManager();
//		Device device=em.find(Device.class, 70);
//		device.setBrand("HP");
//		deviceServiceImpl.DeviceUpdate(device);
		
		//deleting a device
//		deviceServiceImpl.DeviceDelete(40);
		
		
		
		//using jpql below crud operations are being executed
		//let us do this with the help of switch case 
		boolean flag=true;
		while(flag)
		System.out.println("1.Adding a Device");
		System.out.println("2.Getting the device");
		System.out.println("3.Updating the device");
		System.out.println("4.Deleting the device");
		System.out.println("5.Get all Devices");
		System.out.println("6.Exit");
		System.out.println("Enter your choice");
		int ch=scan.nextInt();
		switch(ch) {
			case 1:
				System.out.println("Enter device_id");
				int id=scan.nextInt();
				System.out.println("Enter model");
				String model=scan.next();
				System.out.println("Enter brand");
				String brand=scan.next();
				System.out.println("Enter type");
				String type=scan.next();
				System.out.println("Enter price");
				int price=scan.nextInt();
				System.out.println("Enter camera_spec");
				String camera_spec=scan.next();
				System.out.println("Enter processor_spec");
				String processor_spec=scan.next();
				System.out.println("Enter memory_spec");
				String memory_spec=scan.next();
				System.out.println("Enter os_spec");
				String os_spec=scan.next();
				System.out.println("Enter size_spec");
				String size_spec=scan.next();
				Device device = new Device(id,model,brand,type,price,camera_spec,processor_spec,
						memory_spec,os_spec,size_spec);
				deviceServiceImpl.DeviceAdd(device);
				break;
			
			case 2:
				System.out.println("Enter device_id");
				int device_id=scan.nextInt();
				Device d1=deviceServiceImpl.DeviceGet(device_id);
				System.out.print(d1);
				break;
				
			case 3:
				System.out.println("Updating the brand as of now");
				System.out.println("Enter device_id");
				int d_id=scan.nextInt();
				System.out.println("Enter new brand name");
				String new_brand=scan.next();
				Device d2=EmUtils.getEntityManager().find(Device.class, d_id);
				d2.setBrand(new_brand);
				deviceServiceImpl.DeviceUpdate(d2);
				break;
				
			case 4:
				System.out.println("Enter device_id");
				int d1_id=scan.nextInt();
				deviceServiceImpl.DeviceDelete(d1_id);
				break;
				
			case 5:
				List<Device> devices=deviceServiceImpl.GetAllDevice();
				System.out.println(devices.toString());
				break;
			case 6:
				flag=false;
				break;
		}
		
		

	}

}
