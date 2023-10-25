import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.mysqlite.model.CourseModel
class DBHandler // creating a constructor for our database handler.
    (context: Context?) :
    SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {
    // below method is for creating a database by running a sqlite query
    override fun onCreate(db: SQLiteDatabase) {
        // on below line we are creating an sqlite query and we are
        // setting our column names along with their data types.
        val query = ("CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Nome_Col + " TEXT,"
                + Endereco_Col + " TEXT,"
                + Bairro_Col + " TEXT,"
                + Cep_Col + " TEXT,"
                + Cidade_Col + " TEXT,"
                + Estado_Col + " TEXT,"
                + Telefone_Col + " TEXT,"
                + Celular_Col +" TEXT)"
)

        // at last we are calling a exec sql method to execute above sql query
        db.execSQL(query)
    }

    // this method is use to add new course to our sqlite database.
    fun addNewCourse(
        Nome: String?,
        Endereco: String?,
        Bairro: String?,
        Cep: String?,
        Cidade: String?,
        Estado: String?,
        Telefone: String?,
        Celular: String?
    ) {
        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        val db = this.writableDatabase
        // on below line we are creating a
        // variable for content values.
        val values = ContentValues()
        // on below line we are passing all values
        // along with its key and value pair.
        values.put(Nome_Col, Nome)
        values.put(Endereco_Col, Endereco)
        values.put(Bairro_Col, Bairro)
        values.put(Cep_Col, Cep)
        values.put(Cidade_Col, Cidade)
        values.put(Estado_Col, Estado)
        values.put(Telefone_Col, Telefone)
        values.put(Celular_Col, Celular)
        // after adding all values we are passing
        // content values to our table.
        db.insert(TABLE_NAME, null, values)
        // at last we are closing our
        // database after adding database.
        db.close()
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    companion object {
        // creating a constant variables for our database.
        // below variable is for our database name.
        private const val DB_NAME = "coursedb"

        // below int is our database version
        private const val DB_VERSION = 1

        // below variable is for our table name.
        private const val TABLE_NAME = "mycourses"

        // below variable is for our id column.
        private const val ID_COL = "id"

        // below variable is for our course name column
        private const val Nome_Col = "name"

        // below variable id for our course duration column.
        private const val Endereco_Col = "Endereco"

        // below variable for our course description column.
        private const val Bairro_Col = "Bairro"

        // below variable is for our course tracks column.
        private const val Cep_Col = "Cep"


        // below variable is for our id column.
        private const val Cidade_Col = "Cidade"

        // below variable is for our course name column
        private const val Estado_Col = "Estado"

        // below variable id for our course duration column.
        private const val Telefone_Col = "Telefone"

        // below variable for our course description column.
        private const val Celular_Col = "Celular"

    }

    // we have created a new method for reading all the courses.
    fun readCourses(): ArrayList<CourseModel>? {
        // on below line we are creating a database for reading our database.
        val db = this.readableDatabase

        // on below line we are creating a cursor with query to read data from database.
        val cursorCourses: Cursor = db.rawQuery("SELECT * FROM $TABLE_NAME", null)

        // on below line we are creating a new array list.
        val courseModelArrayList: ArrayList<CourseModel> = ArrayList()

        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {
                // on below line we are adding the data from cursor to our array list.
                courseModelArrayList.add(
                    CourseModel(
                        cursorCourses.getString(1),
                        cursorCourses.getString(4),
                        cursorCourses.getString(2),
                        cursorCourses.getString(3),
                        cursorCourses.getString(5),
                        cursorCourses.getString(6),
                        cursorCourses.getString(7),
                        cursorCourses.getString(8)

                    )
                )
            } while (cursorCourses.moveToNext())
            // moving our cursor to next.
        }
        // at last closing our cursor and returning our array list.
        cursorCourses.close()
        return courseModelArrayList
    }
}