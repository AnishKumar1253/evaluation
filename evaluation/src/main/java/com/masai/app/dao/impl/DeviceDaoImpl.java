package com.masai.app.dao.impl;

import java.util.List;

import com.masai.app.dao.DeviceDao;

import com.masai.app.entity.Device;
import com.masai.app.utils.EmUtils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class DeviceDaoImpl implements DeviceDao {

	public void addDevice(Device device) {
		EntityManager em=EmUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(device);
		System.out.println("Device has been added");
		em.getTransaction().commit();
		return;

	}

	public Device getDevice(int device_id) {
//		EntityManager em=EmUtils.getEntityManager();
//		Device device=em.find(Device.class,device_id);
//		return device;
		
		
		//using jpql
		EntityManager em=EmUtils.getEntityManager();
		String jpql="from Device where id=:device_id";
		Query query=em.createQuery(jpql);
		query.setParameter("device_id", device_id);
		Device device=(Device)query.getSingleResult();
		if(device==null) {
			System.out.println("No such id");
			return device;
		}
		return device;
	}
	
	public List<Device> getAllDevices(){
		EntityManager em=EmUtils.getEntityManager();
		Query query=em.createNamedQuery("device.getAll");
		List<Device> devices=query.getResultList();
		return devices;
	}

	public void updateDevice(Device device) {
//		EntityManager em=EmUtils.getEntityManager();
//		em.getTransaction().begin();
//		em.merge(device);
//		System.out.println("Device has been updated successfully");
//		em.getTransaction().commit();
//		return;
		
		
		//using jpql
		EntityManager em=EmUtils.getEntityManager();
		String jpql="update Device set brand=:brand where id=:did";
		Query query=em.createQuery(jpql);
		query.setParameter("brand", device.getBrand());
		query.setParameter("did",device.getId());
		em.getTransaction().begin();
		query.executeUpdate();
		System.out.println("Device has been updated successfully");
		em.getTransaction().commit();
		return;
	}

	public void deleteDevice(int device_id) {
//		EntityManager em=EmUtils.getEntityManager();
//		Device device=em.find(Device.class,device_id);
//		if(device==null) {
//			System.out.println("Device not present");
//			return;
//		}
//
//		em.getTransaction().begin();
//		em.remove(device);
//		System.out.println("Device has been deleted successfully");
//		em.getTransaction().commit();
//		return;
		
		
		//using jpql
		EntityManager em=EmUtils.getEntityManager();
		Device device=em.find(Device.class,device_id);
		if(device==null) {
			System.out.println("Device not present");
			return;
		}
		String jpql="delete from Device where id=:dId";
		Query query=em.createQuery(jpql);
		query.setParameter("dId", device_id);
		em.getTransaction().begin();
		query.executeUpdate();
		System.out.println("deletion successful in Device entity");
		em.getTransaction().commit();
		return;
	}

}
