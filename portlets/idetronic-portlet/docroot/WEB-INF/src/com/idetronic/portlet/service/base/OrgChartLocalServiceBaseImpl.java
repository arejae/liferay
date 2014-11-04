/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.idetronic.portlet.service.base;

import com.idetronic.portlet.model.OrgChart;
import com.idetronic.portlet.service.OrgChartLocalService;
import com.idetronic.portlet.service.persistence.ExpertiseTagPersistence;
import com.idetronic.portlet.service.persistence.OrgChartFinder;
import com.idetronic.portlet.service.persistence.OrgChartPK;
import com.idetronic.portlet.service.persistence.OrgChartPersistence;
import com.idetronic.portlet.service.persistence.ServiceExperiencePersistence;
import com.idetronic.portlet.service.persistence.UserEntries_ExpertiseTagsFinder;
import com.idetronic.portlet.service.persistence.UserEntries_ExpertiseTagsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the org chart local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.idetronic.portlet.service.impl.OrgChartLocalServiceImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see com.idetronic.portlet.service.impl.OrgChartLocalServiceImpl
 * @see com.idetronic.portlet.service.OrgChartLocalServiceUtil
 * @generated
 */
public abstract class OrgChartLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements OrgChartLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.idetronic.portlet.service.OrgChartLocalServiceUtil} to access the org chart local service.
	 */

	/**
	 * Adds the org chart to the database. Also notifies the appropriate model listeners.
	 *
	 * @param orgChart the org chart
	 * @return the org chart that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OrgChart addOrgChart(OrgChart orgChart) throws SystemException {
		orgChart.setNew(true);

		return orgChartPersistence.update(orgChart);
	}

	/**
	 * Creates a new org chart with the primary key. Does not add the org chart to the database.
	 *
	 * @param orgChartPK the primary key for the new org chart
	 * @return the new org chart
	 */
	@Override
	public OrgChart createOrgChart(OrgChartPK orgChartPK) {
		return orgChartPersistence.create(orgChartPK);
	}

	/**
	 * Deletes the org chart with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orgChartPK the primary key of the org chart
	 * @return the org chart that was removed
	 * @throws PortalException if a org chart with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OrgChart deleteOrgChart(OrgChartPK orgChartPK)
		throws PortalException, SystemException {
		return orgChartPersistence.remove(orgChartPK);
	}

	/**
	 * Deletes the org chart from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orgChart the org chart
	 * @return the org chart that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OrgChart deleteOrgChart(OrgChart orgChart) throws SystemException {
		return orgChartPersistence.remove(orgChart);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(OrgChart.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return orgChartPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.idetronic.portlet.model.impl.OrgChartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return orgChartPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.idetronic.portlet.model.impl.OrgChartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return orgChartPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return orgChartPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return orgChartPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public OrgChart fetchOrgChart(OrgChartPK orgChartPK)
		throws SystemException {
		return orgChartPersistence.fetchByPrimaryKey(orgChartPK);
	}

	/**
	 * Returns the org chart with the primary key.
	 *
	 * @param orgChartPK the primary key of the org chart
	 * @return the org chart
	 * @throws PortalException if a org chart with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OrgChart getOrgChart(OrgChartPK orgChartPK)
		throws PortalException, SystemException {
		return orgChartPersistence.findByPrimaryKey(orgChartPK);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return orgChartPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the org charts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.idetronic.portlet.model.impl.OrgChartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of org charts
	 * @param end the upper bound of the range of org charts (not inclusive)
	 * @return the range of org charts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OrgChart> getOrgCharts(int start, int end)
		throws SystemException {
		return orgChartPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of org charts.
	 *
	 * @return the number of org charts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getOrgChartsCount() throws SystemException {
		return orgChartPersistence.countAll();
	}

	/**
	 * Updates the org chart in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param orgChart the org chart
	 * @return the org chart that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OrgChart updateOrgChart(OrgChart orgChart) throws SystemException {
		return orgChartPersistence.update(orgChart);
	}

	/**
	 * Returns the expertise tag local service.
	 *
	 * @return the expertise tag local service
	 */
	public com.idetronic.portlet.service.ExpertiseTagLocalService getExpertiseTagLocalService() {
		return expertiseTagLocalService;
	}

	/**
	 * Sets the expertise tag local service.
	 *
	 * @param expertiseTagLocalService the expertise tag local service
	 */
	public void setExpertiseTagLocalService(
		com.idetronic.portlet.service.ExpertiseTagLocalService expertiseTagLocalService) {
		this.expertiseTagLocalService = expertiseTagLocalService;
	}

	/**
	 * Returns the expertise tag persistence.
	 *
	 * @return the expertise tag persistence
	 */
	public ExpertiseTagPersistence getExpertiseTagPersistence() {
		return expertiseTagPersistence;
	}

	/**
	 * Sets the expertise tag persistence.
	 *
	 * @param expertiseTagPersistence the expertise tag persistence
	 */
	public void setExpertiseTagPersistence(
		ExpertiseTagPersistence expertiseTagPersistence) {
		this.expertiseTagPersistence = expertiseTagPersistence;
	}

	/**
	 * Returns the org chart local service.
	 *
	 * @return the org chart local service
	 */
	public com.idetronic.portlet.service.OrgChartLocalService getOrgChartLocalService() {
		return orgChartLocalService;
	}

	/**
	 * Sets the org chart local service.
	 *
	 * @param orgChartLocalService the org chart local service
	 */
	public void setOrgChartLocalService(
		com.idetronic.portlet.service.OrgChartLocalService orgChartLocalService) {
		this.orgChartLocalService = orgChartLocalService;
	}

	/**
	 * Returns the org chart persistence.
	 *
	 * @return the org chart persistence
	 */
	public OrgChartPersistence getOrgChartPersistence() {
		return orgChartPersistence;
	}

	/**
	 * Sets the org chart persistence.
	 *
	 * @param orgChartPersistence the org chart persistence
	 */
	public void setOrgChartPersistence(OrgChartPersistence orgChartPersistence) {
		this.orgChartPersistence = orgChartPersistence;
	}

	/**
	 * Returns the org chart finder.
	 *
	 * @return the org chart finder
	 */
	public OrgChartFinder getOrgChartFinder() {
		return orgChartFinder;
	}

	/**
	 * Sets the org chart finder.
	 *
	 * @param orgChartFinder the org chart finder
	 */
	public void setOrgChartFinder(OrgChartFinder orgChartFinder) {
		this.orgChartFinder = orgChartFinder;
	}

	/**
	 * Returns the service experience local service.
	 *
	 * @return the service experience local service
	 */
	public com.idetronic.portlet.service.ServiceExperienceLocalService getServiceExperienceLocalService() {
		return serviceExperienceLocalService;
	}

	/**
	 * Sets the service experience local service.
	 *
	 * @param serviceExperienceLocalService the service experience local service
	 */
	public void setServiceExperienceLocalService(
		com.idetronic.portlet.service.ServiceExperienceLocalService serviceExperienceLocalService) {
		this.serviceExperienceLocalService = serviceExperienceLocalService;
	}

	/**
	 * Returns the service experience persistence.
	 *
	 * @return the service experience persistence
	 */
	public ServiceExperiencePersistence getServiceExperiencePersistence() {
		return serviceExperiencePersistence;
	}

	/**
	 * Sets the service experience persistence.
	 *
	 * @param serviceExperiencePersistence the service experience persistence
	 */
	public void setServiceExperiencePersistence(
		ServiceExperiencePersistence serviceExperiencePersistence) {
		this.serviceExperiencePersistence = serviceExperiencePersistence;
	}

	/**
	 * Returns the user entries_ expertise tags local service.
	 *
	 * @return the user entries_ expertise tags local service
	 */
	public com.idetronic.portlet.service.UserEntries_ExpertiseTagsLocalService getUserEntries_ExpertiseTagsLocalService() {
		return userEntries_ExpertiseTagsLocalService;
	}

	/**
	 * Sets the user entries_ expertise tags local service.
	 *
	 * @param userEntries_ExpertiseTagsLocalService the user entries_ expertise tags local service
	 */
	public void setUserEntries_ExpertiseTagsLocalService(
		com.idetronic.portlet.service.UserEntries_ExpertiseTagsLocalService userEntries_ExpertiseTagsLocalService) {
		this.userEntries_ExpertiseTagsLocalService = userEntries_ExpertiseTagsLocalService;
	}

	/**
	 * Returns the user entries_ expertise tags persistence.
	 *
	 * @return the user entries_ expertise tags persistence
	 */
	public UserEntries_ExpertiseTagsPersistence getUserEntries_ExpertiseTagsPersistence() {
		return userEntries_ExpertiseTagsPersistence;
	}

	/**
	 * Sets the user entries_ expertise tags persistence.
	 *
	 * @param userEntries_ExpertiseTagsPersistence the user entries_ expertise tags persistence
	 */
	public void setUserEntries_ExpertiseTagsPersistence(
		UserEntries_ExpertiseTagsPersistence userEntries_ExpertiseTagsPersistence) {
		this.userEntries_ExpertiseTagsPersistence = userEntries_ExpertiseTagsPersistence;
	}

	/**
	 * Returns the user entries_ expertise tags finder.
	 *
	 * @return the user entries_ expertise tags finder
	 */
	public UserEntries_ExpertiseTagsFinder getUserEntries_ExpertiseTagsFinder() {
		return userEntries_ExpertiseTagsFinder;
	}

	/**
	 * Sets the user entries_ expertise tags finder.
	 *
	 * @param userEntries_ExpertiseTagsFinder the user entries_ expertise tags finder
	 */
	public void setUserEntries_ExpertiseTagsFinder(
		UserEntries_ExpertiseTagsFinder userEntries_ExpertiseTagsFinder) {
		this.userEntries_ExpertiseTagsFinder = userEntries_ExpertiseTagsFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.idetronic.portlet.model.OrgChart",
			orgChartLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.idetronic.portlet.model.OrgChart");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return OrgChart.class;
	}

	protected String getModelClassName() {
		return OrgChart.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = orgChartPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.idetronic.portlet.service.ExpertiseTagLocalService.class)
	protected com.idetronic.portlet.service.ExpertiseTagLocalService expertiseTagLocalService;
	@BeanReference(type = ExpertiseTagPersistence.class)
	protected ExpertiseTagPersistence expertiseTagPersistence;
	@BeanReference(type = com.idetronic.portlet.service.OrgChartLocalService.class)
	protected com.idetronic.portlet.service.OrgChartLocalService orgChartLocalService;
	@BeanReference(type = OrgChartPersistence.class)
	protected OrgChartPersistence orgChartPersistence;
	@BeanReference(type = OrgChartFinder.class)
	protected OrgChartFinder orgChartFinder;
	@BeanReference(type = com.idetronic.portlet.service.ServiceExperienceLocalService.class)
	protected com.idetronic.portlet.service.ServiceExperienceLocalService serviceExperienceLocalService;
	@BeanReference(type = ServiceExperiencePersistence.class)
	protected ServiceExperiencePersistence serviceExperiencePersistence;
	@BeanReference(type = com.idetronic.portlet.service.UserEntries_ExpertiseTagsLocalService.class)
	protected com.idetronic.portlet.service.UserEntries_ExpertiseTagsLocalService userEntries_ExpertiseTagsLocalService;
	@BeanReference(type = UserEntries_ExpertiseTagsPersistence.class)
	protected UserEntries_ExpertiseTagsPersistence userEntries_ExpertiseTagsPersistence;
	@BeanReference(type = UserEntries_ExpertiseTagsFinder.class)
	protected UserEntries_ExpertiseTagsFinder userEntries_ExpertiseTagsFinder;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private OrgChartLocalServiceClpInvoker _clpInvoker = new OrgChartLocalServiceClpInvoker();
}