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
@javax.persistence.Table(name = "firewall_rules", schema = "cloud")
public class FirewallRules implements java.io.Serializable {

	private static final long serialVersionUID = -858732960;

	private java.lang.Long     id;
	private java.lang.String   uuid;
	private java.lang.Long     ipAddressId;
	private java.lang.Integer  startPort;
	private java.lang.Integer  endPort;
	private java.lang.String   state;
	private java.lang.String   protocol;
	private java.lang.String   purpose;
	private java.lang.Long     accountId;
	private java.lang.Long     domainId;
	private java.lang.Long     networkId;
	private java.lang.String   xid;
	private java.sql.Timestamp created;
	private java.lang.Integer  icmpCode;
	private java.lang.Integer  icmpType;
	private java.lang.Long     related;
	private java.lang.String   type;
	private java.lang.Long     vpcId;
	private java.lang.String   trafficType;

	public FirewallRules() {}

	public FirewallRules(
		java.lang.Long     id,
		java.lang.String   uuid,
		java.lang.Long     ipAddressId,
		java.lang.Integer  startPort,
		java.lang.Integer  endPort,
		java.lang.String   state,
		java.lang.String   protocol,
		java.lang.String   purpose,
		java.lang.Long     accountId,
		java.lang.Long     domainId,
		java.lang.Long     networkId,
		java.lang.String   xid,
		java.sql.Timestamp created,
		java.lang.Integer  icmpCode,
		java.lang.Integer  icmpType,
		java.lang.Long     related,
		java.lang.String   type,
		java.lang.Long     vpcId,
		java.lang.String   trafficType
	) {
		this.id = id;
		this.uuid = uuid;
		this.ipAddressId = ipAddressId;
		this.startPort = startPort;
		this.endPort = endPort;
		this.state = state;
		this.protocol = protocol;
		this.purpose = purpose;
		this.accountId = accountId;
		this.domainId = domainId;
		this.networkId = networkId;
		this.xid = xid;
		this.created = created;
		this.icmpCode = icmpCode;
		this.icmpType = icmpType;
		this.related = related;
		this.type = type;
		this.vpcId = vpcId;
		this.trafficType = trafficType;
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

	@javax.persistence.Column(name = "ip_address_id", precision = 20)
	public java.lang.Long getIpAddressId() {
		return this.ipAddressId;
	}

	public void setIpAddressId(java.lang.Long ipAddressId) {
		this.ipAddressId = ipAddressId;
	}

	@javax.persistence.Column(name = "start_port", precision = 10)
	public java.lang.Integer getStartPort() {
		return this.startPort;
	}

	public void setStartPort(java.lang.Integer startPort) {
		this.startPort = startPort;
	}

	@javax.persistence.Column(name = "end_port", precision = 10)
	public java.lang.Integer getEndPort() {
		return this.endPort;
	}

	public void setEndPort(java.lang.Integer endPort) {
		this.endPort = endPort;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 32)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	@javax.persistence.Column(name = "protocol", nullable = false, length = 16)
	public java.lang.String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(java.lang.String protocol) {
		this.protocol = protocol;
	}

	@javax.persistence.Column(name = "purpose", nullable = false, length = 32)
	public java.lang.String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(java.lang.String purpose) {
		this.purpose = purpose;
	}

	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.Long domainId) {
		this.domainId = domainId;
	}

	@javax.persistence.Column(name = "network_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(java.lang.Long networkId) {
		this.networkId = networkId;
	}

	@javax.persistence.Column(name = "xid", nullable = false, length = 40)
	public java.lang.String getXid() {
		return this.xid;
	}

	public void setXid(java.lang.String xid) {
		this.xid = xid;
	}

	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "icmp_code", precision = 10)
	public java.lang.Integer getIcmpCode() {
		return this.icmpCode;
	}

	public void setIcmpCode(java.lang.Integer icmpCode) {
		this.icmpCode = icmpCode;
	}

	@javax.persistence.Column(name = "icmp_type", precision = 10)
	public java.lang.Integer getIcmpType() {
		return this.icmpType;
	}

	public void setIcmpType(java.lang.Integer icmpType) {
		this.icmpType = icmpType;
	}

	@javax.persistence.Column(name = "related", precision = 20)
	public java.lang.Long getRelated() {
		return this.related;
	}

	public void setRelated(java.lang.Long related) {
		this.related = related;
	}

	@javax.persistence.Column(name = "type", nullable = false, length = 10)
	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	@javax.persistence.Column(name = "vpc_id", precision = 20)
	public java.lang.Long getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(java.lang.Long vpcId) {
		this.vpcId = vpcId;
	}

	@javax.persistence.Column(name = "traffic_type", length = 32)
	public java.lang.String getTrafficType() {
		return this.trafficType;
	}

	public void setTrafficType(java.lang.String trafficType) {
		this.trafficType = trafficType;
	}
}