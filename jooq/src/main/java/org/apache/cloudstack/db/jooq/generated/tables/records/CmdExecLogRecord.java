/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "cmd_exec_log", schema = "cloud")
public class CmdExecLogRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.CmdExecLogRecord> implements org.jooq.Record6<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.sql.Timestamp> {

	private static final long serialVersionUID = 710201615;

	/**
	 * Setter for <code>cloud.cmd_exec_log.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.cmd_exec_log.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.cmd_exec_log.host_id</code>. 
	 */
	public void setHostId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.cmd_exec_log.host_id</code>. 
	 */
	@javax.persistence.Column(name = "host_id", nullable = false, precision = 20)
	public java.lang.Long getHostId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cloud.cmd_exec_log.instance_id</code>. 
	 */
	public void setInstanceId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.cmd_exec_log.instance_id</code>. 
	 */
	@javax.persistence.Column(name = "instance_id", nullable = false, precision = 20)
	public java.lang.Long getInstanceId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cloud.cmd_exec_log.command_name</code>. 
	 */
	public void setCommandName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.cmd_exec_log.command_name</code>. 
	 */
	@javax.persistence.Column(name = "command_name", nullable = false, length = 255)
	public java.lang.String getCommandName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.cmd_exec_log.weight</code>. 
	 */
	public void setWeight(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.cmd_exec_log.weight</code>. 
	 */
	@javax.persistence.Column(name = "weight", nullable = false, precision = 10)
	public java.lang.Integer getWeight() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>cloud.cmd_exec_log.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.cmd_exec_log.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.CmdExecLog.CMD_EXEC_LOG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.CmdExecLog.CMD_EXEC_LOG.HOST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.CmdExecLog.CMD_EXEC_LOG.INSTANCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.CmdExecLog.CMD_EXEC_LOG.COMMAND_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.CmdExecLog.CMD_EXEC_LOG.WEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.CmdExecLog.CMD_EXEC_LOG.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getHostId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getInstanceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getCommandName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getWeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getCreated();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CmdExecLogRecord
	 */
	public CmdExecLogRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.CmdExecLog.CMD_EXEC_LOG);
	}

	/**
	 * Create a detached, initialised CmdExecLogRecord
	 */
	public CmdExecLogRecord(java.lang.Long id, java.lang.Long hostId, java.lang.Long instanceId, java.lang.String commandName, java.lang.Integer weight, java.sql.Timestamp created) {
		super(org.apache.cloudstack.db.jooq.generated.tables.CmdExecLog.CMD_EXEC_LOG);

		setValue(0, id);
		setValue(1, hostId);
		setValue(2, instanceId);
		setValue(3, commandName);
		setValue(4, weight);
		setValue(5, created);
	}
}