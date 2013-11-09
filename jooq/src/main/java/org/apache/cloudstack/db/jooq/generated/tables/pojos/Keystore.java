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
@javax.persistence.Table(name = "keystore", schema = "cloud")
public class Keystore implements java.io.Serializable {

	private static final long serialVersionUID = 1987619022;

	private java.lang.Long    id;
	private java.lang.String  name;
	private java.lang.String  certificate;
	private java.lang.String  key;
	private java.lang.String  domainSuffix;
	private java.lang.Integer seq;

	public Keystore() {}

	public Keystore(
		java.lang.Long    id,
		java.lang.String  name,
		java.lang.String  certificate,
		java.lang.String  key,
		java.lang.String  domainSuffix,
		java.lang.Integer seq
	) {
		this.id = id;
		this.name = name;
		this.certificate = certificate;
		this.key = key;
		this.domainSuffix = domainSuffix;
		this.seq = seq;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "name", unique = true, nullable = false, length = 64)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "certificate", nullable = false)
	public java.lang.String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(java.lang.String certificate) {
		this.certificate = certificate;
	}

	@javax.persistence.Column(name = "key")
	public java.lang.String getKey() {
		return this.key;
	}

	public void setKey(java.lang.String key) {
		this.key = key;
	}

	@javax.persistence.Column(name = "domain_suffix", nullable = false, length = 256)
	public java.lang.String getDomainSuffix() {
		return this.domainSuffix;
	}

	public void setDomainSuffix(java.lang.String domainSuffix) {
		this.domainSuffix = domainSuffix;
	}

	@javax.persistence.Column(name = "seq", precision = 10)
	public java.lang.Integer getSeq() {
		return this.seq;
	}

	public void setSeq(java.lang.Integer seq) {
		this.seq = seq;
	}
}