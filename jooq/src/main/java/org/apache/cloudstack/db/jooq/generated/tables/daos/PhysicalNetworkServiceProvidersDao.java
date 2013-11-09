/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhysicalNetworkServiceProvidersDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.PhysicalNetworkServiceProvidersRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders, java.lang.Long> {

	/**
	 * Create a new PhysicalNetworkServiceProvidersDao without any configuration
	 */
	public PhysicalNetworkServiceProvidersDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS, org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders.class);
	}

	/**
	 * Create a new PhysicalNetworkServiceProvidersDao with an attached configuration
	 */
	public PhysicalNetworkServiceProvidersDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS, org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.UUID, value);
	}

	/**
	 * Fetch records that have <code>physical_network_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByPhysicalNetworkId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.PHYSICAL_NETWORK_ID, values);
	}

	/**
	 * Fetch records that have <code>provider_name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByProviderName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.PROVIDER_NAME, values);
	}

	/**
	 * Fetch records that have <code>state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.STATE, values);
	}

	/**
	 * Fetch records that have <code>destination_physical_network_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByDestinationPhysicalNetworkId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.DESTINATION_PHYSICAL_NETWORK_ID, values);
	}

	/**
	 * Fetch records that have <code>vpn_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByVpnServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.VPN_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>dhcp_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByDhcpServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.DHCP_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>dns_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByDnsServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.DNS_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>gateway_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByGatewayServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.GATEWAY_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>firewall_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByFirewallServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.FIREWALL_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>source_nat_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchBySourceNatServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.SOURCE_NAT_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>load_balance_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByLoadBalanceServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.LOAD_BALANCE_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>static_nat_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByStaticNatServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.STATIC_NAT_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>port_forwarding_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByPortForwardingServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.PORT_FORWARDING_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>user_data_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByUserDataServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.USER_DATA_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>security_group_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchBySecurityGroupServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.SECURITY_GROUP_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>networkacl_service_provided IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByNetworkaclServiceProvided(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.NETWORKACL_SERVICE_PROVIDED, values);
	}

	/**
	 * Fetch records that have <code>removed IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.PhysicalNetworkServiceProviders> fetchByRemoved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.PhysicalNetworkServiceProviders.PHYSICAL_NETWORK_SERVICE_PROVIDERS.REMOVED, values);
	}
}