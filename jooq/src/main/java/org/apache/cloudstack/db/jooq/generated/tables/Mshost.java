/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mshost extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord> {

	private static final long serialVersionUID = -841544838;

	/**
	 * The singleton instance of <code>cloud.mshost</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.Mshost MSHOST = new org.apache.cloudstack.db.jooq.generated.tables.Mshost();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord.class;
	}

	/**
	 * The column <code>cloud.mshost.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.mshost.msid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.Long> MSID = createField("msid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.mshost.runid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.Long> RUNID = createField("runid", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.mshost.name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.mshost.state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.mshost.version</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.mshost.service_ip</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.String> SERVICE_IP = createField("service_ip", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this);

	/**
	 * The column <code>cloud.mshost.service_port</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.Integer> SERVICE_PORT = createField("service_port", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.mshost.last_update</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.mshost.removed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.mshost.alert_count</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.Integer> ALERT_COUNT = createField("alert_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>cloud.mshost</code> table reference
	 */
	public Mshost() {
		super("mshost", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.mshost</code> table reference
	 */
	public Mshost(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.Mshost.MSHOST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_MSHOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_MSHOST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.MshostRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_MSHOST_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_MSHOST_MSID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.Mshost as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.Mshost(alias);
	}
}