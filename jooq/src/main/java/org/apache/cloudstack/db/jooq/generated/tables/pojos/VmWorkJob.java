/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "vm_work_job", schema = "cloud")
public class VmWorkJob implements java.io.Serializable {

	private static final long serialVersionUID = 785167049;

	private java.lang.Long   id;
	private java.lang.String step;
	private java.lang.String vmType;
	private java.lang.Long   vmInstanceId;

	public VmWorkJob() {}

	public VmWorkJob(
		java.lang.Long   id,
		java.lang.String step,
		java.lang.String vmType,
		java.lang.Long   vmInstanceId
	) {
		this.id = id;
		this.step = step;
		this.vmType = vmType;
		this.vmInstanceId = vmInstanceId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "step", nullable = false, length = 32)
	public java.lang.String getStep() {
		return this.step;
	}

	public void setStep(java.lang.String step) {
		this.step = step;
	}

	@javax.persistence.Column(name = "vm_type", nullable = false, length = 32)
	public java.lang.String getVmType() {
		return this.vmType;
	}

	public void setVmType(java.lang.String vmType) {
		this.vmType = vmType;
	}

	@javax.persistence.Column(name = "vm_instance_id", nullable = false, precision = 20)
	public java.lang.Long getVmInstanceId() {
		return this.vmInstanceId;
	}

	public void setVmInstanceId(java.lang.Long vmInstanceId) {
		this.vmInstanceId = vmInstanceId;
	}
}