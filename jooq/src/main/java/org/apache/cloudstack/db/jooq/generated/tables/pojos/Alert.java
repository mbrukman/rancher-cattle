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
@javax.persistence.Table(name = "alert", schema = "cloud")
public class Alert implements java.io.Serializable {

	private static final long serialVersionUID = 1007654109;

	private java.lang.Long     id;
	private java.lang.String   uuid;
	private java.lang.Integer  type;
	private java.lang.Long     clusterId;
	private java.lang.Long     podId;
	private java.lang.Long     dataCenterId;
	private java.lang.String   subject;
	private java.lang.Integer  sentCount;
	private java.sql.Timestamp created;
	private java.sql.Timestamp lastSent;
	private java.sql.Timestamp resolved;
	private java.lang.Boolean  archived;

	public Alert() {}

	public Alert(
		java.lang.Long     id,
		java.lang.String   uuid,
		java.lang.Integer  type,
		java.lang.Long     clusterId,
		java.lang.Long     podId,
		java.lang.Long     dataCenterId,
		java.lang.String   subject,
		java.lang.Integer  sentCount,
		java.sql.Timestamp created,
		java.sql.Timestamp lastSent,
		java.sql.Timestamp resolved,
		java.lang.Boolean  archived
	) {
		this.id = id;
		this.uuid = uuid;
		this.type = type;
		this.clusterId = clusterId;
		this.podId = podId;
		this.dataCenterId = dataCenterId;
		this.subject = subject;
		this.sentCount = sentCount;
		this.created = created;
		this.lastSent = lastSent;
		this.resolved = resolved;
		this.archived = archived;
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

	@javax.persistence.Column(name = "type", nullable = false, precision = 10)
	public java.lang.Integer getType() {
		return this.type;
	}

	public void setType(java.lang.Integer type) {
		this.type = type;
	}

	@javax.persistence.Column(name = "cluster_id", precision = 20)
	public java.lang.Long getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(java.lang.Long clusterId) {
		this.clusterId = clusterId;
	}

	@javax.persistence.Column(name = "pod_id", precision = 20)
	public java.lang.Long getPodId() {
		return this.podId;
	}

	public void setPodId(java.lang.Long podId) {
		this.podId = podId;
	}

	@javax.persistence.Column(name = "data_center_id", nullable = false, precision = 20)
	public java.lang.Long getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(java.lang.Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}

	@javax.persistence.Column(name = "subject", length = 999)
	public java.lang.String getSubject() {
		return this.subject;
	}

	public void setSubject(java.lang.String subject) {
		this.subject = subject;
	}

	@javax.persistence.Column(name = "sent_count", nullable = false, precision = 10)
	public java.lang.Integer getSentCount() {
		return this.sentCount;
	}

	public void setSentCount(java.lang.Integer sentCount) {
		this.sentCount = sentCount;
	}

	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "last_sent")
	public java.sql.Timestamp getLastSent() {
		return this.lastSent;
	}

	public void setLastSent(java.sql.Timestamp lastSent) {
		this.lastSent = lastSent;
	}

	@javax.persistence.Column(name = "resolved")
	public java.sql.Timestamp getResolved() {
		return this.resolved;
	}

	public void setResolved(java.sql.Timestamp resolved) {
		this.resolved = resolved;
	}

	@javax.persistence.Column(name = "archived", nullable = false, precision = 1)
	public java.lang.Boolean getArchived() {
		return this.archived;
	}

	public void setArchived(java.lang.Boolean archived) {
		this.archived = archived;
	}
}