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
@javax.persistence.Table(name = "data_center_details", schema = "cloud")
public class DataCenterDetailsRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.DataCenterDetailsRecord> implements org.jooq.Record5<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean> {

	private static final long serialVersionUID = 105025535;

	/**
	 * Setter for <code>cloud.data_center_details.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.data_center_details.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.data_center_details.dc_id</code>. 
	 */
	public void setDcId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.data_center_details.dc_id</code>. 
	 */
	@javax.persistence.Column(name = "dc_id", nullable = false, precision = 20)
	public java.lang.Long getDcId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cloud.data_center_details.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.data_center_details.name</code>. 
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.data_center_details.value</code>. 
	 */
	public void setValue(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.data_center_details.value</code>. 
	 */
	@javax.persistence.Column(name = "value", length = 1024)
	public java.lang.String getValue() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.data_center_details.display</code>. 
	 */
	public void setDisplay(java.lang.Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.data_center_details.display</code>. 
	 */
	@javax.persistence.Column(name = "display", nullable = false, precision = 1)
	public java.lang.Boolean getDisplay() {
		return (java.lang.Boolean) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.DataCenterDetails.DATA_CENTER_DETAILS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.DataCenterDetails.DATA_CENTER_DETAILS.DC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.DataCenterDetails.DATA_CENTER_DETAILS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.DataCenterDetails.DATA_CENTER_DETAILS.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.DataCenterDetails.DATA_CENTER_DETAILS.DISPLAY;
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
		return getDcId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getDisplay();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DataCenterDetailsRecord
	 */
	public DataCenterDetailsRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.DataCenterDetails.DATA_CENTER_DETAILS);
	}

	/**
	 * Create a detached, initialised DataCenterDetailsRecord
	 */
	public DataCenterDetailsRecord(java.lang.Long id, java.lang.Long dcId, java.lang.String name, java.lang.String value, java.lang.Boolean display) {
		super(org.apache.cloudstack.db.jooq.generated.tables.DataCenterDetails.DATA_CENTER_DETAILS);

		setValue(0, id);
		setValue(1, dcId);
		setValue(2, name);
		setValue(3, value);
		setValue(4, display);
	}
}