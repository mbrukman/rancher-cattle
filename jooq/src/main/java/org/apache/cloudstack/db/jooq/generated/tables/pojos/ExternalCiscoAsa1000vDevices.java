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
@javax.persistence.Table(name = "external_cisco_asa1000v_devices", schema = "cloud")
public class ExternalCiscoAsa1000vDevices implements java.io.Serializable {

	private static final long serialVersionUID = -121293891;

	private java.lang.Long   id;
	private java.lang.String uuid;
	private java.lang.Long   physicalNetworkId;
	private java.lang.String managementIp;
	private java.lang.String inPortProfile;
	private java.lang.Long   clusterId;

	public ExternalCiscoAsa1000vDevices() {}

	public ExternalCiscoAsa1000vDevices(
		java.lang.Long   id,
		java.lang.String uuid,
		java.lang.Long   physicalNetworkId,
		java.lang.String managementIp,
		java.lang.String inPortProfile,
		java.lang.Long   clusterId
	) {
		this.id = id;
		this.uuid = uuid;
		this.physicalNetworkId = physicalNetworkId;
		this.managementIp = managementIp;
		this.inPortProfile = inPortProfile;
		this.clusterId = clusterId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "uuid", unique = true, length = 255)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "physical_network_id", nullable = false, precision = 20)
	public java.lang.Long getPhysicalNetworkId() {
		return this.physicalNetworkId;
	}

	public void setPhysicalNetworkId(java.lang.Long physicalNetworkId) {
		this.physicalNetworkId = physicalNetworkId;
	}

	@javax.persistence.Column(name = "management_ip", unique = true, nullable = false, length = 255)
	public java.lang.String getManagementIp() {
		return this.managementIp;
	}

	public void setManagementIp(java.lang.String managementIp) {
		this.managementIp = managementIp;
	}

	@javax.persistence.Column(name = "in_port_profile", nullable = false, length = 255)
	public java.lang.String getInPortProfile() {
		return this.inPortProfile;
	}

	public void setInPortProfile(java.lang.String inPortProfile) {
		this.inPortProfile = inPortProfile;
	}

	@javax.persistence.Column(name = "cluster_id", nullable = false, precision = 20)
	public java.lang.Long getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(java.lang.Long clusterId) {
		this.clusterId = clusterId;
	}
}