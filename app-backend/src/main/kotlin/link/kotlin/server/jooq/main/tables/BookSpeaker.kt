/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import kotlin.collections.Collection
import kotlin.collections.List

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.BOOK_SPEAKER_PKEY
import link.kotlin.server.jooq.main.keys.BOOK_SPEAKER__BOOK_SPEAKER_BOOK_ID_FKEY
import link.kotlin.server.jooq.main.keys.BOOK_SPEAKER__BOOK_SPEAKER_KOTLINER_ID_FKEY
import link.kotlin.server.jooq.main.tables.Book.BookPath
import link.kotlin.server.jooq.main.tables.Kotliner.KotlinerPath
import link.kotlin.server.jooq.main.tables.records.BookSpeakerRecord

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class BookSpeaker(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, BookSpeakerRecord>?,
    parentPath: InverseForeignKey<out Record, BookSpeakerRecord>?,
    aliased: Table<BookSpeakerRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<BookSpeakerRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.book_speaker</code>
         */
        val BOOK_SPEAKER: BookSpeaker = BookSpeaker()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<BookSpeakerRecord> = BookSpeakerRecord::class.java

    /**
     * The column <code>public.book_speaker.book_id</code>.
     */
    val BOOK_ID: TableField<BookSpeakerRecord, Long?> = createField(DSL.name("book_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.book_speaker.kotliner_id</code>.
     */
    val KOTLINER_ID: TableField<BookSpeakerRecord, Long?> = createField(DSL.name("kotliner_id"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<BookSpeakerRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<BookSpeakerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<BookSpeakerRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.book_speaker</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.book_speaker</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.book_speaker</code> table reference
     */
    constructor(): this(DSL.name("book_speaker"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, BookSpeakerRecord>?, parentPath: InverseForeignKey<out Record, BookSpeakerRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, BOOK_SPEAKER, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class BookSpeakerPath : BookSpeaker, Path<BookSpeakerRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, BookSpeakerRecord>?, parentPath: InverseForeignKey<out Record, BookSpeakerRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<BookSpeakerRecord>): super(alias, aliased)
        override fun `as`(alias: String): BookSpeakerPath = BookSpeakerPath(DSL.name(alias), this)
        override fun `as`(alias: Name): BookSpeakerPath = BookSpeakerPath(alias, this)
        override fun `as`(alias: Table<*>): BookSpeakerPath = BookSpeakerPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<BookSpeakerRecord> = BOOK_SPEAKER_PKEY
    override fun getReferences(): List<ForeignKey<BookSpeakerRecord, *>> = listOf(BOOK_SPEAKER__BOOK_SPEAKER_BOOK_ID_FKEY, BOOK_SPEAKER__BOOK_SPEAKER_KOTLINER_ID_FKEY)

    private lateinit var _book: BookPath

    /**
     * Get the implicit join path to the <code>public.book</code> table.
     */
    fun book(): BookPath {
        if (!this::_book.isInitialized)
            _book = BookPath(this, BOOK_SPEAKER__BOOK_SPEAKER_BOOK_ID_FKEY, null)

        return _book;
    }

    val book: BookPath
        get(): BookPath = book()

    private lateinit var _kotliner: KotlinerPath

    /**
     * Get the implicit join path to the <code>public.kotliner</code> table.
     */
    fun kotliner(): KotlinerPath {
        if (!this::_kotliner.isInitialized)
            _kotliner = KotlinerPath(this, BOOK_SPEAKER__BOOK_SPEAKER_KOTLINER_ID_FKEY, null)

        return _kotliner;
    }

    val kotliner: KotlinerPath
        get(): KotlinerPath = kotliner()
    override fun `as`(alias: String): BookSpeaker = BookSpeaker(DSL.name(alias), this)
    override fun `as`(alias: Name): BookSpeaker = BookSpeaker(alias, this)
    override fun `as`(alias: Table<*>): BookSpeaker = BookSpeaker(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): BookSpeaker = BookSpeaker(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): BookSpeaker = BookSpeaker(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): BookSpeaker = BookSpeaker(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): BookSpeaker = BookSpeaker(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): BookSpeaker = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): BookSpeaker = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): BookSpeaker = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): BookSpeaker = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): BookSpeaker = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): BookSpeaker = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): BookSpeaker = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): BookSpeaker = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): BookSpeaker = where(DSL.notExists(select))
}