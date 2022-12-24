package com.masai.app.service.impl;

import java.util.List;

import com.masai.app.dao.impl.DeviceDaoImpl;
import com.masai.app.entity.Device;
import com.masai.app.service.DeviceService;

public class DeviceServiceImpl implements DeviceService {

	public void DeviceAdd(Device device) {
		DeviceDaoImpl daoImpl=new DeviceDaoImpl();
		daoImpl.addDevice(device);
		return;
	}

	public Device DeviceGet(int device_id) {
		DeviceDaoImpl daoImpl=new DeviceDaoImpl();
		Device device=daoImpl.getDevice(device_id);
		return device;
	}

	public void DeviceUpdate(Device device) {
		
		DeviceDaoImpl daoImpl=new DeviceDaoImpl();
		daoImpl.updateDevice(device);
		return;
	}

	public void DeviceDelete(int device_id) {
		DeviceDaoImpl daoImpl=new DeviceDaoImpl();
		daoImpl.deleteDevice(device_id);
		return;
	}

	public List<Device> GetAllDevice() {
		DeviceDaoImpl daoImpl=new DeviceDaoImpl();
		List<Device> devices=daoImpl.getAllDevices();
		return devices;
	}

}
