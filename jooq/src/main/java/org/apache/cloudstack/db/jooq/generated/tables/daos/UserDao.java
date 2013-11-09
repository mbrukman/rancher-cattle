/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.UserRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.User, java.lang.Long> {

	/**
	 * Create a new UserDao without any configuration
	 */
	public UserDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.User.USER, org.apache.cloudstack.db.jooq.generated.tables.pojos.User.class);
	}

	/**
	 * Create a new UserDao with an attached configuration
	 */
	public UserDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.User.USER, org.apache.cloudstack.db.jooq.generated.tables.pojos.User.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.User object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.User fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.User.USER.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.User fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.User.USER.UUID, value);
	}

	/**
	 * Fetch records that have <code>username IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByUsername(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.USERNAME, values);
	}

	/**
	 * Fetch records that have <code>password IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByPassword(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.PASSWORD, values);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>firstname IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByFirstname(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.FIRSTNAME, values);
	}

	/**
	 * Fetch records that have <code>lastname IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByLastname(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.LASTNAME, values);
	}

	/**
	 * Fetch records that have <code>email IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByEmail(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.EMAIL, values);
	}

	/**
	 * Fetch records that have <code>state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.STATE, values);
	}

	/**
	 * Fetch records that have <code>api_key IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByApiKey(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.API_KEY, values);
	}

	/**
	 * Fetch a unique record that has <code>api_key = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.User fetchOneByApiKey(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.User.USER.API_KEY, value);
	}

	/**
	 * Fetch records that have <code>secret_key IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchBySecretKey(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.SECRET_KEY, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.CREATED, values);
	}

	/**
	 * Fetch records that have <code>removed IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByRemoved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.REMOVED, values);
	}

	/**
	 * Fetch records that have <code>timezone IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByTimezone(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.TIMEZONE, values);
	}

	/**
	 * Fetch records that have <code>registration_token IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByRegistrationToken(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.REGISTRATION_TOKEN, values);
	}

	/**
	 * Fetch records that have <code>is_registered IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByIsRegistered(java.lang.Byte... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.IS_REGISTERED, values);
	}

	/**
	 * Fetch records that have <code>incorrect_login_attempts IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByIncorrectLoginAttempts(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.INCORRECT_LOGIN_ATTEMPTS, values);
	}

	/**
	 * Fetch records that have <code>default IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.User> fetchByDefault(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.User.USER.DEFAULT, values);
	}
}