/**
 *
 */
package it.uiip.airport.core.service.impl;

import de.hybris.platform.core.model.user.AbstractUserAuditModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.core.model.user.UserPasswordChangeAuditModel;
import de.hybris.platform.servicelayer.user.exceptions.CannotDecodePasswordException;
import de.hybris.platform.servicelayer.user.exceptions.PasswordEncoderNotFoundException;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import it.uiip.airport.core.dao.PassengerDao;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.core.service.PassengerService;


/**
 * @author soprasteria
 *
 */
public class DefaultPassengerService implements PassengerService
{
	private PassengerDao passengerDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getAdminUser()
	 */
	@Override
	public EmployeeModel getAdminUser()
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getAdminUserGroup()
	 */
	@Override
	public UserGroupModel getAdminUserGroup()
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getAllTitles()
	 */
	@Override
	public Collection<TitleModel> getAllTitles()
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getAllUserGroupsForUser(de.hybris.platform.core.model.user.
	 * UserModel)
	 */
	@Override
	public Set<UserGroupModel> getAllUserGroupsForUser(final UserModel arg0)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getAllUserGroupsForUser(de.hybris.platform.core.model.user.
	 * UserModel, java.lang.Class)
	 */
	@Override
	public <T extends UserGroupModel> Set<T> getAllUserGroupsForUser(final UserModel arg0, final Class<T> arg1)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#getAllUserGroupsForUserGroup(de.hybris.platform.core.model.user.
	 * UserGroupModel, java.lang.Class)
	 */
	@Override
	public <T extends UserGroupModel> Set<T> getAllUserGroupsForUserGroup(final UserGroupModel arg0, final Class<T> arg1)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getAnonymousUser()
	 */
	@Override
	public CustomerModel getAnonymousUser()
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getCurrentUser()
	 */
	@Override
	public UserModel getCurrentUser()
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getPassword(java.lang.String)
	 */
	@Override
	public String getPassword(final String arg0) throws CannotDecodePasswordException, PasswordEncoderNotFoundException
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getPassword(de.hybris.platform.core.model.user.UserModel)
	 */
	@Override
	public String getPassword(final UserModel arg0) throws CannotDecodePasswordException, PasswordEncoderNotFoundException
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getTitleForCode(java.lang.String)
	 */
	@Override
	public TitleModel getTitleForCode(final String arg0)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getUser(java.lang.String)
	 */
	@Override
	public UserModel getUser(final String arg0)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getUserAudits(de.hybris.platform.core.model.user.UserModel)
	 */
	@Override
	public List<AbstractUserAuditModel> getUserAudits(final UserModel arg0)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getUserForUID(java.lang.String)
	 */
	@Override
	public UserModel getUserForUID(final String arg0)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getUserForUID(java.lang.String, java.lang.Class)
	 */
	@Override
	public <T extends UserModel> T getUserForUID(final String arg0, final Class<T> arg1)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getUserGroup(java.lang.String)
	 */
	@Override
	public UserGroupModel getUserGroup(final String arg0)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getUserGroupForUID(java.lang.String)
	 */
	@Override
	public UserGroupModel getUserGroupForUID(final String arg0)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#getUserGroupForUID(java.lang.String, java.lang.Class)
	 */
	@Override
	public <T extends UserGroupModel> T getUserGroupForUID(final String arg0, final Class<T> arg1)
	{
		// XXX Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#isAdmin(de.hybris.platform.core.model.user.UserModel)
	 */
	@Override
	public boolean isAdmin(final UserModel arg0)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#isAdminEmployee(de.hybris.platform.core.model.user.UserModel)
	 */
	@Override
	public boolean isAdminEmployee(final UserModel arg0)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#isAdminGroup(de.hybris.platform.core.model.user.UserGroupModel)
	 */
	@Override
	public boolean isAdminGroup(final UserGroupModel arg0)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#isAnonymousUser(de.hybris.platform.core.model.user.UserModel)
	 */
	@Override
	public boolean isAnonymousUser(final UserModel arg0)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#isMemberOfGroup(de.hybris.platform.core.model.user.UserModel,
	 * de.hybris.platform.core.model.user.UserGroupModel)
	 */
	@Override
	public boolean isMemberOfGroup(final UserModel arg0, final UserGroupModel arg1)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#isMemberOfGroup(de.hybris.platform.core.model.user.
	 * UserGroupModel, de.hybris.platform.core.model.user.UserGroupModel)
	 */
	@Override
	public boolean isMemberOfGroup(final UserGroupModel arg0, final UserGroupModel arg1)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#isMemberOfGroup(de.hybris.platform.core.model.user.UserModel,
	 * de.hybris.platform.core.model.user.UserGroupModel, boolean)
	 */
	@Override
	public boolean isMemberOfGroup(final UserModel arg0, final UserGroupModel arg1, final boolean arg2)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#isMemberOfGroup(de.hybris.platform.core.model.user.
	 * UserGroupModel, de.hybris.platform.core.model.user.UserGroupModel, boolean)
	 */
	@Override
	public boolean isMemberOfGroup(final UserGroupModel arg0, final UserGroupModel arg1, final boolean arg2)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#isPasswordIdenticalToAudited(de.hybris.platform.core.model.user.
	 * UserModel, java.lang.String, de.hybris.platform.core.model.user.UserPasswordChangeAuditModel)
	 */
	@Override
	public boolean isPasswordIdenticalToAudited(final UserModel arg0, final String arg1, final UserPasswordChangeAuditModel arg2)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#isUserExisting(java.lang.String)
	 */
	@Override
	public boolean isUserExisting(final String arg0)
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#setCurrentUser(de.hybris.platform.core.model.user.UserModel)
	 */
	@Override
	public void setCurrentUser(final UserModel arg0)
	{
		// XXX Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#setEncodedPassword(de.hybris.platform.core.model.user.UserModel,
	 * java.lang.String)
	 */
	@Override
	public void setEncodedPassword(final UserModel arg0, final String arg1)
	{
		// XXX Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#setEncodedPassword(de.hybris.platform.core.model.user.UserModel,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void setEncodedPassword(final UserModel arg0, final String arg1, final String arg2)
	{
		// XXX Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#setPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public void setPassword(final String arg0, final String arg1) throws PasswordEncoderNotFoundException
	{
		// XXX Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#setPassword(de.hybris.platform.core.model.user.UserModel,
	 * java.lang.String)
	 */
	@Override
	public void setPassword(final UserModel arg0, final String arg1) throws PasswordEncoderNotFoundException
	{
		// XXX Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#setPassword(java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void setPassword(final String arg0, final String arg1, final String arg2) throws PasswordEncoderNotFoundException
	{
		// XXX Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.user.UserService#setPassword(de.hybris.platform.core.model.user.UserModel,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void setPassword(final UserModel arg0, final String arg1, final String arg2) throws PasswordEncoderNotFoundException
	{
		// XXX Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.user.UserService#setPasswordWithDefaultEncoding(de.hybris.platform.core.model.user
	 * .UserModel, java.lang.String)
	 */
	@Override
	public void setPasswordWithDefaultEncoding(final UserModel arg0, final String arg1) throws PasswordEncoderNotFoundException
	{
		// XXX Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see it.uiip.airport.core.service.PassengerService#getPassengersforDate(java.util.Date)
	 */
	@Override
	public List<PassengerModel> getPassengersForDate(final Date date)
	{

		return passengerDao.findPassengersByFlightDate(date);
	}

}
