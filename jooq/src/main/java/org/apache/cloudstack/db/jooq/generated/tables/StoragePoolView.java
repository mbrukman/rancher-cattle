/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoragePoolView extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord> {

	private static final long serialVersionUID = -1354457704;

	/**
	 * The singleton instance of <code>cloud.storage_pool_view</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.StoragePoolView STORAGE_POOL_VIEW = new org.apache.cloudstack.db.jooq.generated.tables.StoragePoolView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord.class;
	}

	/**
	 * The column <code>cloud.storage_pool_view.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.storage_pool_view.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.storage_pool_view.name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.storage_pool_view.status</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(32), this);

	/**
	 * The column <code>cloud.storage_pool_view.path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> PATH = createField("path", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.storage_pool_view.pool_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> POOL_TYPE = createField("pool_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this);

	/**
	 * The column <code>cloud.storage_pool_view.host_address</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> HOST_ADDRESS = createField("host_address", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.storage_pool_view.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.storage_pool_view.removed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.storage_pool_view.capacity_bytes</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> CAPACITY_BYTES = createField("capacity_bytes", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.storage_pool_view.capacity_iops</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> CAPACITY_IOPS = createField("capacity_iops", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.storage_pool_view.scope</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> SCOPE = createField("scope", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.storage_pool_view.hypervisor</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> HYPERVISOR = createField("hypervisor", org.jooq.impl.SQLDataType.VARCHAR.length(32), this);

	/**
	 * The column <code>cloud.storage_pool_view.storage_provider_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> STORAGE_PROVIDER_NAME = createField("storage_provider_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.storage_pool_view.cluster_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> CLUSTER_ID = createField("cluster_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.storage_pool_view.cluster_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> CLUSTER_UUID = createField("cluster_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.storage_pool_view.cluster_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> CLUSTER_NAME = createField("cluster_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.storage_pool_view.cluster_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> CLUSTER_TYPE = createField("cluster_type", org.jooq.impl.SQLDataType.VARCHAR.length(64).defaulted(true), this);

	/**
	 * The column <code>cloud.storage_pool_view.data_center_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> DATA_CENTER_ID = createField("data_center_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.storage_pool_view.data_center_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> DATA_CENTER_UUID = createField("data_center_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.storage_pool_view.data_center_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> DATA_CENTER_NAME = createField("data_center_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.storage_pool_view.data_center_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> DATA_CENTER_TYPE = createField("data_center_type", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaulted(true), this);

	/**
	 * The column <code>cloud.storage_pool_view.pod_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> POD_ID = createField("pod_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.storage_pool_view.pod_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> POD_UUID = createField("pod_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.storage_pool_view.pod_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> POD_NAME = createField("pod_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.storage_pool_view.tag</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.storage_pool_view.disk_used_capacity</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> DISK_USED_CAPACITY = createField("disk_used_capacity", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.storage_pool_view.disk_reserved_capacity</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> DISK_RESERVED_CAPACITY = createField("disk_reserved_capacity", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.storage_pool_view.job_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.storage_pool_view.job_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.String> JOB_UUID = createField("job_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.storage_pool_view.job_status</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Integer> JOB_STATUS = createField("job_status", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.storage_pool_view.job_account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolViewRecord, java.lang.Long> JOB_ACCOUNT_ID = createField("job_account_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>cloud.storage_pool_view</code> table reference
	 */
	public StoragePoolView() {
		super("storage_pool_view", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.storage_pool_view</code> table reference
	 */
	public StoragePoolView(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.StoragePoolView.STORAGE_POOL_VIEW);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.StoragePoolView as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.StoragePoolView(alias);
	}
}