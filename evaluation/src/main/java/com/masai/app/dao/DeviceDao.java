package com.masai.app.dao;

import java.util.List;

import com.masai.app.entity.Device;

public interface DeviceDao {
	public void addDevice(Device device);
	public Device getDevice(int device_id);
	public List<Device> getAllDevices();
	public void updateDevice(Device device);
	public void deleteDevice(int device_id);
}
