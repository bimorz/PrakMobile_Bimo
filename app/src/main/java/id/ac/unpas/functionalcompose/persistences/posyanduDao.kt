package id.ac.unpas.functionalcompose.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.functionalcompose.model.posyandu

@Dao
interface posyanduDao {
    @Query("SELECT * FROM posyandu")
    fun loadAll(): LiveData<List<posyandu>>
    @Query("SELECT * FROM posyandu WHERE id = :id")
    fun find(id: String): posyandu?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: posyandu)
    @Delete
    fun delete(item: posyandu)
}
