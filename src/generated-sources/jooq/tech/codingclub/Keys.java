/**
 * This class is generated by jOOQ
 */
package tech.codingclub;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<tech.codingclub.tables.records.MemberRecord, java.lang.Long> IDENTITY_MEMBER = Identities0.IDENTITY_MEMBER;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<tech.codingclub.tables.records.MemberRecord, java.lang.Long> IDENTITY_MEMBER = createIdentity(tech.codingclub.tables.Member.MEMBER, tech.codingclub.tables.Member.MEMBER.ID);
	}
}
