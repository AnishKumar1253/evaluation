package com.masai.app.service;

import java.util.List;

import com.masai.app.entity.Device;

public interface DeviceService {
	public void DeviceAdd(Device device);
	public Device DeviceGet(int device_id);
	public List<Device> GetAllDevice();
	public void DeviceUpdate(Device device);
	public void DeviceDelete(int device_id);
}
