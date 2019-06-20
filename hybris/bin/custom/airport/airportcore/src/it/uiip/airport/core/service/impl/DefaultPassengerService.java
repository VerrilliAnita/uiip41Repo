package it.uiip.airport.core.service.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import de.hybris.platform.core.model.user.AbstractUserAuditModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.core.model.user.UserPasswordChangeAuditModel;
import de.hybris.platform.servicelayer.user.exceptions.CannotDecodePasswordException;
import de.hybris.platform.servicelayer.user.exceptions.PasswordEncoderNotFoundException;
import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;

public class DefaultPassengerService implements PassengerService {

	@Resource 
	private PassengerDao passengerDao;
	@Override
	public UserModel getUser(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel getUserForUID(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends UserModel> T getUserForUID(String var1, Class<T> var2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserExisting(String var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserGroupModel getUserGroup(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserGroupModel getUserGroupForUID(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends UserGroupModel> T getUserGroupForUID(String var1, Class<T> var2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<UserGroupModel> getAllUserGroupsForUser(UserModel var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends UserGroupModel> Set<T> getAllUserGroupsForUser(UserModel var1, Class<T> var2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AbstractUserAuditModel> getUserAudits(UserModel var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPasswordIdenticalToAudited(UserModel var1, String var2, UserPasswordChangeAuditModel var3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T extends UserGroupModel> Set<T> getAllUserGroupsForUserGroup(UserGroupModel var1, Class<T> var2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMemberOfGroup(UserModel var1, UserGroupModel var2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMemberOfGroup(UserModel var1, UserGroupModel var2, boolean var3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMemberOfGroup(UserGroupModel var1, UserGroupModel var2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMemberOfGroup(UserGroupModel var1, UserGroupModel var2, boolean var3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<TitleModel> getAllTitles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TitleModel getTitleForCode(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeModel getAdminUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserGroupModel getAdminUserGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAdmin(UserModel var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAdminGroup(UserGroupModel var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAdminEmployee(UserModel var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CustomerModel getAnonymousUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAnonymousUser(UserModel var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserModel getCurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCurrentUser(UserModel var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPassword(String var1) throws CannotDecodePasswordException, PasswordEncoderNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPassword(String var1, String var2) throws PasswordEncoderNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPassword(String var1, String var2, String var3) throws PasswordEncoderNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPassword(UserModel var1, String var2, String var3) throws PasswordEncoderNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPassword(UserModel var1, String var2) throws PasswordEncoderNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPasswordWithDefaultEncoding(UserModel var1, String var2) throws PasswordEncoderNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPassword(UserModel var1) throws CannotDecodePasswordException, PasswordEncoderNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEncodedPassword(UserModel var1, String var2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEncodedPassword(UserModel var1, String var2, String var3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PassengerModel> getPassengersForDate(Date date) {
		// TODO Auto-generated method stub
		return passengerDao.findPassengersByDate(date);
	}

}
