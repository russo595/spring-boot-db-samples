/**
 * This class is generated by jOOQ
 */
package com.example.jooq.tables;


import com.example.jooq.Keys;
import com.example.jooq.Public;
import com.example.jooq.tables.records.ToppingRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Topping extends TableImpl<ToppingRecord> {

    private static final long serialVersionUID = -1162717658;

    /**
     * The reference instance of <code>PUBLIC.TOPPING</code>
     */
    public static final Topping TOPPING = new Topping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ToppingRecord> getRecordType() {
        return ToppingRecord.class;
    }

    /**
     * The column <code>PUBLIC.TOPPING.ID</code>.
     */
    public final TableField<ToppingRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("(NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_4C00A008_A398_49BD_A34B_F3C37950D4C4)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>PUBLIC.TOPPING.NAME</code>.
     */
    public final TableField<ToppingRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>PUBLIC.TOPPING</code> table reference
     */
    public Topping() {
        this("TOPPING", null);
    }

    /**
     * Create an aliased <code>PUBLIC.TOPPING</code> table reference
     */
    public Topping(String alias) {
        this(alias, TOPPING);
    }

    private Topping(String alias, Table<ToppingRecord> aliased) {
        this(alias, aliased, null);
    }

    private Topping(String alias, Table<ToppingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ToppingRecord, Long> getIdentity() {
        return Keys.IDENTITY_TOPPING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ToppingRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_E;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ToppingRecord>> getKeys() {
        return Arrays.<UniqueKey<ToppingRecord>>asList(Keys.CONSTRAINT_E);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Topping as(String alias) {
        return new Topping(alias, this);
    }

    /**
     * Rename this table
     */
    public Topping rename(String name) {
        return new Topping(name, null);
    }
}