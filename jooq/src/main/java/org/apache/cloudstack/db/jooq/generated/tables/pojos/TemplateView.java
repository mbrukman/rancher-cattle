/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "template_view", schema = "cloud")
public class TemplateView implements java.io.Serializable {

	private static final long serialVersionUID = -178873755;

	private java.lang.Long     id;
	private java.lang.String   uuid;
	private java.lang.String   uniqueName;
	private java.lang.String   name;
	private java.lang.Integer  public_;
	private java.lang.Integer  featured;
	private java.lang.String   type;
	private java.lang.Integer  hvm;
	private java.lang.Integer  bits;
	private java.lang.String   url;
	private java.lang.String   format;
	private java.sql.Timestamp created;
	private java.lang.String   checksum;
	private java.lang.String   displayText;
	private java.lang.Integer  enablePassword;
	private java.lang.Boolean  dynamicallyScalable;
	private java.lang.Long     guestOsId;
	private java.lang.String   guestOsUuid;
	private java.lang.String   guestOsName;
	private java.lang.Integer  bootable;
	private java.lang.Integer  prepopulate;
	private java.lang.Integer  crossZones;
	private java.lang.String   hypervisorType;
	private java.lang.Integer  extractable;
	private java.lang.String   templateTag;
	private java.lang.Integer  sortKey;
	private java.sql.Timestamp removed;
	private java.lang.Integer  enableSshkey;
	private java.lang.Long     sourceTemplateId;
	private java.lang.String   sourceTemplateUuid;
	private java.lang.Long     accountId;
	private java.lang.String   accountUuid;
	private java.lang.String   accountName;
	private java.lang.Integer  accountType;
	private java.lang.Long     domainId;
	private java.lang.String   domainUuid;
	private java.lang.String   domainName;
	private java.lang.String   domainPath;
	private java.lang.Long     projectId;
	private java.lang.String   projectUuid;
	private java.lang.String   projectName;
	private java.lang.Long     dataCenterId;
	private java.lang.String   dataCenterUuid;
	private java.lang.String   dataCenterName;
	private java.lang.Long     lpAccountId;
	private java.lang.Long     storeId;
	private java.lang.String   storeScope;
	private java.lang.String   state;
	private java.lang.String   downloadState;
	private java.lang.Integer  downloadPct;
	private java.lang.String   errorStr;
	private java.lang.Long     size;
	private java.lang.Boolean  destroyed;
	private java.sql.Timestamp createdOnStore;
	private java.lang.String   detailName;
	private java.lang.String   detailValue;
	private java.lang.Long     tagId;
	private java.lang.String   tagUuid;
	private java.lang.String   tagKey;
	private java.lang.String   tagValue;
	private java.lang.Long     tagDomainId;
	private java.lang.Long     tagAccountId;
	private java.lang.Long     tagResourceId;
	private java.lang.String   tagResourceUuid;
	private java.lang.String   tagResourceType;
	private java.lang.String   tagCustomer;
	private java.lang.String   tempZonePair;

	public TemplateView() {}

	public TemplateView(
		java.lang.Long     id,
		java.lang.String   uuid,
		java.lang.String   uniqueName,
		java.lang.String   name,
		java.lang.Integer  public_,
		java.lang.Integer  featured,
		java.lang.String   type,
		java.lang.Integer  hvm,
		java.lang.Integer  bits,
		java.lang.String   url,
		java.lang.String   format,
		java.sql.Timestamp created,
		java.lang.String   checksum,
		java.lang.String   displayText,
		java.lang.Integer  enablePassword,
		java.lang.Boolean  dynamicallyScalable,
		java.lang.Long     guestOsId,
		java.lang.String   guestOsUuid,
		java.lang.String   guestOsName,
		java.lang.Integer  bootable,
		java.lang.Integer  prepopulate,
		java.lang.Integer  crossZones,
		java.lang.String   hypervisorType,
		java.lang.Integer  extractable,
		java.lang.String   templateTag,
		java.lang.Integer  sortKey,
		java.sql.Timestamp removed,
		java.lang.Integer  enableSshkey,
		java.lang.Long     sourceTemplateId,
		java.lang.String   sourceTemplateUuid,
		java.lang.Long     accountId,
		java.lang.String   accountUuid,
		java.lang.String   accountName,
		java.lang.Integer  accountType,
		java.lang.Long     domainId,
		java.lang.String   domainUuid,
		java.lang.String   domainName,
		java.lang.String   domainPath,
		java.lang.Long     projectId,
		java.lang.String   projectUuid,
		java.lang.String   projectName,
		java.lang.Long     dataCenterId,
		java.lang.String   dataCenterUuid,
		java.lang.String   dataCenterName,
		java.lang.Long     lpAccountId,
		java.lang.Long     storeId,
		java.lang.String   storeScope,
		java.lang.String   state,
		java.lang.String   downloadState,
		java.lang.Integer  downloadPct,
		java.lang.String   errorStr,
		java.lang.Long     size,
		java.lang.Boolean  destroyed,
		java.sql.Timestamp createdOnStore,
		java.lang.String   detailName,
		java.lang.String   detailValue,
		java.lang.Long     tagId,
		java.lang.String   tagUuid,
		java.lang.String   tagKey,
		java.lang.String   tagValue,
		java.lang.Long     tagDomainId,
		java.lang.Long     tagAccountId,
		java.lang.Long     tagResourceId,
		java.lang.String   tagResourceUuid,
		java.lang.String   tagResourceType,
		java.lang.String   tagCustomer,
		java.lang.String   tempZonePair
	) {
		this.id = id;
		this.uuid = uuid;
		this.uniqueName = uniqueName;
		this.name = name;
		this.public_ = public_;
		this.featured = featured;
		this.type = type;
		this.hvm = hvm;
		this.bits = bits;
		this.url = url;
		this.format = format;
		this.created = created;
		this.checksum = checksum;
		this.displayText = displayText;
		this.enablePassword = enablePassword;
		this.dynamicallyScalable = dynamicallyScalable;
		this.guestOsId = guestOsId;
		this.guestOsUuid = guestOsUuid;
		this.guestOsName = guestOsName;
		this.bootable = bootable;
		this.prepopulate = prepopulate;
		this.crossZones = crossZones;
		this.hypervisorType = hypervisorType;
		this.extractable = extractable;
		this.templateTag = templateTag;
		this.sortKey = sortKey;
		this.removed = removed;
		this.enableSshkey = enableSshkey;
		this.sourceTemplateId = sourceTemplateId;
		this.sourceTemplateUuid = sourceTemplateUuid;
		this.accountId = accountId;
		this.accountUuid = accountUuid;
		this.accountName = accountName;
		this.accountType = accountType;
		this.domainId = domainId;
		this.domainUuid = domainUuid;
		this.domainName = domainName;
		this.domainPath = domainPath;
		this.projectId = projectId;
		this.projectUuid = projectUuid;
		this.projectName = projectName;
		this.dataCenterId = dataCenterId;
		this.dataCenterUuid = dataCenterUuid;
		this.dataCenterName = dataCenterName;
		this.lpAccountId = lpAccountId;
		this.storeId = storeId;
		this.storeScope = storeScope;
		this.state = state;
		this.downloadState = downloadState;
		this.downloadPct = downloadPct;
		this.errorStr = errorStr;
		this.size = size;
		this.destroyed = destroyed;
		this.createdOnStore = createdOnStore;
		this.detailName = detailName;
		this.detailValue = detailValue;
		this.tagId = tagId;
		this.tagUuid = tagUuid;
		this.tagKey = tagKey;
		this.tagValue = tagValue;
		this.tagDomainId = tagDomainId;
		this.tagAccountId = tagAccountId;
		this.tagResourceId = tagResourceId;
		this.tagResourceUuid = tagResourceUuid;
		this.tagResourceType = tagResourceType;
		this.tagCustomer = tagCustomer;
		this.tempZonePair = tempZonePair;
	}

	@javax.persistence.Column(name = "id", nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "uuid", length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "unique_name", nullable = false, length = 255)
	public java.lang.String getUniqueName() {
		return this.uniqueName;
	}

	public void setUniqueName(java.lang.String uniqueName) {
		this.uniqueName = uniqueName;
	}

	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "public", nullable = false, precision = 10)
	public java.lang.Integer getPublic() {
		return this.public_;
	}

	public void setPublic(java.lang.Integer public_) {
		this.public_ = public_;
	}

	@javax.persistence.Column(name = "featured", nullable = false, precision = 10)
	public java.lang.Integer getFeatured() {
		return this.featured;
	}

	public void setFeatured(java.lang.Integer featured) {
		this.featured = featured;
	}

	@javax.persistence.Column(name = "type", length = 32)
	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	@javax.persistence.Column(name = "hvm", nullable = false, precision = 10)
	public java.lang.Integer getHvm() {
		return this.hvm;
	}

	public void setHvm(java.lang.Integer hvm) {
		this.hvm = hvm;
	}

	@javax.persistence.Column(name = "bits", nullable = false, precision = 10)
	public java.lang.Integer getBits() {
		return this.bits;
	}

	public void setBits(java.lang.Integer bits) {
		this.bits = bits;
	}

	@javax.persistence.Column(name = "url", length = 255)
	public java.lang.String getUrl() {
		return this.url;
	}

	public void setUrl(java.lang.String url) {
		this.url = url;
	}

	@javax.persistence.Column(name = "format", nullable = false, length = 32)
	public java.lang.String getFormat() {
		return this.format;
	}

	public void setFormat(java.lang.String format) {
		this.format = format;
	}

	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "checksum", length = 255)
	public java.lang.String getChecksum() {
		return this.checksum;
	}

	public void setChecksum(java.lang.String checksum) {
		this.checksum = checksum;
	}

	@javax.persistence.Column(name = "display_text", length = 4096)
	public java.lang.String getDisplayText() {
		return this.displayText;
	}

	public void setDisplayText(java.lang.String displayText) {
		this.displayText = displayText;
	}

	@javax.persistence.Column(name = "enable_password", nullable = false, precision = 10)
	public java.lang.Integer getEnablePassword() {
		return this.enablePassword;
	}

	public void setEnablePassword(java.lang.Integer enablePassword) {
		this.enablePassword = enablePassword;
	}

	@javax.persistence.Column(name = "dynamically_scalable", nullable = false, precision = 1)
	public java.lang.Boolean getDynamicallyScalable() {
		return this.dynamicallyScalable;
	}

	public void setDynamicallyScalable(java.lang.Boolean dynamicallyScalable) {
		this.dynamicallyScalable = dynamicallyScalable;
	}

	@javax.persistence.Column(name = "guest_os_id", nullable = false, precision = 20)
	public java.lang.Long getGuestOsId() {
		return this.guestOsId;
	}

	public void setGuestOsId(java.lang.Long guestOsId) {
		this.guestOsId = guestOsId;
	}

	@javax.persistence.Column(name = "guest_os_uuid", length = 40)
	public java.lang.String getGuestOsUuid() {
		return this.guestOsUuid;
	}

	public void setGuestOsUuid(java.lang.String guestOsUuid) {
		this.guestOsUuid = guestOsUuid;
	}

	@javax.persistence.Column(name = "guest_os_name", nullable = false, length = 255)
	public java.lang.String getGuestOsName() {
		return this.guestOsName;
	}

	public void setGuestOsName(java.lang.String guestOsName) {
		this.guestOsName = guestOsName;
	}

	@javax.persistence.Column(name = "bootable", nullable = false, precision = 10)
	public java.lang.Integer getBootable() {
		return this.bootable;
	}

	public void setBootable(java.lang.Integer bootable) {
		this.bootable = bootable;
	}

	@javax.persistence.Column(name = "prepopulate", nullable = false, precision = 10)
	public java.lang.Integer getPrepopulate() {
		return this.prepopulate;
	}

	public void setPrepopulate(java.lang.Integer prepopulate) {
		this.prepopulate = prepopulate;
	}

	@javax.persistence.Column(name = "cross_zones", nullable = false, precision = 10)
	public java.lang.Integer getCrossZones() {
		return this.crossZones;
	}

	public void setCrossZones(java.lang.Integer crossZones) {
		this.crossZones = crossZones;
	}

	@javax.persistence.Column(name = "hypervisor_type", length = 32)
	public java.lang.String getHypervisorType() {
		return this.hypervisorType;
	}

	public void setHypervisorType(java.lang.String hypervisorType) {
		this.hypervisorType = hypervisorType;
	}

	@javax.persistence.Column(name = "extractable", nullable = false, precision = 10)
	public java.lang.Integer getExtractable() {
		return this.extractable;
	}

	public void setExtractable(java.lang.Integer extractable) {
		this.extractable = extractable;
	}

	@javax.persistence.Column(name = "template_tag", length = 255)
	public java.lang.String getTemplateTag() {
		return this.templateTag;
	}

	public void setTemplateTag(java.lang.String templateTag) {
		this.templateTag = templateTag;
	}

	@javax.persistence.Column(name = "sort_key", nullable = false, precision = 10)
	public java.lang.Integer getSortKey() {
		return this.sortKey;
	}

	public void setSortKey(java.lang.Integer sortKey) {
		this.sortKey = sortKey;
	}

	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}

	public void setRemoved(java.sql.Timestamp removed) {
		this.removed = removed;
	}

	@javax.persistence.Column(name = "enable_sshkey", nullable = false, precision = 10)
	public java.lang.Integer getEnableSshkey() {
		return this.enableSshkey;
	}

	public void setEnableSshkey(java.lang.Integer enableSshkey) {
		this.enableSshkey = enableSshkey;
	}

	@javax.persistence.Column(name = "source_template_id", precision = 20)
	public java.lang.Long getSourceTemplateId() {
		return this.sourceTemplateId;
	}

	public void setSourceTemplateId(java.lang.Long sourceTemplateId) {
		this.sourceTemplateId = sourceTemplateId;
	}

	@javax.persistence.Column(name = "source_template_uuid", length = 40)
	public java.lang.String getSourceTemplateUuid() {
		return this.sourceTemplateUuid;
	}

	public void setSourceTemplateUuid(java.lang.String sourceTemplateUuid) {
		this.sourceTemplateUuid = sourceTemplateUuid;
	}

	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "account_uuid", length = 40)
	public java.lang.String getAccountUuid() {
		return this.accountUuid;
	}

	public void setAccountUuid(java.lang.String accountUuid) {
		this.accountUuid = accountUuid;
	}

	@javax.persistence.Column(name = "account_name", length = 100)
	public java.lang.String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(java.lang.String accountName) {
		this.accountName = accountName;
	}

	@javax.persistence.Column(name = "account_type", nullable = false, precision = 10)
	public java.lang.Integer getAccountType() {
		return this.accountType;
	}

	public void setAccountType(java.lang.Integer accountType) {
		this.accountType = accountType;
	}

	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.Long domainId) {
		this.domainId = domainId;
	}

	@javax.persistence.Column(name = "domain_uuid", length = 40)
	public java.lang.String getDomainUuid() {
		return this.domainUuid;
	}

	public void setDomainUuid(java.lang.String domainUuid) {
		this.domainUuid = domainUuid;
	}

	@javax.persistence.Column(name = "domain_name", length = 255)
	public java.lang.String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(java.lang.String domainName) {
		this.domainName = domainName;
	}

	@javax.persistence.Column(name = "domain_path", nullable = false, length = 255)
	public java.lang.String getDomainPath() {
		return this.domainPath;
	}

	public void setDomainPath(java.lang.String domainPath) {
		this.domainPath = domainPath;
	}

	@javax.persistence.Column(name = "project_id", precision = 20)
	public java.lang.Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(java.lang.Long projectId) {
		this.projectId = projectId;
	}

	@javax.persistence.Column(name = "project_uuid", length = 40)
	public java.lang.String getProjectUuid() {
		return this.projectUuid;
	}

	public void setProjectUuid(java.lang.String projectUuid) {
		this.projectUuid = projectUuid;
	}

	@javax.persistence.Column(name = "project_name", length = 255)
	public java.lang.String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(java.lang.String projectName) {
		this.projectName = projectName;
	}

	@javax.persistence.Column(name = "data_center_id", precision = 20)
	public java.lang.Long getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(java.lang.Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}

	@javax.persistence.Column(name = "data_center_uuid", length = 40)
	public java.lang.String getDataCenterUuid() {
		return this.dataCenterUuid;
	}

	public void setDataCenterUuid(java.lang.String dataCenterUuid) {
		this.dataCenterUuid = dataCenterUuid;
	}

	@javax.persistence.Column(name = "data_center_name", length = 255)
	public java.lang.String getDataCenterName() {
		return this.dataCenterName;
	}

	public void setDataCenterName(java.lang.String dataCenterName) {
		this.dataCenterName = dataCenterName;
	}

	@javax.persistence.Column(name = "lp_account_id", precision = 20)
	public java.lang.Long getLpAccountId() {
		return this.lpAccountId;
	}

	public void setLpAccountId(java.lang.Long lpAccountId) {
		this.lpAccountId = lpAccountId;
	}

	@javax.persistence.Column(name = "store_id", precision = 20)
	public java.lang.Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(java.lang.Long storeId) {
		this.storeId = storeId;
	}

	@javax.persistence.Column(name = "store_scope", length = 255)
	public java.lang.String getStoreScope() {
		return this.storeScope;
	}

	public void setStoreScope(java.lang.String storeScope) {
		this.storeScope = storeScope;
	}

	@javax.persistence.Column(name = "state", length = 255)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	@javax.persistence.Column(name = "download_state", length = 255)
	public java.lang.String getDownloadState() {
		return this.downloadState;
	}

	public void setDownloadState(java.lang.String downloadState) {
		this.downloadState = downloadState;
	}

	@javax.persistence.Column(name = "download_pct", precision = 10)
	public java.lang.Integer getDownloadPct() {
		return this.downloadPct;
	}

	public void setDownloadPct(java.lang.Integer downloadPct) {
		this.downloadPct = downloadPct;
	}

	@javax.persistence.Column(name = "error_str", length = 255)
	public java.lang.String getErrorStr() {
		return this.errorStr;
	}

	public void setErrorStr(java.lang.String errorStr) {
		this.errorStr = errorStr;
	}

	@javax.persistence.Column(name = "size", precision = 20)
	public java.lang.Long getSize() {
		return this.size;
	}

	public void setSize(java.lang.Long size) {
		this.size = size;
	}

	@javax.persistence.Column(name = "destroyed", precision = 1)
	public java.lang.Boolean getDestroyed() {
		return this.destroyed;
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		this.destroyed = destroyed;
	}

	@javax.persistence.Column(name = "created_on_store")
	public java.sql.Timestamp getCreatedOnStore() {
		return this.createdOnStore;
	}

	public void setCreatedOnStore(java.sql.Timestamp createdOnStore) {
		this.createdOnStore = createdOnStore;
	}

	@javax.persistence.Column(name = "detail_name", length = 255)
	public java.lang.String getDetailName() {
		return this.detailName;
	}

	public void setDetailName(java.lang.String detailName) {
		this.detailName = detailName;
	}

	@javax.persistence.Column(name = "detail_value", length = 1024)
	public java.lang.String getDetailValue() {
		return this.detailValue;
	}

	public void setDetailValue(java.lang.String detailValue) {
		this.detailValue = detailValue;
	}

	@javax.persistence.Column(name = "tag_id", precision = 20)
	public java.lang.Long getTagId() {
		return this.tagId;
	}

	public void setTagId(java.lang.Long tagId) {
		this.tagId = tagId;
	}

	@javax.persistence.Column(name = "tag_uuid", length = 40)
	public java.lang.String getTagUuid() {
		return this.tagUuid;
	}

	public void setTagUuid(java.lang.String tagUuid) {
		this.tagUuid = tagUuid;
	}

	@javax.persistence.Column(name = "tag_key", length = 255)
	public java.lang.String getTagKey() {
		return this.tagKey;
	}

	public void setTagKey(java.lang.String tagKey) {
		this.tagKey = tagKey;
	}

	@javax.persistence.Column(name = "tag_value", length = 255)
	public java.lang.String getTagValue() {
		return this.tagValue;
	}

	public void setTagValue(java.lang.String tagValue) {
		this.tagValue = tagValue;
	}

	@javax.persistence.Column(name = "tag_domain_id", precision = 20)
	public java.lang.Long getTagDomainId() {
		return this.tagDomainId;
	}

	public void setTagDomainId(java.lang.Long tagDomainId) {
		this.tagDomainId = tagDomainId;
	}

	@javax.persistence.Column(name = "tag_account_id", precision = 20)
	public java.lang.Long getTagAccountId() {
		return this.tagAccountId;
	}

	public void setTagAccountId(java.lang.Long tagAccountId) {
		this.tagAccountId = tagAccountId;
	}

	@javax.persistence.Column(name = "tag_resource_id", precision = 20)
	public java.lang.Long getTagResourceId() {
		return this.tagResourceId;
	}

	public void setTagResourceId(java.lang.Long tagResourceId) {
		this.tagResourceId = tagResourceId;
	}

	@javax.persistence.Column(name = "tag_resource_uuid", length = 40)
	public java.lang.String getTagResourceUuid() {
		return this.tagResourceUuid;
	}

	public void setTagResourceUuid(java.lang.String tagResourceUuid) {
		this.tagResourceUuid = tagResourceUuid;
	}

	@javax.persistence.Column(name = "tag_resource_type", length = 255)
	public java.lang.String getTagResourceType() {
		return this.tagResourceType;
	}

	public void setTagResourceType(java.lang.String tagResourceType) {
		this.tagResourceType = tagResourceType;
	}

	@javax.persistence.Column(name = "tag_customer", length = 255)
	public java.lang.String getTagCustomer() {
		return this.tagCustomer;
	}

	public void setTagCustomer(java.lang.String tagCustomer) {
		this.tagCustomer = tagCustomer;
	}

	@javax.persistence.Column(name = "temp_zone_pair", length = 42)
	public java.lang.String getTempZonePair() {
		return this.tempZonePair;
	}

	public void setTempZonePair(java.lang.String tempZonePair) {
		this.tempZonePair = tempZonePair;
	}
}