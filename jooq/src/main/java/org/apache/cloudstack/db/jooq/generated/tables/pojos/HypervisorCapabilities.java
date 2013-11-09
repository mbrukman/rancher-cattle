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
@javax.persistence.Table(name = "hypervisor_capabilities", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"hypervisor_type", "hypervisor_version"})
})
public class HypervisorCapabilities implements java.io.Serializable {

	private static final long serialVersionUID = -1494264987;

	private java.lang.Long    id;
	private java.lang.String  uuid;
	private java.lang.String  hypervisorType;
	private java.lang.String  hypervisorVersion;
	private java.lang.Long    maxGuestsLimit;
	private java.lang.Integer securityGroupEnabled;
	private java.lang.Integer maxDataVolumesLimit;
	private java.lang.Integer maxHostsPerCluster;
	private java.lang.Integer storageMotionSupported;
	private java.lang.Boolean vmSnapshotEnabled;

	public HypervisorCapabilities() {}

	public HypervisorCapabilities(
		java.lang.Long    id,
		java.lang.String  uuid,
		java.lang.String  hypervisorType,
		java.lang.String  hypervisorVersion,
		java.lang.Long    maxGuestsLimit,
		java.lang.Integer securityGroupEnabled,
		java.lang.Integer maxDataVolumesLimit,
		java.lang.Integer maxHostsPerCluster,
		java.lang.Integer storageMotionSupported,
		java.lang.Boolean vmSnapshotEnabled
	) {
		this.id = id;
		this.uuid = uuid;
		this.hypervisorType = hypervisorType;
		this.hypervisorVersion = hypervisorVersion;
		this.maxGuestsLimit = maxGuestsLimit;
		this.securityGroupEnabled = securityGroupEnabled;
		this.maxDataVolumesLimit = maxDataVolumesLimit;
		this.maxHostsPerCluster = maxHostsPerCluster;
		this.storageMotionSupported = storageMotionSupported;
		this.vmSnapshotEnabled = vmSnapshotEnabled;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "hypervisor_type", nullable = false, length = 32)
	public java.lang.String getHypervisorType() {
		return this.hypervisorType;
	}

	public void setHypervisorType(java.lang.String hypervisorType) {
		this.hypervisorType = hypervisorType;
	}

	@javax.persistence.Column(name = "hypervisor_version", length = 32)
	public java.lang.String getHypervisorVersion() {
		return this.hypervisorVersion;
	}

	public void setHypervisorVersion(java.lang.String hypervisorVersion) {
		this.hypervisorVersion = hypervisorVersion;
	}

	@javax.persistence.Column(name = "max_guests_limit", precision = 20)
	public java.lang.Long getMaxGuestsLimit() {
		return this.maxGuestsLimit;
	}

	public void setMaxGuestsLimit(java.lang.Long maxGuestsLimit) {
		this.maxGuestsLimit = maxGuestsLimit;
	}

	@javax.persistence.Column(name = "security_group_enabled", precision = 10)
	public java.lang.Integer getSecurityGroupEnabled() {
		return this.securityGroupEnabled;
	}

	public void setSecurityGroupEnabled(java.lang.Integer securityGroupEnabled) {
		this.securityGroupEnabled = securityGroupEnabled;
	}

	@javax.persistence.Column(name = "max_data_volumes_limit", precision = 10)
	public java.lang.Integer getMaxDataVolumesLimit() {
		return this.maxDataVolumesLimit;
	}

	public void setMaxDataVolumesLimit(java.lang.Integer maxDataVolumesLimit) {
		this.maxDataVolumesLimit = maxDataVolumesLimit;
	}

	@javax.persistence.Column(name = "max_hosts_per_cluster", precision = 10)
	public java.lang.Integer getMaxHostsPerCluster() {
		return this.maxHostsPerCluster;
	}

	public void setMaxHostsPerCluster(java.lang.Integer maxHostsPerCluster) {
		this.maxHostsPerCluster = maxHostsPerCluster;
	}

	@javax.persistence.Column(name = "storage_motion_supported", precision = 10)
	public java.lang.Integer getStorageMotionSupported() {
		return this.storageMotionSupported;
	}

	public void setStorageMotionSupported(java.lang.Integer storageMotionSupported) {
		this.storageMotionSupported = storageMotionSupported;
	}

	@javax.persistence.Column(name = "vm_snapshot_enabled", nullable = false, precision = 1)
	public java.lang.Boolean getVmSnapshotEnabled() {
		return this.vmSnapshotEnabled;
	}

	public void setVmSnapshotEnabled(java.lang.Boolean vmSnapshotEnabled) {
		this.vmSnapshotEnabled = vmSnapshotEnabled;
	}
}