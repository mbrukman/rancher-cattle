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
@javax.persistence.Table(name = "networks", schema = "cloud")
public class Networks implements java.io.Serializable {

	private static final long serialVersionUID = -1764474458;

	private java.lang.Long     id;
	private java.lang.String   name;
	private java.lang.String   uuid;
	private java.lang.String   displayText;
	private java.lang.String   trafficType;
	private java.lang.String   broadcastDomainType;
	private java.lang.String   broadcastUri;
	private java.lang.String   gateway;
	private java.lang.String   cidr;
	private java.lang.String   mode;
	private java.lang.Long     networkOfferingId;
	private java.lang.Long     physicalNetworkId;
	private java.lang.Long     dataCenterId;
	private java.lang.String   guruName;
	private java.lang.String   state;
	private java.lang.Long     related;
	private java.lang.Long     domainId;
	private java.lang.Long     accountId;
	private java.lang.String   dns1;
	private java.lang.String   dns2;
	private java.lang.String   guruData;
	private java.lang.Long     setFields;
	private java.lang.String   aclType;
	private java.lang.String   networkDomain;
	private java.lang.String   reservationId;
	private java.lang.String   guestType;
	private java.lang.Integer  restartRequired;
	private java.sql.Timestamp created;
	private java.sql.Timestamp removed;
	private java.lang.Integer  specifyIpRanges;
	private java.lang.Long     vpcId;
	private java.lang.String   ip6Gateway;
	private java.lang.String   ip6Cidr;
	private java.lang.String   networkCidr;
	private java.lang.Boolean  displayNetwork;
	private java.lang.Long     networkAclId;

	public Networks() {}

	public Networks(
		java.lang.Long     id,
		java.lang.String   name,
		java.lang.String   uuid,
		java.lang.String   displayText,
		java.lang.String   trafficType,
		java.lang.String   broadcastDomainType,
		java.lang.String   broadcastUri,
		java.lang.String   gateway,
		java.lang.String   cidr,
		java.lang.String   mode,
		java.lang.Long     networkOfferingId,
		java.lang.Long     physicalNetworkId,
		java.lang.Long     dataCenterId,
		java.lang.String   guruName,
		java.lang.String   state,
		java.lang.Long     related,
		java.lang.Long     domainId,
		java.lang.Long     accountId,
		java.lang.String   dns1,
		java.lang.String   dns2,
		java.lang.String   guruData,
		java.lang.Long     setFields,
		java.lang.String   aclType,
		java.lang.String   networkDomain,
		java.lang.String   reservationId,
		java.lang.String   guestType,
		java.lang.Integer  restartRequired,
		java.sql.Timestamp created,
		java.sql.Timestamp removed,
		java.lang.Integer  specifyIpRanges,
		java.lang.Long     vpcId,
		java.lang.String   ip6Gateway,
		java.lang.String   ip6Cidr,
		java.lang.String   networkCidr,
		java.lang.Boolean  displayNetwork,
		java.lang.Long     networkAclId
	) {
		this.id = id;
		this.name = name;
		this.uuid = uuid;
		this.displayText = displayText;
		this.trafficType = trafficType;
		this.broadcastDomainType = broadcastDomainType;
		this.broadcastUri = broadcastUri;
		this.gateway = gateway;
		this.cidr = cidr;
		this.mode = mode;
		this.networkOfferingId = networkOfferingId;
		this.physicalNetworkId = physicalNetworkId;
		this.dataCenterId = dataCenterId;
		this.guruName = guruName;
		this.state = state;
		this.related = related;
		this.domainId = domainId;
		this.accountId = accountId;
		this.dns1 = dns1;
		this.dns2 = dns2;
		this.guruData = guruData;
		this.setFields = setFields;
		this.aclType = aclType;
		this.networkDomain = networkDomain;
		this.reservationId = reservationId;
		this.guestType = guestType;
		this.restartRequired = restartRequired;
		this.created = created;
		this.removed = removed;
		this.specifyIpRanges = specifyIpRanges;
		this.vpcId = vpcId;
		this.ip6Gateway = ip6Gateway;
		this.ip6Cidr = ip6Cidr;
		this.networkCidr = networkCidr;
		this.displayNetwork = displayNetwork;
		this.networkAclId = networkAclId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "display_text", length = 255)
	public java.lang.String getDisplayText() {
		return this.displayText;
	}

	public void setDisplayText(java.lang.String displayText) {
		this.displayText = displayText;
	}

	@javax.persistence.Column(name = "traffic_type", nullable = false, length = 32)
	public java.lang.String getTrafficType() {
		return this.trafficType;
	}

	public void setTrafficType(java.lang.String trafficType) {
		this.trafficType = trafficType;
	}

	@javax.persistence.Column(name = "broadcast_domain_type", nullable = false, length = 32)
	public java.lang.String getBroadcastDomainType() {
		return this.broadcastDomainType;
	}

	public void setBroadcastDomainType(java.lang.String broadcastDomainType) {
		this.broadcastDomainType = broadcastDomainType;
	}

	@javax.persistence.Column(name = "broadcast_uri", length = 255)
	public java.lang.String getBroadcastUri() {
		return this.broadcastUri;
	}

	public void setBroadcastUri(java.lang.String broadcastUri) {
		this.broadcastUri = broadcastUri;
	}

	@javax.persistence.Column(name = "gateway", length = 15)
	public java.lang.String getGateway() {
		return this.gateway;
	}

	public void setGateway(java.lang.String gateway) {
		this.gateway = gateway;
	}

	@javax.persistence.Column(name = "cidr", length = 18)
	public java.lang.String getCidr() {
		return this.cidr;
	}

	public void setCidr(java.lang.String cidr) {
		this.cidr = cidr;
	}

	@javax.persistence.Column(name = "mode", length = 32)
	public java.lang.String getMode() {
		return this.mode;
	}

	public void setMode(java.lang.String mode) {
		this.mode = mode;
	}

	@javax.persistence.Column(name = "network_offering_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkOfferingId() {
		return this.networkOfferingId;
	}

	public void setNetworkOfferingId(java.lang.Long networkOfferingId) {
		this.networkOfferingId = networkOfferingId;
	}

	@javax.persistence.Column(name = "physical_network_id", precision = 20)
	public java.lang.Long getPhysicalNetworkId() {
		return this.physicalNetworkId;
	}

	public void setPhysicalNetworkId(java.lang.Long physicalNetworkId) {
		this.physicalNetworkId = physicalNetworkId;
	}

	@javax.persistence.Column(name = "data_center_id", nullable = false, precision = 20)
	public java.lang.Long getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(java.lang.Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}

	@javax.persistence.Column(name = "guru_name", nullable = false, length = 255)
	public java.lang.String getGuruName() {
		return this.guruName;
	}

	public void setGuruName(java.lang.String guruName) {
		this.guruName = guruName;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 32)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	@javax.persistence.Column(name = "related", nullable = false, precision = 20)
	public java.lang.Long getRelated() {
		return this.related;
	}

	public void setRelated(java.lang.Long related) {
		this.related = related;
	}

	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.Long domainId) {
		this.domainId = domainId;
	}

	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "dns1", length = 255)
	public java.lang.String getDns1() {
		return this.dns1;
	}

	public void setDns1(java.lang.String dns1) {
		this.dns1 = dns1;
	}

	@javax.persistence.Column(name = "dns2", length = 255)
	public java.lang.String getDns2() {
		return this.dns2;
	}

	public void setDns2(java.lang.String dns2) {
		this.dns2 = dns2;
	}

	@javax.persistence.Column(name = "guru_data", length = 1024)
	public java.lang.String getGuruData() {
		return this.guruData;
	}

	public void setGuruData(java.lang.String guruData) {
		this.guruData = guruData;
	}

	@javax.persistence.Column(name = "set_fields", nullable = false, precision = 20)
	public java.lang.Long getSetFields() {
		return this.setFields;
	}

	public void setSetFields(java.lang.Long setFields) {
		this.setFields = setFields;
	}

	@javax.persistence.Column(name = "acl_type", length = 15)
	public java.lang.String getAclType() {
		return this.aclType;
	}

	public void setAclType(java.lang.String aclType) {
		this.aclType = aclType;
	}

	@javax.persistence.Column(name = "network_domain", length = 255)
	public java.lang.String getNetworkDomain() {
		return this.networkDomain;
	}

	public void setNetworkDomain(java.lang.String networkDomain) {
		this.networkDomain = networkDomain;
	}

	@javax.persistence.Column(name = "reservation_id", length = 40)
	public java.lang.String getReservationId() {
		return this.reservationId;
	}

	public void setReservationId(java.lang.String reservationId) {
		this.reservationId = reservationId;
	}

	@javax.persistence.Column(name = "guest_type", length = 32)
	public java.lang.String getGuestType() {
		return this.guestType;
	}

	public void setGuestType(java.lang.String guestType) {
		this.guestType = guestType;
	}

	@javax.persistence.Column(name = "restart_required", nullable = false, precision = 10)
	public java.lang.Integer getRestartRequired() {
		return this.restartRequired;
	}

	public void setRestartRequired(java.lang.Integer restartRequired) {
		this.restartRequired = restartRequired;
	}

	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}

	public void setRemoved(java.sql.Timestamp removed) {
		this.removed = removed;
	}

	@javax.persistence.Column(name = "specify_ip_ranges", nullable = false, precision = 10)
	public java.lang.Integer getSpecifyIpRanges() {
		return this.specifyIpRanges;
	}

	public void setSpecifyIpRanges(java.lang.Integer specifyIpRanges) {
		this.specifyIpRanges = specifyIpRanges;
	}

	@javax.persistence.Column(name = "vpc_id", precision = 20)
	public java.lang.Long getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(java.lang.Long vpcId) {
		this.vpcId = vpcId;
	}

	@javax.persistence.Column(name = "ip6_gateway", length = 50)
	public java.lang.String getIp6Gateway() {
		return this.ip6Gateway;
	}

	public void setIp6Gateway(java.lang.String ip6Gateway) {
		this.ip6Gateway = ip6Gateway;
	}

	@javax.persistence.Column(name = "ip6_cidr", length = 50)
	public java.lang.String getIp6Cidr() {
		return this.ip6Cidr;
	}

	public void setIp6Cidr(java.lang.String ip6Cidr) {
		this.ip6Cidr = ip6Cidr;
	}

	@javax.persistence.Column(name = "network_cidr", length = 18)
	public java.lang.String getNetworkCidr() {
		return this.networkCidr;
	}

	public void setNetworkCidr(java.lang.String networkCidr) {
		this.networkCidr = networkCidr;
	}

	@javax.persistence.Column(name = "display_network", nullable = false, precision = 1)
	public java.lang.Boolean getDisplayNetwork() {
		return this.displayNetwork;
	}

	public void setDisplayNetwork(java.lang.Boolean displayNetwork) {
		this.displayNetwork = displayNetwork;
	}

	@javax.persistence.Column(name = "network_acl_id", precision = 20)
	public java.lang.Long getNetworkAclId() {
		return this.networkAclId;
	}

	public void setNetworkAclId(java.lang.Long networkAclId) {
		this.networkAclId = networkAclId;
	}
}