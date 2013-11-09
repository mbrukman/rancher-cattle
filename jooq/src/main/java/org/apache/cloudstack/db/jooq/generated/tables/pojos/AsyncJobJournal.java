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
@javax.persistence.Table(name = "async_job_journal", schema = "cloud")
public class AsyncJobJournal implements java.io.Serializable {

	private static final long serialVersionUID = -1198097056;

	private java.lang.Long     id;
	private java.lang.Long     jobId;
	private java.lang.String   journalType;
	private java.lang.String   journalText;
	private java.lang.String   journalObj;
	private java.sql.Timestamp created;

	public AsyncJobJournal() {}

	public AsyncJobJournal(
		java.lang.Long     id,
		java.lang.Long     jobId,
		java.lang.String   journalType,
		java.lang.String   journalText,
		java.lang.String   journalObj,
		java.sql.Timestamp created
	) {
		this.id = id;
		this.jobId = jobId;
		this.journalType = journalType;
		this.journalText = journalText;
		this.journalObj = journalObj;
		this.created = created;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "job_id", nullable = false, precision = 20)
	public java.lang.Long getJobId() {
		return this.jobId;
	}

	public void setJobId(java.lang.Long jobId) {
		this.jobId = jobId;
	}

	@javax.persistence.Column(name = "journal_type", length = 32)
	public java.lang.String getJournalType() {
		return this.journalType;
	}

	public void setJournalType(java.lang.String journalType) {
		this.journalType = journalType;
	}

	@javax.persistence.Column(name = "journal_text", length = 1024)
	public java.lang.String getJournalText() {
		return this.journalText;
	}

	public void setJournalText(java.lang.String journalText) {
		this.journalText = journalText;
	}

	@javax.persistence.Column(name = "journal_obj", length = 1024)
	public java.lang.String getJournalObj() {
		return this.journalObj;
	}

	public void setJournalObj(java.lang.String journalObj) {
		this.journalObj = journalObj;
	}

	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}
}