/**
 * @author         zchangyu
 * @Date           2018年4月1日 下午5:01:52
 * @Description    TODO（一句话描述）
 */
package com.hospital.regsystem.service;

import java.util.List;

import com.hospital.regsystem.pojo.Doctor;

public interface IDoctorService {
	public Doctor selectById(int did,int oid);
	public Doctor selectByDname(String dname,int oid);
	public List<Doctor> selectAll();
	public List<Doctor> findDoctorBy(String workid, int oid, String dname, String tel);
	public int selectCount(int oid);
	public void adddoctor(String workid, String dname, String dsex, int role, int cost, String username, String username2,String tel, int oid, String place);
	
	public Doctor selectBy(String username);
	
}
