/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemata extends TableImpl<Record> {

	private static final long serialVersionUID = 444195803;

	/**
	 * The reference instance of <code>information_schema.schemata</code>
	 */
	public static final Schemata SCHEMATA = new Schemata();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>information_schema.schemata.catalog_name</code>.
	 */
	public final TableField<Record, String> CATALOG_NAME = createField("catalog_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.schema_name</code>.
	 */
	public final TableField<Record, String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.schema_owner</code>.
	 */
	public final TableField<Record, String> SCHEMA_OWNER = createField("schema_owner", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.default_character_set_catalog</code>.
	 */
	public final TableField<Record, String> DEFAULT_CHARACTER_SET_CATALOG = createField("default_character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.default_character_set_schema</code>.
	 */
	public final TableField<Record, String> DEFAULT_CHARACTER_SET_SCHEMA = createField("default_character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.default_character_set_name</code>.
	 */
	public final TableField<Record, String> DEFAULT_CHARACTER_SET_NAME = createField("default_character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.schemata.sql_path</code>.
	 */
	public final TableField<Record, String> SQL_PATH = createField("sql_path", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>information_schema.schemata</code> table reference
	 */
	public Schemata() {
		this("schemata", null);
	}

	/**
	 * Create an aliased <code>information_schema.schemata</code> table reference
	 */
	public Schemata(String alias) {
		this(alias, SCHEMATA);
	}

	private Schemata(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private Schemata(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schemata as(String alias) {
		return new Schemata(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Schemata rename(String name) {
		return new Schemata(name, null);
	}
}
